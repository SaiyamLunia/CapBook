package com.cg.capbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.cg.capbook.beans.UserProfile;

@Controller
@SessionAttributes({"user","post"})
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

	@RequestMapping("/profileEditPage")
	public String getProfileEditPage() {
		return "profileEditPage";
	}
	@RequestMapping("/changePasswordPage")
	public String getChangePasswordPage() {
		return "changePasswordPage";
	}
	@RequestMapping("/profilePage")
	public String getProfilePage() {
		return "profilePage";
	}
	@RequestMapping("/logout")
	public String getlogoutPage(SessionStatus status) {
		status.setComplete();
		return "registration";
	}
	@ModelAttribute("user")
	public UserProfile getUser() {
		user= new UserProfile();
		return user;
	}
}
