package net.vidageek.autoweb.taglib;

import java.io.IOException;

import javax.servlet.jsp.JspException;

import net.vidageek.autoweb.taglib.core.ImgTagCore;
import net.vidageek.autoweb.taglib.support.TagEnvironment;

/**
 * @author jonasabreu
 * 
 */
final public class ImgTag extends AutowebSimpleTagSupport {

	private String url = "";
	private String altText = "";
	private String title;

	@Override
	public void doTag() throws JspException, IOException {
		new ImgTagCore(url, altText, title).applyTo(new TagEnvironment(this));
		url = "";
		altText = "";
		title = "";
	}

	public void setUrl(final String url) {
		this.url = url;
	}

	public void setAlt(final String altText) {
		this.altText = altText;
	}

	public void setTitle(final String title) {
		this.title = title;
	}
}
