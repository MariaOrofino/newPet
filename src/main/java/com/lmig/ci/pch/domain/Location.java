/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 7, 2018
 */

package com.lmig.ci.pch.domain;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @author n0263892
 *
 */
@Entity
@Table(schema = "PCH", name = "LOCATION")
public class Location {
	
	@Id
	@GeneratedValue
    private Integer locId;
    private BigDecimal locLat;
    private BigDecimal locLong;
	private String locName;
    private String locDesc;
    
    @Column(columnDefinition="CHAR(2)")
    private String locState;
    private String locCity;
    private String locZip;
    
    @Column(columnDefinition="CHAR(1)")
    private String locInd;
    
	/**
	 * @return the locId
	 */
	public static Integer getLocId() {
		return locId;
	}
	/**
	 * @param locId the locId to set
	 */
	public void setLocId(Integer locId) {
		this.locId = locId;
	}
	/**
	 * @return the locLat
	 */
	public BigDecimal getLocLat() {
		return locLat;
	}
	/**
	 * @param locLat the locLat to set
	 */
	public void setLocLat(BigDecimal locLat) {
		this.locLat = locLat;
	}
	/**
	 * @return the locLong
	 */
	public BigDecimal getLocLong() {
		return locLong;
	}
	/**
	 * @param locLong the locLong to set
	 */
	public void setLocLong(BigDecimal locLong) {
		this.locLong = locLong;
	}
	/**
	 * @return the locName
	 */
	public String getLocName() {
		return locName;
	}
	/**
	 * @param locName the locName to set
	 */
	public void setLocName(String locName) {
		this.locName = locName;
	}
	/**
	 * @return the locDesc
	 */
	public String getLocDesc() {
		return locDesc;
	}
	/**
	 * @param locDesc the locDesc to set
	 */
	public void setLocDesc(String locDesc) {
		this.locDesc = locDesc;
	}
	/**
	 * @return the locState
	 */
	public String getLocState() {
		return locState;
	}
	/**
	 * @param locState the locState to set
	 */
	public void setLocState(String locState) {
		this.locState = locState;
	}
	/**
	 * @return the locCity
	 */
	public String getLocCity() {
		return locCity;
	}
	/**
	 * @param locCity the locCity to set
	 */
	public void setLocCity(String locCity) {
		this.locCity = locCity;
	}
	/**
	 * @return the locZip
	 */
	public String getLocZip() {
		return locZip;
	}
	/**
	 * @param locZip the locZip to set
	 */
	public void setLocZip(String locZip) {
		this.locZip = locZip;
	}
	/**
	 * @return the locInd
	 */
	public String getLocInd() {
		return locInd;
	}
	/**
	 * @param locInd the locInd to set
	 */
	public void setLocInd(String locInd) {
		this.locInd = locInd;
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
