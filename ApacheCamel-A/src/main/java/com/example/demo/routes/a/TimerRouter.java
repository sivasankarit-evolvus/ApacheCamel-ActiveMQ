package com.example.demo.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class TimerRouter extends RouteBuilder {

	@Autowired
	private GetCurrentTime getCurrentTime;
	@Autowired
	private LoggingProcessComponent loggingProcessComponent;
	
	@Override
	public void configure() throws Exception {
		from("timer:first-timer")
		.log("${body}")
		.transform().constant("My Message")
		.log("${body}")
		//.transform().constant("Time now is" + LocalDateTime.now())
		//.bean("getCurrentTime")
		.bean(getCurrentTime,"currentTime")
		.log("${body}")
		.bean(loggingProcessComponent)
		.log("${body}")
		.process(new LoggingProcessor())
		.to("log:first-timer");
		
	}

}
