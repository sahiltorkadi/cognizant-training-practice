package com.cts.training.mavenweb.entity;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Actions")
public class Actions {

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
	private boolean status;
	
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

	protected boolean isStatus() {
		return status;
	}

	protected void setStatus(boolean status) {
		this.status = status;
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

	@Override
	public String toString() {
		return "Actions [id=" + id + ", mediaid=" + mediaid + ", userid=" + userid + ", status=" + status
				+ ", createdon=" + createdon + ", updatedon=" + updatedon + "]";
	}
	

	

	
	
	
}	
	








