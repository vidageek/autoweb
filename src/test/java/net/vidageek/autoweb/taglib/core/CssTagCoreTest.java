package net.vidageek.autoweb.taglib.core;

import static org.mockito.Matchers.contains;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import net.vidageek.autoweb.taglib.support.ResourceVersionIdHandler;
import net.vidageek.autoweb.taglib.support.TagEnvironment;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

/**
 * @author jonasabreu
 * 
 */
final public class CssTagCoreTest {

	@Mock
	public TagEnvironment env;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testThatAddsContextPath() {
		when(env.contextPath()).thenReturn("/context");

		new CssTagCore("").applyTo(env);

		verify(env).write(contains("/context"));
	}

	@Test
	public void testThatAddsResourceVersionToInvalidateCache() {

		new CssTagCore("").applyTo(env);

		verify(env).write(contains("autowebResourceVersion=" + ResourceVersionIdHandler.getId()));
	}

	@Test
	public void testThatCreatesCompleteCssTagWithSimpleUrl() {
		when(env.contextPath()).thenReturn("/");

		new CssTagCore("/css/test.css").applyTo(env);

		verify(env).write(	"<link href=\"/css/test.css?autowebResourceVersion=" + ResourceVersionIdHandler.getId()
									+ "\" rel=\"stylesheet\" type=\"text/css\" />");
	}

	@Test
	public void testThatCreatesCompleteCssTagWithComplexUrl() {
		when(env.contextPath()).thenReturn("/");

		new CssTagCore("/css/test.css?a=b").applyTo(env);

		verify(env).write(	"<link href=\"/css/test.css?a=b&autowebResourceVersion=" + ResourceVersionIdHandler.getId()
									+ "\" rel=\"stylesheet\" type=\"text/css\" />");
	}
}
