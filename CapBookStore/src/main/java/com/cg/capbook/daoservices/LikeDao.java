package com.cg.capbook.daoservices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.capbook.beans.Likes;
public interface LikeDao extends JpaRepository<Likes, Integer>{

	@Query("select count(*) from Likes where like_count=1 and postId=:postId")
	public int getLikes(int postId);

}
