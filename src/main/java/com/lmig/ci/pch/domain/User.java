/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 8, 2018
 */

package com.lmig.ci.pch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author N0135705
 *
 */
@Entity
@Table(schema = "PCH", name = "USER")
public class User {
	
	@Id
	@GeneratedValue
	private Integer userId;
	private String userFirstName;
	
//	@Column(name = "PET_SPEC")
	private String userLastName;	
	private String userLogin;
	private String userCity;
	
    @Column(columnDefinition="CHAR(2)")
	private String userState;
	private String userZip;

    @Column(columnDefinition="CHAR(10)")
	private String userMobile;
	private String userEmail;
	
    @Column(columnDefinition="CHAR(10)")
	private String userAltPhone;
	private String userAltEmail;
	private String userPassword;
	
	
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the userFirstName
	 */
	public String getUserFirstName() {
		return userFirstName;
	}
	/**
	 * @param userFirstName the userFirstName to set
	 */
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	/**
	 * @return the userLastName
	 */
	public String getUserLastName() {
		return userLastName;
	}
	/**
	 * @param userLastName the userLastName to set
	 */
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	/**
	 * @return the userLogin
	 */
	public String getUserLogin() {
		return userLogin;
	}
	/**
	 * @param userLogin the userLogin to set
	 */
	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}
	/**
	 * @return the userCity
	 */
	public String getUserCity() {
		return userCity;
	}
	/**
	 * @param userCity the userCity to set
	 */
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	/**
	 * @return the userState
	 */
	public String getUserState() {
		return userState;
	}
	/**
	 * @param userState the userState to set
	 */
	public void setUserState(String userState) {
		this.userState = userState;
	}
	/**
	 * @return the userZip
	 */
	public String getUserZip() {
		return userZip;
	}
	/**
	 * @param userZip the userZip to set
	 */
	public void setUserZip(String userZip) {
		this.userZip = userZip;
	}
	/**
	 * @return the userMobile
	 */
	public String getUserMobile() {
		return userMobile;
	}
	/**
	 * @param userMobile the userMobile to set
	 */
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/**
	 * @return the userAltPhone
	 */
	public String getUserAltPhone() {
		return userAltPhone;
	}
	/**
	 * @param userAltPhone the userAltPhone to set
	 */
	public void setUserAltPhone(String userAltPhone) {
		this.userAltPhone = userAltPhone;
	}
	/**
	 * @return the userAltEmail
	 */
	public String getUserAltEmail() {
		return userAltEmail;
	}
	/**
	 * @param userAltEmail the userAltEmail to set
	 */
	public void setUserAltEmail(String userAltEmail) {
		this.userAltEmail = userAltEmail;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.reflectionToString(this);
	}

	@Override
	public boolean equals(java.lang.Object o) {
		return EqualsBuilder.reflectionEquals(this, o);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	
	
	
}
