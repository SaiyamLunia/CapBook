package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FriendRequest {
	@Id
	private int requestId;
	private String senderEmail;
	private String receiverEmail;
	private String requestStatus;
	
}
