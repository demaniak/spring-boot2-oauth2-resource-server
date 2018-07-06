package com.example.resourceserverwithoauth2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Secured {
	
	@GetMapping("/secured")
	public String get () {
		return "Ok, you got in";
	}
}
