package com.spring.sociallogin.controller;

import java.security.Principal;

import org.springframework.security.core.AuthenticatedPrincipal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	 
//	@RequestMapping("/api")
	
	@GetMapping("/home")
	public String home() {
		
		return "Hello, Home!";
	}
	
	@GetMapping("/secured")
	public String secured(@AuthenticationPrincipal OidcUser oidcUser) {
		
		return "Hello, " + oidcUser.getFullName();
	}
	
}
