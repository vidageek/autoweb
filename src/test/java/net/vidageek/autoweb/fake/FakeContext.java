package net.vidageek.autoweb.fake;

import java.util.Enumeration;

import javax.el.ELContext;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.el.ExpressionEvaluator;
import javax.servlet.jsp.el.VariableResolver;

/**
 * @author jonasabreu
 * 
 */
@SuppressWarnings("deprecation")
final public class FakeContext extends JspContext {

	@Override
	public void setAttribute(final String name, final Object value) {
	}

	@Override
	public void setAttribute(final String name, final Object value, final int scope) {
	}

	@Override
	public Object getAttribute(final String name) {
		return null;
	}

	@Override
	public Object getAttribute(final String name, final int scope) {
		return null;
	}

	@Override
	public Object findAttribute(final String name) {
		return null;
	}

	@Override
	public void removeAttribute(final String name) {
	}

	@Override
	public void removeAttribute(final String name, final int scope) {
	}

	@Override
	public int getAttributesScope(final String name) {
		return 0;
	}

	@Override
	public Enumeration<String> getAttributeNamesInScope(final int scope) {
		return null;
	}

	@Override
	public FakeWriter getOut() {
		return new FakeWriter();
	}

	@Override
	public ExpressionEvaluator getExpressionEvaluator() {
		return null;
	}

	@Override
	public VariableResolver getVariableResolver() {
		return null;
	}

	@Override
	public ELContext getELContext() {
		return null;
	}

}
