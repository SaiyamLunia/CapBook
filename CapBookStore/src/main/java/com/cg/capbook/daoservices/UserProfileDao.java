package com.cg.capbook.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.EmailNotPresentException;

public interface UserProfileDao extends JpaRepository<UserProfile, String>{

	@Query("from UserProfile u where u.emailId=:emailId")
	public UserProfile findUserByEmail(@Param("emailId")String email)throws EmailNotPresentException;
	
}