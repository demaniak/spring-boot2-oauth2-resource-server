package com.example.resourceserverwithoauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotSecure {
	
	@GetMapping("/notsecured")
	public String get () {
		return "Well..this is public..soo...bully for you";
	}
}
