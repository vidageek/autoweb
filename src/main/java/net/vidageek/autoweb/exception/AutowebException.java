package net.vidageek.autoweb.exception;

/**
 * @author jonasabreu
 * 
 */
final public class AutowebException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public AutowebException(final String message, final Throwable e) {
		super(message, e);
	}

	public AutowebException(final String message) {
		super(message);
	}
}
