/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 7, 2018
 */

package com.lmig.ci.pch.domain;

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
@Table(schema = "PCH", name = "PET_STATUS")
public class PetStatus {
	
	@Id
	@GeneratedValue
	private Integer petStatusId;    
	private String petStatus;
	
	
	/**
	 * @return the petStatusId
	 */
	public Integer getPetStatusId() {
		return petStatusId;
	}
	/**
	 * @param petStatusId the petStatusId to set
	 */
	public void setPetStatusId(Integer petStatusId) {
		this.petStatusId = petStatusId;
	}
	/**
	 * @return the petStatus
	 */
	public String getPetStatus() {
		return petStatus;
	}
	/**
	 * @param petStatus the petStatus to set
	 */
	public void setPetStatus(String petStatus) {
		this.petStatus = petStatus;
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
