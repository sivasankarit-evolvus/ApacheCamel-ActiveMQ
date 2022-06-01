package com.example.demo.routes.c;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("timer:active-mq-timer?period=10000")
		.transform().constant("My message for ActiveMQ")
		.log("{$body}")
		.to("activemq:my-activemq-queue");
		
	}

}
