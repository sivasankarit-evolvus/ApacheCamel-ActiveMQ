package com.example.demo.routes.a;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class GetCurrentTime {

	public String currentTime() {
		return "Time now is" + LocalDateTime.now();
	}
}
