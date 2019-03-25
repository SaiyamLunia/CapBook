package com.cg.capbook.services;

import com.cg.capbook.beans.Image;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.NoImageFoundException;

public interface ImageService {
	public void addImage(String imageUrl,UserProfile user);
	public Image getImage(int imageId)throws NoImageFoundException;
}
