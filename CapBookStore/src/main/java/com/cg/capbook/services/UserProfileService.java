package com.cg.capbook.services;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.InvalidEmailException;
import com.cg.capbook.exceptions.InvalidPasswordException;

public interface UserProfileService {
	public  UserProfile registerUser(UserProfile user);
	public UserProfile loginUser(String emailId,String password)throws InvalidEmailException,InvalidPasswordException;
	//public UserProfile forgotPassword(String emailId,String securityQues,String securityAnswer)throws InvalidEmailException;
	public UserProfile getUserDetails(String emailId)throws InvalidEmailException;
}
