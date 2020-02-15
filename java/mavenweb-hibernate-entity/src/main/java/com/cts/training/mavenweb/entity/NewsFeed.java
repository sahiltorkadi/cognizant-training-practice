package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "NewsFeed")
public class NewsFeed {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Id // F_key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer mediaid;
	
	@Id // F_key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userid;
	
	@Column
	private String feed;
	
	@Column
	private LocalDateTime createdon;

	protected Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	protected Integer getMediaid() {
		return mediaid;
	}

	protected void setMediaid(Integer mediaid) {
		this.mediaid = mediaid;
	}

	protected Integer getUserid() {
		return userid;
	}

	protected void setUserid(Integer userid) {
		this.userid = userid;
	}

	protected String getFeed() {
		return feed;
	}

	protected void setFeed(String feed) {
		this.feed = feed;
	}

	protected LocalDateTime getCreatedon() {
		return createdon;
	}

	protected void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}

	@Override
	public String toString() {
		return "NewsFeed [id=" + id + ", mediaid=" + mediaid + ", userid=" + userid + ", feed=" + feed + ", createdon="
				+ createdon + "]";
	}




	

	
	
	
}	
	








