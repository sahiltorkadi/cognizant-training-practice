package com.cts.training.mavenweb.entity;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Comments")
public class Comments {

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
	private String comment;
	
	@Column
	private LocalDateTime createdon;
	
	@Column
	private LocalDateTime updatedon;

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

	protected String getComment() {
		return comment;
	}

	protected void setComment(String comment) {
		this.comment = comment;
	}

	protected LocalDateTime getCreatedon() {
		return createdon;
	}

	protected void setCreatedon(LocalDateTime createdon) {
		this.createdon = createdon;
	}

	protected LocalDateTime getUpdatedon() {
		return updatedon;
	}

	protected void setUpdatedon(LocalDateTime updatedon) {
		this.updatedon = updatedon;
	}


	
	
	
}	
	








