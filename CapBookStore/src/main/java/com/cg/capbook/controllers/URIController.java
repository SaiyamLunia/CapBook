package com.cg.capbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.capbook.beans.UserProfile;

@Controller
public class URIController {

	private UserProfile user;

	@RequestMapping("/")
	public String getRegistrationPage() {
		return "registration";
	}

	@RequestMapping("/forgotPasswordPage")
	public String getForgotPasswordPage() {
		return "forgotPasswordPage";
	}
	@ModelAttribute("user")
	public UserProfile getUser() {
		user= new UserProfile();
		return user;
	}
}
