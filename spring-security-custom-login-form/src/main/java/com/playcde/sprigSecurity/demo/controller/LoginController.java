package com.playcde.sprigSecurity.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	@GetMapping("/loginpage")
	public String loginPage() {
		return "fancy-login";
	}

}
