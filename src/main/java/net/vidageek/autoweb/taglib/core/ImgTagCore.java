package net.vidageek.autoweb.taglib.core;

import net.vidageek.autoweb.taglib.support.ContextDependentPath;
import net.vidageek.autoweb.taglib.support.TagEnvironment;
import net.vidageek.autoweb.taglib.support.VersionedPath;

/**
 * @author jonasabreu
 * 
 */
final public class ImgTagCore implements AutowebSimpleTag {

	private final String altText;
	private final VersionedPath path;
	private final String title;

	public ImgTagCore(final String path, final String altText, final String title) {
		this.title = title;
		this.path = new VersionedPath(path);
		this.altText = altText;
	}

	public void applyTo(final TagEnvironment env) {
		env.write("<img src=\"" + new ContextDependentPath(path.toString(), env.contextPath()).toString() + "\" alt=\""
				+ altText + "\" title=\"" + title + "\" />");
	}
}
