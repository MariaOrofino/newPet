/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 7, 2018
 */

package com.lmig.ci.pch.domain;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author n0263892
 *
 */
@Entity
@Table(schema = "PCH", name = "LOCATION")
public class Loc {
	
	@Id
	@GeneratedValue
    private Integer locId;
    private BigDecimal locLat;
    private BigDecimal locLong;
	private String locName;
    private String locDesc;
    private String locState;
    private String locCity;
    private String locZip;
    private String locInd;
	/**
	 * @return the locId
	 */
	public Integer getLocId() {
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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((locCity == null) ? 0 : locCity.hashCode());
		result = prime * result + ((locDesc == null) ? 0 : locDesc.hashCode());
		result = prime * result + ((locId == null) ? 0 : locId.hashCode());
		result = prime * result + ((locInd == null) ? 0 : locInd.hashCode());
		result = prime * result + ((locLat == null) ? 0 : locLat.hashCode());
		result = prime * result + ((locLong == null) ? 0 : locLong.hashCode());
		result = prime * result + ((locName == null) ? 0 : locName.hashCode());
		result = prime * result + ((locState == null) ? 0 : locState.hashCode());
		result = prime * result + ((locZip == null) ? 0 : locZip.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Loc other = (Loc) obj;
		if (locCity == null) {
			if (other.locCity != null)
				return false;
		} else if (!locCity.equals(other.locCity))
			return false;
		if (locDesc == null) {
			if (other.locDesc != null)
				return false;
		} else if (!locDesc.equals(other.locDesc))
			return false;
		if (locId == null) {
			if (other.locId != null)
				return false;
		} else if (!locId.equals(other.locId))
			return false;
		if (locInd == null) {
			if (other.locInd != null)
				return false;
		} else if (!locInd.equals(other.locInd))
			return false;
		if (locLat == null) {
			if (other.locLat != null)
				return false;
		} else if (!locLat.equals(other.locLat))
			return false;
		if (locLong == null) {
			if (other.locLong != null)
				return false;
		} else if (!locLong.equals(other.locLong))
			return false;
		if (locName == null) {
			if (other.locName != null)
				return false;
		} else if (!locName.equals(other.locName))
			return false;
		if (locState == null) {
			if (other.locState != null)
				return false;
		} else if (!locState.equals(other.locState))
			return false;
		if (locZip == null) {
			if (other.locZip != null)
				return false;
		} else if (!locZip.equals(other.locZip))
			return false;
		return true;
	}

}
