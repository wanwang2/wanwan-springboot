package hello.controller;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MeProcessor implements Processor {

	private static Logger log = LoggerFactory.getLogger(MeProcessor.class);
	
	@Override
	public void process(Exchange exchange) throws Exception {
		log.info("MeProcessor...");
	}

}
