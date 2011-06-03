package net.vidageek.autoweb.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import net.vidageek.autoweb.taglib.core.CssTagCore;
import net.vidageek.autoweb.taglib.support.TagEnvironment;

/**
 * @author jonasabreu
 * 
 */
final public class CssTag extends AutowebSimpleTagSupport {

	private String url = "";

	@Override
	public void doTag() throws JspException, IOException {
		new CssTagCore(url).applyTo(new TagEnvironment(this));
		url = "";
	}

	public void setUrl(final String url) {
		this.url = url;
	}
}
