package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Image {
	@Id
	@GeneratedValue
	private int imageId;
	private String imageUrl;
	private String albumName;
	@ManyToOne
	private UserProfile user;
<<<<<<< HEAD
	public Image(String imageUrl, String albumName, UserProfile user) {
		super();
		this.imageUrl = imageUrl;
		this.albumName = albumName;
		this.user = user;
	}
	
	
=======
>>>>>>> branch 'master' of https://github.com/SaiyamLunia/CapBookRemoteRepoTeam2.git
}