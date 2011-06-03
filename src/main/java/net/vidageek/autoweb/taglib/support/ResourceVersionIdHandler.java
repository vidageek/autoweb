package net.vidageek.autoweb.taglib.support;

import org.apache.log4j.Logger;

/**
 * @author jonasabreu
 * 
 */
final public class ResourceVersionIdHandler {

	private final static Logger log = Logger.getLogger(ResourceVersionIdHandler.class);
	private final static long id = System.currentTimeMillis();

	static {
		log.info("Using resource version: [" + id + "]");
	}

	public static long getId() {
		return id;
	}

}
