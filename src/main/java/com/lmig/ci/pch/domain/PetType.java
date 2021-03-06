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
	
	@Column(name = "PET_SPEC")
	private String petSpecies;
	
	@Column(name = "DROP_DOWN_IND")
	private Boolean dropDownInd;

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
	 * @return the dropDownInd
	 */
	public Boolean getDropDownInd() {
		return dropDownInd;
	}

	/**
	 * @param dropDownInd the dropDownInd to set
	 */
	public void setDropDownInd(Boolean dropDownInd) {
		this.dropDownInd = dropDownInd;
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
