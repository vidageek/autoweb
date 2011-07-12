package net.vidageek.autoweb.taglib.support;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class ContextDependentPathTest {

	@Test
	public void testThatAddsContextPathToPath() {
		Assert.assertEquals("/context/path", new ContextDependentPath("/path", "/context").toString());
	}

	@Test
	public void testThatDoesNotAddsContextPathToPathIfPathIsForwardSlash() {
		Assert.assertEquals("/path", new ContextDependentPath("/path", "/").toString());
	}

}
