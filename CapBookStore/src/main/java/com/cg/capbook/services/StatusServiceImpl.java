package com.cg.capbook.services;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.cg.capbook.beans.Image;
import com.cg.capbook.beans.Status;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.daoservices.StatusDao;
import com.cg.capbook.daoservices.UserProfileDao;
import com.cg.capbook.exceptions.EmailNotPresentException;

@Component("statusServices")
public class StatusServiceImpl implements StatusService {
	private static String UPLOADED_FOLDER = "C:\\Users\\ADM-IG-HWDLAB1D\\git\\CapBookLocalRepoTeam2\\CapBookStore\\src\\main\\resources\\static\\images\\";
	
	@Autowired
	private StatusDao statusDao;
	@Autowired
	private UserProfileDao userProfileDao;
	private Status status;
	
	@Override
	public Status saveStatus(Status status, UserProfile user,MultipartFile file) throws EmailNotPresentException {
		user=userProfileDao.findById(user.getEmailId()).orElseThrow(()->new EmailNotPresentException("EmailId is Invalid"));
		status.setUser(user);
		 try {
		    	System.out.println("try strt");
	            // Get the file and save it somewhere
	            byte[] bytes = file.getBytes();
	            Path path = Paths.get(UPLOADED_FOLDER + file.getOriginalFilename());
	            Files.write(path, bytes);
	            System.out.println("Email---"+user.getEmailId());
	            String imageUrl=""+"resources\\images\\"+file.getOriginalFilename();
	            status.setPostImage(imageUrl);
	             System.out.println("Image");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 status= statusDao.save(status);
		return status;
	}

	@Override
	public List<Status> getAllStatus() {
		
		  List<Status> post=statusDao.findAll();
		  Collections.sort(post,Collections.reverseOrder()); return post;
		 
		//return statusDao.findAll();
	}
}
