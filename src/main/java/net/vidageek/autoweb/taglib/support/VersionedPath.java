package net.vidageek.autoweb.taglib.support;

/**
 * @author jonasabreu
 * 
 */
final public class VersionedPath {

	private final String path;

	public VersionedPath(final String path) {
		this.path = path;
	}

	@Override
	public String toString() {
		return path + (path.contains("?") ? "&" : "?") + "autowebResourceVersion=" + ResourceVersionIdHandler.getId();
	}
}
