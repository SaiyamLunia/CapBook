package com.cg.capbook.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class Status {
	@Id
	@GeneratedValue
	private int postId;
	private String postBody;

	@ManyToOne
	private UserProfile user;
	
	@OneToMany(mappedBy="post")
	@MapKey
	private List<Likes>likes;
	
	@OneToMany(mappedBy="post")
	@MapKey
	private List<Comments>comments;

	public Status() {}
	public Status(int postId, String postBody, UserProfile user, List<Likes> likes,
			List<Comments> comments) {
		super();
		this.postId = postId;
		this.postBody = postBody;

		this.user = user;
		this.likes = likes;
		this.comments = comments;
	}

	
	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostBody() {
		return postBody;
	}

	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}

	public UserProfile getUser() {
		return user;
	}

	public void setUser(UserProfile user) {
		this.user = user;
	}

	public List<Likes> getLikes() {
		return likes;
	}

	public void setLikes(List<Likes> likes) {
		this.likes = likes;
	}

	public List<Comments> getComments() {
		return comments;
	}

	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "Status [postId=" + postId + ", postBody=" + postBody + ", user=" + user + ", likes=" + likes
				+ ", comments=" + comments + "]";
	}
}
