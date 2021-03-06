package net.vidageek.autoweb.taglib.core;

import net.vidageek.autoweb.taglib.support.ContextDependentPath;
import net.vidageek.autoweb.taglib.support.TagEnvironment;
import net.vidageek.autoweb.taglib.support.VersionedPath;

/**
 * @author jonasabreu
 * 
 */
final public class CssTagCore implements AutowebSimpleTag {

	private final VersionedPath path;

	public CssTagCore(final String path) {
		this.path = new VersionedPath(path);
	}

	public void applyTo(final TagEnvironment env) {
		env.write("<link href=\"" + new ContextDependentPath(path.toString(), env.contextPath()).toString()
				+ "\" rel=\"stylesheet\" type=\"text/css\" media=\"screen\" />");
	}

}
