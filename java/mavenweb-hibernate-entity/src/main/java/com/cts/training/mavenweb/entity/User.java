package com.cts.training.mavenweb.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.util.MimeType;

@Entity 
@Table(name = "Users")
public class User {


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + ", firstname="
				+ firstname + ", lastname=" + lastname + ", dob=" + dob + ", profilepic=" + profilepic + ", createdon="
				+ createdon + ", updatedon=" + updatedon + "]";
	}

	@Id // primary key
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	@Column
	private String firstname ;

	@Column
	private String lastname;
	
	@Column
	private Date dob;
	
	@Column
	private MimeType profilepic;
	
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

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getPassword() {
		return password;
	}

	protected void setPassword(String password) {
		this.password = password;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getFirstname() {
		return firstname;
	}

	protected void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	protected String getLastname() {
		return lastname;
	}

	protected void setLastname(String lastname) {
		this.lastname = lastname;
	}

	protected Date getDob() {
		return dob;
	}

	protected void setDob(Date dob) {
		this.dob = dob;
	}

	protected MimeType getProfilepic() {
		return profilepic;
	}

	protected void setProfilepic(MimeType profilepic) {
		this.profilepic = profilepic;
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
	
	
	 
	