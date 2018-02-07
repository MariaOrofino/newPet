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
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((petStatus == null) ? 0 : petStatus.hashCode());
		result = prime * result + ((petStatusId == null) ? 0 : petStatusId.hashCode());
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
		PetStatus other = (PetStatus) obj;
		if (petStatus == null) {
			if (other.petStatus != null)
				return false;
		} else if (!petStatus.equals(other.petStatus))
			return false;
		if (petStatusId == null) {
			if (other.petStatusId != null)
				return false;
		} else if (!petStatusId.equals(other.petStatusId))
			return false;
		return true;
	} 
}
