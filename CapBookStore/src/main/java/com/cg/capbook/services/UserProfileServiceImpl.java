package com.cg.capbook.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.cg.capbook.beans.Address;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.daoservices.UserProfileDao;
import com.cg.capbook.exceptions.EmailAlreadyExistException;
import com.cg.capbook.exceptions.EmailNotPresentException;
import com.cg.capbook.exceptions.InvalidPasswordException;

@Component("userProfileService")
public class UserProfileServiceImpl implements UserProfileService{
	String pass,password;
	@Autowired
	private UserProfileDao userProfileDao;
	private static String UPLOADED_FOLDER = "C:\\Users\\ADM-IG-HWDLAB1D\\git\\CapBookLocalRepoTeam2\\CapBookStore\\src\\main\\resources\\static\\images\\";
	@Override
	public UserProfile registerUser(UserProfile user) throws EmailAlreadyExistException, EmailNotPresentException {
		if(findUserProfile(user.getEmailId())==null) {
		user.setAddress(new Address("", "", "", 0));
		 pass=user.getPassword();
	 password="";
		for(int i=0;i<pass.length();i++)
		{
			password+=""+(char)(pass.charAt(i)+2);
			password+=""+(char)(pass.charAt(i)+4);
		}
		user.setPassword(password);
		userProfileDao.save(user);
		}
		 else throw new EmailAlreadyExistException("Email exist");
		return user;
	}
	@Override
	public UserProfile loginUser(String emailId, String password) throws EmailNotPresentException, InvalidPasswordException {
		UserProfile user=userProfileDao.findById(emailId).orElseThrow(()->new EmailNotPresentException("User Not Present"));
		 pass=user.getPassword();
		String passwordCheck="";
		for(int i=0;i<password.length();i++)
		{
			passwordCheck+=""+(char)(password.charAt(i)+2);
			passwordCheck+=""+(char)(password.charAt(i)+4);
		}
		if(passwordCheck.equals(pass))
			return user;
		else throw new InvalidPasswordException("Password is Incorret");
	}
	@Override
	public UserProfile getUserDetails(String emailId) throws  EmailNotPresentException{
	UserProfile user=userProfileDao.findById(emailId).orElseThrow(()->new EmailNotPresentException("EmailId does not exist! Please signUp"));
	return user ;
	}
	@Override
	public UserProfile editUser(MultipartFile file,UserProfile user,String firstName,String lastName,String dob,String city,String state,String country,int zipCode) throws EmailNotPresentException {
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
		
		try {
	    	System.out.println("try strt");
            // Get the file and save it somewhere
            byte[] bytes = file.getBytes();
            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
            Files.write(path, bytes);
            System.out.println("Email---"+user.getEmailId());
            String imageUrl=""+"resources\\images\\"+file.getOriginalFilename();
            user.setProfilePic(imageUrl);
            return userProfileDao.save(user);
        } catch (IOException e) {
            e.printStackTrace();
        }
		return null;
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
	public UserProfile findUserProfile(String email) throws EmailNotPresentException {
		UserProfile user = userProfileDao.findUserByEmail(email);
		return user;
	}
}