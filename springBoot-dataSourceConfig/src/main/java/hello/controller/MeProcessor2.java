package hello.controller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeProcessor2 implements Processor {

	private static Logger log = LoggerFactory.getLogger(MeProcessor2.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("MeProcessor2...");
	}

}
