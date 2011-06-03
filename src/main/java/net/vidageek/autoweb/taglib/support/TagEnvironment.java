package net.vidageek.autoweb.taglib.support;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.PageContext;

import net.vidageek.autoweb.exception.AutowebException;
import net.vidageek.autoweb.taglib.AutowebSimpleTagSupport;

/**
 * @author jonasabreu
 * 
 */
public class TagEnvironment {

	private final AutowebSimpleTagSupport tagSupport;

	public TagEnvironment(final AutowebSimpleTagSupport tagSupport) {
		this.tagSupport = tagSupport;
	}

	public String contextPath() {
		final JspContext jspContext = tagSupport.getJspContext();
		if (!(jspContext instanceof PageContext)) {
			throw new AutowebException(
					"This JspContext should be an implementation of PageContext. Maybe wrong jsp-api version?");
		}
		PageContext context = (PageContext) jspContext;
		return ((HttpServletRequest) context.getRequest()).getContextPath();
	}

	public void write(final String content) {
		try {
			tagSupport.getJspContext().getOut().write(content);
		} catch (IOException e) {
			throw new AutowebException("Could not write output.", e);
		}
	}
}
