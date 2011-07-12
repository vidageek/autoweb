package net.vidageek.autoweb.taglib.support;

import net.vidageek.autoweb.taglib.support.ResourceVersionIdHandler;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jonasabreu
 * 
 */
final public class ResourceVersionIdHandlerTest {

	@Test
	public void testThatMultipleCallsReturnTheSameValue() {
		final long id = ResourceVersionIdHandler.getId();
		Assert.assertEquals(id, ResourceVersionIdHandler.getId());
		Assert.assertEquals(id, ResourceVersionIdHandler.getId());
		Assert.assertEquals(id, ResourceVersionIdHandler.getId());
		Assert.assertEquals(id, ResourceVersionIdHandler.getId());
		Assert.assertEquals(id, ResourceVersionIdHandler.getId());
	}

}
