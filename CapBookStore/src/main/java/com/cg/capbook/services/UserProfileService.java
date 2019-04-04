package com.cg.capbook.services;

import org.springframework.web.multipart.MultipartFile;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.EmailAlreadyExistException;
import com.cg.capbook.exceptions.EmailNotPresentException;
import com.cg.capbook.exceptions.InvalidPasswordException;

public interface UserProfileService {
	public  UserProfile registerUser(UserProfile user) throws EmailAlreadyExistException, EmailNotPresentException ;
	public UserProfile loginUser(String emailId,String password)throws EmailNotPresentException,InvalidPasswordException;
	//public UserProfile forgotPassword(String emailId,String securityQues,String securityAnswer)throws InvalidEmailException;
	public UserProfile getUserDetails(String emailId)throws EmailNotPresentException;
	public UserProfile editUser(MultipartFile file,UserProfile user,String firstName,String lastName,String dob,String city,String state,String country,int zipCode)throws EmailNotPresentException;
	public String decryptPassword(String password);
	public void update(UserProfile user, String newPassword);
}
