package com.cg.capbook.services;
import java.util.List;
import com.cg.capbook.beans.Status;
import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.InvalidEmailException;
public interface StatusService{
	public Status saveStatus(Status status,UserProfile user) throws InvalidEmailException;
	public List<Status> getAllStatus();
}
