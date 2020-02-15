package com.cts.training.mavenweb.entity;


import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.util.MimeType;

@Entity 
@Table(name = "Media")
public class Media {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Id // F_key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Userid;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private MimeType mediaupload;
	
	@Column
	private String posterfileurl;
	
	@Column
	private String fileurl;
	
	@Column
	private boolean hide;
	
	@CreationTimestamp
	@Column
	private LocalDateTime createdon;
	
	@UpdateTimestamp
	@Column
	private LocalDateTime updatedon;
	
	@Column
	private String tag;

	protected Integer getId() {
		return id;
	}

	protected void setId(Integer id) {
		this.id = id;
	}

	protected Integer getUserid() {
		return Userid;
	}

	protected void setUserid(Integer userid) {
		Userid = userid;
	}

	protected String getTitle() {
		return title;
	}

	protected void setTitle(String title) {
		this.title = title;
	}

	protected String getDescription() {
		return description;
	}

	protected void setDescription(String description) {
		this.description = description;
	}

	protected MimeType getMediaupload() {
		return mediaupload;
	}

	protected void setMediaupload(MimeType mediaupload) {
		this.mediaupload = mediaupload;
	}

	protected String getPosterfileurl() {
		return posterfileurl;
	}

	protected void setPosterfileurl(String posterfileurl) {
		this.posterfileurl = posterfileurl;
	}

	protected String getFileurl() {
		return fileurl;
	}

	protected void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	protected boolean isHide() {
		return hide;
	}

	protected void setHide(boolean hide) {
		this.hide = hide;
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

	protected String getTag() {
		return tag;
	}

	protected void setTag(String tag) {
		this.tag = tag;
	}
	

	
	
	
}	
	








