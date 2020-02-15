package com.cts.training.mavenweb.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "BlockedUser")
public class BlockedUser {

	@Id // primary_key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer blockeduserid;
	
	@Id // F_key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;

	protected Integer getBlockeduserid() {
		return blockeduserid;
	}

	protected void setBlockeduserid(Integer blockeduserid) {
		this.blockeduserid = blockeduserid;
	}

	protected Integer getUserid() {
		return userid;
	}

	protected void setUserid(Integer userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "BlockedUser [blockeduserid=" + blockeduserid + ", userid=" + userid + "]";
	}

	

	
	
	
}	
	








