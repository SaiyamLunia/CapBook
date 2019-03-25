package com.cg.capbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
<<<<<<< HEAD

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
=======
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cg.capbook.beans.UserProfile;

@Controller
@SessionAttributes("user")
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
	@RequestMapping("/profileEdit")
	public String getProfilePage() {
		return "profileEditPage";
	}
	@RequestMapping("/profilePage")
	public String getProfileEditPage() {
		return "profileEditPage";
>>>>>>> branch 'master' of https://github.com/SaiyamLunia/CapBookRemoteRepoTeam2.git
	}
	@ModelAttribute("user")
	public UserProfile getUser() {
		user= new UserProfile();
		return user;
	}
}
