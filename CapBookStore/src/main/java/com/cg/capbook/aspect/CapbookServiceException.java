
package com.cg.capbook.aspect;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler; 
import org.springframework.web.servlet.ModelAndView;

import com.cg.capbook.exceptions.EmailAlreadyExistException;
import com.cg.capbook.exceptions.EmailNotPresentException; 
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.PasswordNotMatchException;
import com.cg.capbook.exceptions.WrongSecurityAnswerException;

@ControllerAdvice
public class CapbookServiceException {

	@ExceptionHandler(EmailNotPresentException.class)
	public ModelAndView handleEmailNotPresentException(Exception e) {
		return new ModelAndView("registration", "errorMessage", e.getMessage()); }

	@ExceptionHandler(InvalidPasswordException.class)
	public ModelAndView handleInvalidPasswordException(Exception e) { 
		return new ModelAndView("registration", "errorMessage", e.getMessage()); }

	@ExceptionHandler(WrongSecurityAnswerException.class)
	public ModelAndView handleWrongSecurityAnswerException(Exception e) { 
		return new ModelAndView("forgotPasswordPage", "errorMessage", e.getMessage()); }

	@ExceptionHandler(PasswordNotMatchException.class)
	public ModelAndView handlePasswordNotMatchException(Exception e) { 
		return new ModelAndView("changePasswordPage", "errorMessage", e.getMessage()); }
	
	@ExceptionHandler(EmailAlreadyExistException.class)
	public ModelAndView handleEmailAlreadyExistException(Exception e) { 
		return new ModelAndView("registration", "errorMessage1", e.getMessage()); }
}
