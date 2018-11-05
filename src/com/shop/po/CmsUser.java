package com.shop.po;
// Generated 2018-9-26 17:58:28 by Hibernate Tools 5.3.0.Beta2

import java.util.Date;

/**
 * CmsUser generated by hbm2java
 */
public class CmsUser implements java.io.Serializable {

	private Long userId;
	private String loginName;
	private String loginPassword;
	private String salt;
	private String userName;
	private String realName;
	private Integer sex;
	private Byte age;
	private String picImg;
	private Integer status;
	private String email;
	private String telephone;
	private Date createTime;
	private Date updateTime;

	public CmsUser() {
	}

	public CmsUser(String loginName, String loginPassword, String salt, String userName, String realName, Integer sex,
			Byte age, String picImg, Integer status, String email, String telephone, Date createTime, Date updateTime) {
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.salt = salt;
		this.userName = userName;
		this.realName = realName;
		this.sex = sex;
		this.age = age;
		this.picImg = picImg;
		this.status = status;
		this.email = email;
		this.telephone = telephone;
		this.createTime = createTime;
		this.updateTime = updateTime;
	}

	public Long getUserId() {
		return this.userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRealName() {
		return this.realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public Integer getSex() {
		return this.sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Byte getAge() {
		return this.age;
	}

	public void setAge(Byte age) {
		this.age = age;
	}

	public String getPicImg() {
		return this.picImg;
	}

	public void setPicImg(String picImg) {
		this.picImg = picImg;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}