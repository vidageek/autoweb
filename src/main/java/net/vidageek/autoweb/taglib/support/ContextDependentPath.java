package net.vidageek.autoweb.taglib.support;

/**
 * @author jonasabreu
 * 
 */
final public class ContextDependentPath {

	private final String path;
	private final String contextPath;

	public ContextDependentPath(final String path, final String contextPath) {
		this.path = path;
		this.contextPath = contextPath;
	}

	@Override
	public String toString() {
		return (contextPath == "/" ? "" : contextPath) + path;
	}
}
