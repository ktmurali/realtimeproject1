package com.nt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "WHUSER")
public class WhUserDataType {
 
	@Id
	@GeneratedValue(generator = "gen1")
	@GenericGenerator(strategy = "increment",name = "gen1")
	@Column(name = "UID",length = 1)
	@Type(type = "int")
	private Integer userId;
	@Column(name = "UTYPE",length = 1)
	@Type(type = "string")
	private String userType;
	@Column(name = "UCODE",length = 1)
	@Type(type = "string")
	private String userCode;
	@Column(name = "UPOR",length = 1)
	@Type(type = "string")
	private String userPor;
	@Column(name = "UMAIL",length = 1)
	@Type(type = "string")
	private String userMail;
	@Column(name = "UCONTACT",length = 1)
	@Type(type = "string")
	private String userContact;
	@Column(name = "UIDTYPE",length = 1)
	@Type(type = "string")
	private String userIdType;
	@Column(name = "UIDOTHER",length = 1)
	@Type(type = "string")
	private String userIdOther;
	@Column(name = "UNUMBER",length = 1)
	@Type(type = "string")
	private String userNumber;
	
	
	public WhUserDataType() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserPor() {
		return userPor;
	}
	public void setUserPor(String userPor) {
		this.userPor = userPor;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserContact() {
		return userContact;
	}
	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}
	public String getUserIdType() {
		return userIdType;
	}
	public void setUserIdType(String userIdType) {
		this.userIdType = userIdType;
	}
	public String getUserIdOther() {
		return userIdOther;
	}
	public void setUserIdOther(String userIdOther) {
		this.userIdOther = userIdOther;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	@Override
	public String toString() {
		return "WhUserDataType [userId=" + userId + ", userType=" + userType + ", userCode=" + userCode + ", userPor="
				+ userPor + ", userMail=" + userMail + ", userContact=" + userContact + ", userIdType=" + userIdType
				+ ", userIdOther=" + userIdOther + ", userNumber=" + userNumber + "]";
	}


}
