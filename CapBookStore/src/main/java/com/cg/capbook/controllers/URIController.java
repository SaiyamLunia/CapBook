package com.cg.capbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.capbook.beans.Account;

@Controller
public class URIController {
	
	@RequestMapping(value = {"/", "index"})
	public String getIndexPage() {
		return "indexPage";
	}
	@RequestMapping("/registration")
	public String getRegistrationPage() {
		return "registrationPage";
	}
	@RequestMapping("/login")
	public String getLoginPage() {
		return "loginPage";
	}
	@ModelAttribute
	public Account getAccount() {
		return new Account();
	}
}
