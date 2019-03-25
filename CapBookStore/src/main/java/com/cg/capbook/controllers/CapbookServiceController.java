package com.cg.capbook.controllers;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.InvalidEmailException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.WrongSecurityAnswerException;
import com.cg.capbook.services.UserProfileService;

@Controller
@SessionAttributes("user")
public class CapbookServiceController {
	private UserProfile user;
	@Autowired
	private UserProfileService userProfileService;
	
	@RequestMapping("/registrationForm")
	public ModelAndView registerUser(@ModelAttribute UserProfile user) {
		user=userProfileService.registerUser(user);
		return new ModelAndView("profilePage","user",user);
	}
	
	@RequestMapping("/login")
	public ModelAndView loginUser( @RequestParam String emailId, @RequestParam String password) throws InvalidEmailException, InvalidPasswordException {
=======
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.InvalidEmailException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.WrongSecurityAnswerException;
import com.cg.capbook.services.UserProfileService;

@Controller
@SessionAttributes("user")
public class CapbookServiceController {
	private UserProfile user;
	@Autowired
	private UserProfileService userProfileService;
	
	@RequestMapping("/registrationForm")
	public ModelAndView registerUser(@ModelAttribute UserProfile user) {
		user=userProfileService.registerUser(user);
		return new ModelAndView("profilePage","user",user);
	}
	
	@RequestMapping("/login")
	public ModelAndView loginUser(@RequestParam String emailId, @RequestParam String password, HttpSession session) throws InvalidEmailException, InvalidPasswordException {
>>>>>>> branch 'master' of https://github.com/SaiyamLunia/CapBookRemoteRepoTeam2.git
		user=userProfileService.loginUser(emailId, password);
		return new ModelAndView("profilePage","user",user);
	}
	
	@RequestMapping("/forgotPasswordSecurity")
	public ModelAndView forgotPasswordSecurityQues(@RequestParam String emailId) throws InvalidEmailException {
		user=userProfileService.getUserDetails(emailId);
		
		return new ModelAndView("forgotPasswordPage","user",user);
	}
	@RequestMapping("/forgotPassword")
	public ModelAndView forgotPassword(@RequestParam String securityAnswer,@RequestParam String emailId) throws InvalidEmailException, WrongSecurityAnswerException {
		user=userProfileService.getUserDetails(emailId);
		String answer=user.getSecurityAnswer();
		if(answer.equals(securityAnswer))
			
		{
			String password=user.getPassword();
			return new ModelAndView("forgotPasswordPage","password",password);
		}
		else throw new WrongSecurityAnswerException("Answer is incorrect");
		
	}
}
