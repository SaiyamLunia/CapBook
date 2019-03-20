package com.cg.capbook.controllers;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.cg.capbook.beans.Account;
import com.cg.capbook.services.CapBookService;

@Controller
public class CapbookServiceController {
	
	@Autowired
	CapBookService capBookServices;
	
	@RequestMapping("/registerAccount")
	public ModelAndView registerAssociate(@Valid@ModelAttribute Account account, BindingResult result) {
		if(result.hasErrors()) return new ModelAndView("registrationPage");
			account=capBookServices.acceptAccountDetails(account);
		return new ModelAndView("registrationSuccessPage","account",account);
	}
	
	@RequestMapping("/loginAccount")
	public ModelAndView loginAccount(@RequestParam String emailID, String password) {
		password=capBookServices.encryptPassword(password);
		Account account=capBookServices.findAccountDetails(emailID);
		System.out.println("pass-0-"+password);
		if(password.equals(account.getPassword()))
			return new ModelAndView("loginHomePage","account",account);
		return null;
		
	}
}
