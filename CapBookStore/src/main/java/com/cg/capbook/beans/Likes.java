package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Likes {
	@Id
	@GeneratedValue
	private int likeId;
	private String likedBy;
	private int count;
	@ManyToOne
	private Status post;
	public Likes() {}
	public Likes(int likeId, String likedBy, int count, Status post) {
		super();
		this.likeId = likeId;
		this.likedBy = likedBy;
		this.count = count;
		this.post = post;
	}
	
	public Likes(String likedBy, int count, Status post) {
		super();
		this.likedBy = likedBy;
		this.count = count;
		this.post = post;
	}
	public int getLikeId() {
		return likeId;
	}
	public void setLikeId(int likeId) {
		this.likeId = likeId;
	}
	public String getLikedBy() {
		return likedBy;
	}
	public void setLikedBy(String likedBy) {
		this.likedBy = likedBy;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Status getPost() {
		return post;
	}
	public void setPost(Status post) {
		this.post = post;
	}
	@Override
	public String toString() {
		return "Likes [likeId=" + likeId + ", likedBy=" + likedBy + ", count=" + count + ", post=" + post + "]";
	}
}
