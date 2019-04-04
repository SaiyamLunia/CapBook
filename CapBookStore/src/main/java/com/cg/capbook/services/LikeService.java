package com.cg.capbook.services;

import com.cg.capbook.beans.Status;

public interface LikeService  {
	boolean updateLikes(Status post);
	int getLikeCount(Status post);
}
