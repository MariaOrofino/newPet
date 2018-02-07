/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
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
 * @author n0129947
 *
 */
@Entity
@Table(schema = "PCH", name = "PET_TYPE")
public class PetType {

	@Id
	@GeneratedValue
	private Integer petTypeId;    
	private String petSpecies;    
    private Integer other;
    
    
	/**
	 * @return the petTypeId
	 */
	public Integer getPetTypeId() {
		return petTypeId;
	}
	/**
	 * @param petTypeId the petTypeId to set
	 */
	public void setPetTypeId(Integer petTypeId) {
		this.petTypeId = petTypeId;
	}
	/**
	 * @return the petSpecies
	 */
	public String getPetSpecies() {
		return petSpecies;
	}
	/**
	 * @param petSpecies the petSpecies to set
	 */
	public void setPetSpecies(String petSpecies) {
		this.petSpecies = petSpecies;
	}
	/**
	 * @return the other
	 */
	public Integer getOther() {
		return other;
	}
	/**
	 * @param other the other to set
	 */
	public void setOther(Integer other) {
		this.other = other;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((other == null) ? 0 : other.hashCode());
		result = prime * result + ((petSpecies == null) ? 0 : petSpecies.hashCode());
		result = prime * result + ((petTypeId == null) ? 0 : petTypeId.hashCode());
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
		PetType other = (PetType) obj;
		if (this.other == null) {
			if (other.other != null)
				return false;
		} else if (!this.other.equals(other.other))
			return false;
		if (petSpecies == null) {
			if (other.petSpecies != null)
				return false;
		} else if (!petSpecies.equals(other.petSpecies))
			return false;
		if (petTypeId == null) {
			if (other.petTypeId != null)
				return false;
		} else if (!petTypeId.equals(other.petTypeId))
			return false;
		return true;
	}    

	
}
