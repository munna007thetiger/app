package com.prorigo.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeMsg {

	@GetMapping("welcome")
	public String wlcmsg() {
		return "welcome to Prorigo software";
	}
}
