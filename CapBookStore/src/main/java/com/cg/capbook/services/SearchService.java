package com.cg.capbook.services;
import java.util.List;
import com.cg.capbook.beans.UserProfile;

public interface SearchService {
	public List<UserProfile> getUserProfile(String username);
	public List<UserProfile> getAllUserNames();
}
