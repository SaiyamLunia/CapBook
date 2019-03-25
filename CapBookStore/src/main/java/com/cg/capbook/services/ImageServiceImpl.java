package com.cg.capbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.capbook.beans.Image;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.daoservices.ImageDao;
import com.cg.capbook.exceptions.NoImageFoundException;
@Component("imageService")
public class ImageServiceImpl implements ImageService{

	@Autowired
	public ImageDao imageDao;
	
	@Override
	public void addImage(String imageUrl, UserProfile user) {
		Image image=new Image(imageUrl, "default", user);
		imageDao.save(image);
		
	}

	@Override
	public Image getImage(int imageId) throws NoImageFoundException {
		Image image=imageDao.findById(imageId).orElseThrow(()-> new NoImageFoundException("df"));
		return image;
	}

}
