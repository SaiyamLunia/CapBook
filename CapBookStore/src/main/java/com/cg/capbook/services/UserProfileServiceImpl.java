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
	return user ;
	}
	@Override
	public UserProfile editUser(UserProfile user,String firstName,String lastName,String dob,String city,String state,String country,int zipCode) throws InvalidEmailException {
		user=getUserDetails(user.getEmailId());
		if(!firstName.equals(""))
			user.setFirstName(firstName);
		if(!lastName.equals(""))
			user.setLastName(lastName);
		if(!dob.equals(""))
			user.setDob(dob);
		if(!city.equals(""))
			user.getAddress().setCity(city);
		if(!state.equals(""))
			user.getAddress().setState(state);
		if(!country.equals(""))
			user.getAddress().setCountry(country);
		if(zipCode!=0)
			user.getAddress().setZipCode(zipCode);
		return userProfileDao.save(user);
	}
	@Override
	public String decryptPassword(String password) {
		String passwordDecrypt=password;
		String password1="";
		int i=0;
		while(i<passwordDecrypt.length())
		{
			password1+=""+(char)(passwordDecrypt.charAt(i)-2);
			i=i+2;
		}
		return password1;
	}
	@Override
	public void update(UserProfile user,String newPassword) {
		String passwordCheck="";
		for(int i=0;i<newPassword.length();i++)
		{
			passwordCheck+=""+(char)(newPassword.charAt(i)+2);
			passwordCheck+=""+(char)(newPassword.charAt(i)+4);
		}
		user.setPassword(passwordCheck);
		userProfileDao.save(user);
	}
}