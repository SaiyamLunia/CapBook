package com.cg.capbook.services;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.cg.capbook.beans.Status;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.EmailNotPresentException;
public interface StatusService{
	public Status saveStatus(Status status,UserProfile user,MultipartFile file) throws EmailNotPresentException;
	public List<Status> getAllStatus();
}
