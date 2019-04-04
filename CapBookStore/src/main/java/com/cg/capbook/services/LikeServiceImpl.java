package com.cg.capbook.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.capbook.beans.Status;
import com.cg.capbook.daoservices.LikeDao;
@Component("likeService")
public class LikeServiceImpl implements LikeService {
	@Autowired
	private LikeDao likeDao;
	@Override
	public boolean updateLikes(Status post) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getLikeCount(Status post) {
		return likeDao.getLikes(post.getPostId());
	}

}
