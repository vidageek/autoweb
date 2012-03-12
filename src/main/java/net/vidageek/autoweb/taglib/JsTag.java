package net.vidageek.autoweb.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import net.vidageek.autoweb.taglib.core.JsTagCore;
import net.vidageek.autoweb.taglib.support.TagEnvironment;

final public class JsTag extends AutowebSimpleTagSupport {

	private String url = "";

	@Override
	public void doTag() throws JspException, IOException {
		new JsTagCore(url).applyTo(new TagEnvironment(this));
		url = "";
	}

	public void setUrl(final String url) {
		this.url = url;
	}

}
