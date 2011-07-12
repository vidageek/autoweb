package net.vidageek.autoweb.taglib.support;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class VersionedPathTest {

	@Test
	public void testThatAddsResourceVersionToSimplePath() {
		Assert.assertEquals("/simple/path" + "?autowebResourceVersion=" + ResourceVersionIdHandler.getId(),
							new VersionedPath("/simple/path").toString());
	}

	@Test
	public void testThatAddsResourceVersionToComplexPath() {
		Assert.assertEquals("/complex/path?a=b" + "&autowebResourceVersion=" + ResourceVersionIdHandler.getId(),
							new VersionedPath("/complex/path?a=b").toString());
	}

}
