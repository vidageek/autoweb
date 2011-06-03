package net.vidageek.autoweb.taglib.core;

import net.vidageek.autoweb.taglib.support.ResourceVersionIdHandler;
import net.vidageek.autoweb.taglib.support.TagEnvironment;

/**
 * @author jonasabreu
 * 
 */
final public class CssTagCore implements AutowebSimpleTag {

	private final String path;

	public CssTagCore(final String path) {
		this.path = addResourceParameter(path);
	}

	public void applyTo(final TagEnvironment env) {

		env.write("<link href=\"" + (env.contextPath() == "/" ? "" : env.contextPath()) + path
				+ "\" rel=\"stylesheet\" type=\"text/css\" />");
	}

	private String addResourceParameter(String path) {
		path += path.contains("?") ? "&" : "?";
		return path + "autowebResourceVersion=" + ResourceVersionIdHandler.getId();
	}

}
