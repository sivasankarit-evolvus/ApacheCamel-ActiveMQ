package com.example.demo.routes.a;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingProcessor implements Processor{

	private Logger logger = LoggerFactory.getLogger(LoggingProcessComponent.class);
	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("LoggingProcessor {} ", exchange);
		logger.info("LoggingProcessor {} ", exchange.getMessage().getBody());
	}

}
