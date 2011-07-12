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
final public class ImgTagCoreTest {

	@Mock
	public TagEnvironment env;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testThatAddsContextPath() {
		when(env.contextPath()).thenReturn("/context");

		new ImgTagCore("", "", "").applyTo(env);

		verify(env).write(contains("/context"));
	}

	@Test
	public void testThatAddsResourceVersionToInvalidateCache() {

		new ImgTagCore("", "", "").applyTo(env);

		verify(env).write(contains("autowebResourceVersion=" + ResourceVersionIdHandler.getId()));
	}

	@Test
	public void testThatCreatesCompleteCssTagWithSimpleUrl() {
		when(env.contextPath()).thenReturn("/");

		new ImgTagCore("/img/test.png", "", "").applyTo(env);

		verify(env).write(	"<img src=\"/img/test.png?autowebResourceVersion=" + ResourceVersionIdHandler.getId()
									+ "\" alt=\"\" title=\"\" />");
	}

	@Test
	public void testThatCreatesCompleteCssTagWithComplexUrl() {
		when(env.contextPath()).thenReturn("/");

		new ImgTagCore("/img/test.png?a=b", "", "").applyTo(env);

		verify(env).write(	"<img src=\"/img/test.png?a=b&autowebResourceVersion=" + ResourceVersionIdHandler.getId()
									+ "\" alt=\"\" title=\"\" />");
	}

	@Test
	public void testThatCreatesCompleteCssTagWithComplexUrlAndAlternativeText() {
		when(env.contextPath()).thenReturn("/");

		new ImgTagCore("/img/test.png?a=b", "alt text", "").applyTo(env);

		verify(env).write(	"<img src=\"/img/test.png?a=b&autowebResourceVersion=" + ResourceVersionIdHandler.getId()
									+ "\" alt=\"alt text\" title=\"\" />");
	}

	@Test
	public void testThatCreatesCompleteCssTagWithComplexUrlAlternativeTextAndTitle() {
		when(env.contextPath()).thenReturn("/");

		new ImgTagCore("/img/test.png?a=b", "alt text", "Title").applyTo(env);

		verify(env).write(	"<img src=\"/img/test.png?a=b&autowebResourceVersion=" + ResourceVersionIdHandler.getId()
									+ "\" alt=\"alt text\" title=\"Title\" />");
	}

}
