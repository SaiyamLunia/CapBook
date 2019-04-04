package com.cg.capbook.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capbook.beans.Image;
import com.cg.capbook.beans.Status;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.EmailAlreadyExistException;
import com.cg.capbook.exceptions.EmailNotPresentException;
import com.cg.capbook.exceptions.InvalidPasswordException;
import com.cg.capbook.exceptions.PasswordNotMatchException;
import com.cg.capbook.exceptions.WrongSecurityAnswerException;
import com.cg.capbook.services.ImageService;
import com.cg.capbook.services.SearchService;
import com.cg.capbook.services.StatusService;
import com.cg.capbook.services.UserProfileService;

@Controller
@SessionAttributes({"user"})

public class CapbookServiceController {
	private UserProfile user;
	private Status status;
	@Autowired
	private UserProfileService userProfileService;
	@Autowired
	private SearchService searchService;
	@Autowired
	private ImageService imageService;
	@Autowired
	private StatusService statusService;
	
	@RequestMapping("/registrationForm")
	public ModelAndView registerUser(@ModelAttribute UserProfile user) throws EmailAlreadyExistException, EmailNotPresentException {
		user=userProfileService.registerUser(user);
		return new ModelAndView("profilePage","user",user);
	}
	
	@RequestMapping("/login")
	public ModelAndView loginUser(@RequestParam String emailId, @RequestParam String password, @SessionAttribute("user") UserProfile user) throws EmailNotPresentException, InvalidPasswordException {
		user=userProfileService.loginUser(emailId, password);
		return new ModelAndView("profilePage","user",user);
	}
	
	@RequestMapping("/forgotPasswordSecurity")
	public ModelAndView forgotPasswordSecurityQues(@RequestParam String emailId) throws EmailNotPresentException {
		user=userProfileService.getUserDetails(emailId);
		return new ModelAndView("forgotPasswordPage","user",user);
	}
	@RequestMapping("/forgotPassword")
	public ModelAndView forgotPassword(@RequestParam String securityAnswer,@RequestParam String emailId) throws EmailNotPresentException, WrongSecurityAnswerException {
		user=userProfileService.getUserDetails(emailId);
		String answer=user.getSecurityAnswer();
		if(answer.equals(securityAnswer))
		{
			String password=user.getPassword();
			String passwordDecrypt=userProfileService.decryptPassword(password);
			return new ModelAndView("forgotPasswordPage","password",passwordDecrypt);
		}
		else throw new WrongSecurityAnswerException("Answer is incorrect");
		
	}
	
	@RequestMapping("/searchUser")
	public ModelAndView searchUser(@RequestParam String username) {
		List<UserProfile> userList=searchService.getUserProfile(username);
		return new ModelAndView("searchUserListPage","userList",userList);
	}
	@RequestMapping("/profileEdit")
	public ModelAndView editUser(@RequestParam("file") MultipartFile file,@RequestParam String firstName,@RequestParam String lastName,@RequestParam String dob,@RequestParam String city,@RequestParam String state,@RequestParam String country,@RequestParam int zipCode,@SessionAttribute("user") UserProfile user) throws EmailNotPresentException, InvalidPasswordException {
		user=userProfileService.editUser(file,user,firstName,lastName,dob,city,state,country,zipCode);
		return new ModelAndView("profilePage","user",user);
	}
	@RequestMapping("/changePassword")
	public ModelAndView changePassword(@RequestParam String password,@RequestParam String newPassword,@RequestParam String 	confirmNewPassword,@SessionAttribute("user") UserProfile user) throws InvalidPasswordException {
		System.out.println("******************************");
		System.out.println(user.getPassword());
		String answer=userProfileService.decryptPassword(user.getPassword());
		System.out.println("\n\n"+answer);
		if(answer.equals(password)) {
			if(userProfileService.decryptPassword(newPassword).equals(userProfileService.decryptPassword(confirmNewPassword))) {
//				user.setPassword(newPassword);
				userProfileService.update(user,newPassword);
				return new ModelAndView("profilePage");
			}
			else throw new PasswordNotMatchException("New Password and Confirm Password Did not Match");
		}
		else throw new PasswordNotMatchException("Password is incorrect");
	}
	@RequestMapping("/uploadStatus")
	public ModelAndView uploadStatus(@RequestParam String postBody, MultipartFile file,@SessionAttribute("user") UserProfile user) throws EmailNotPresentException {
		Status status=new Status();
//		status.setUser(user);
		status.setPostBody(postBody);
		status=statusService.saveStatus(status,user,file);
		List<Status> userStatus=user.getPosts();
		userStatus.add(status);
		user.setPosts(userStatus);	
		//List<Status>statuses=statusService.getAllStatus();
		
		Image image=imageService.addImage(file, user);
		return new ModelAndView("profilePage","image",image);
	}
	
	@RequestMapping("/showStatus")
	public ModelAndView showStatus(@SessionAttribute("user") UserProfile user) throws EmailNotPresentException {
			
		List<Status>statuses=statusService.getAllStatus();
		return new ModelAndView("profilePage","status",statuses);
	}
}










