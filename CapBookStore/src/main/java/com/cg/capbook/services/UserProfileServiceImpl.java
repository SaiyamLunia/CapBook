package com.cg.capbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.daoservices.UserProfileDao;
import com.cg.capbook.exceptions.InvalidEmailException;
import com.cg.capbook.exceptions.InvalidPasswordException;

@Component("userProfileService")
public class UserProfileServiceImpl implements UserProfileService{
	String pass,password;
	@Autowired
	private UserProfileDao userProfileDao;
	@Override
	public UserProfile registerUser(UserProfile user) {
		 pass=user.getPassword();
	 password="";
		for(int i=0;i<pass.length();i++)
		{
			password+=""+(char)(pass.charAt(i)+2);
			password+=""+(char)(pass.charAt(i)+4);
		}
		user.setPassword(password);
		userProfileDao.save(user);
		return user;
	}
	@Override
	public UserProfile loginUser(String emailId, String password) throws InvalidEmailException, InvalidPasswordException {
		UserProfile user=userProfileDao.findById(emailId).orElseThrow(()->new InvalidEmailException("Email Id is Incorrect"));
		 pass=user.getPassword();
		String passwordCheck="";
		for(int i=0;i<password.length();i++)
		{
			passwordCheck+=""+(char)(password.charAt(i)+2);
			passwordCheck+=""+(char)(password.charAt(i)+4);
		}
		if(passwordCheck.equals(pass))
			return user;
		else throw new InvalidPasswordException("Password is not correct");
	}
	@Override
	public UserProfile getUserDetails(String emailId) throws InvalidEmailException {
	UserProfile user=userProfileDao.findById(emailId).orElseThrow(()->new InvalidEmailException("EmailId is Invalid"));
	String passwordDecrypt=user.getPassword();
	String password="";
	int i=0;
	while(i<passwordDecrypt.length())
	{
		password+=""+(char)(passwordDecrypt.charAt(i)-2);
		i=i+2;
	}
	user.setPassword(password);
	return user ;
	}
}
