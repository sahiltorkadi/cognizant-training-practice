package com.cts.training.mavenweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Followings")
public class Followings {

	@Id // F_key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer followerid;
	
	@Id // primary_key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;

	protected Integer getFollowerid() {
		return followerid;
	}

	protected void setFollowerid(Integer followerid) {
		this.followerid = followerid;
	}

	protected Integer getUserid() {
		return userid;
	}

	protected void setUserid(Integer userid) {
		this.userid = userid;
	}
	


	
	
	
}	
	








