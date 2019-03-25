package com.cg.capbook.daoservices;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cg.capbook.beans.UserProfile;
public interface SearchDao extends JpaRepository<UserProfile, String>{

}
