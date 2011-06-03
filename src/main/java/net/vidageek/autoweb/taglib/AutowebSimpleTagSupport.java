package net.vidageek.autoweb.taglib;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author jonasabreu
 * 
 */
public class AutowebSimpleTagSupport extends SimpleTagSupport {

	@Override
	public JspFragment getJspBody() {
		return super.getJspBody();
	}

	@Override
	public JspContext getJspContext() {
		return super.getJspContext();
	}

}
