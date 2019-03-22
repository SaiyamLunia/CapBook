package com.cg.capbook.controllers;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
public class CapbookServiceController extends HttpServlet{
	
	@Autowired
	CapBookService capBookServices;
	HttpServletRequest request;
	HttpServletResponse response;
	HttpSession session;
	
	@RequestMapping("/registerAccount")
	public ModelAndView registerAssociate(@Valid@ModelAttribute Account account, BindingResult result) {
		if(result.hasErrors()) return new ModelAndView("registrationPage");
			account=capBookServices.acceptAccountDetails(account);
		return new ModelAndView("registrationSuccessPage","account",account);
	}
	
	@RequestMapping("/loginAccount")
	public ModelAndView loginAccount(@RequestParam String emailID, String password){
		password=capBookServices.encryptPassword(password);
		Account account=capBookServices.findAccountDetails(emailID);
		if(password.equals(account.getPassword())) {
//			session=request.getSession();  
//		    session.setAttribute("email",account.getEmailID());
			return new ModelAndView("profilePage","account",account);
		}
			return null;
	}
	
	@RequestMapping("/logoutAccount")
	public ModelAndView logoutAccount() {
		session.invalidate();
		return new ModelAndView("loginPage");
	}
}
