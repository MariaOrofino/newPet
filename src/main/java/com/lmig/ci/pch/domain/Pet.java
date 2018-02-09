/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import antlr.collections.List;

/**
 * @author n0129947
 *
 */
@Entity
@Table(schema = "PCH", name = "PET")
public class Pet {

	@Id
	@GeneratedValue
	private Integer petId;
	private String petName;
	private String petDesc;
	private String petChipTag;
	private String petRabiesTag;
	private String petBreed;
	private String petSize;
	private String petColor;

	@Column(name = "PET_IMG_URL") // if not using JPA to database naming
									// standards you would need this to
									// reference your DB column name
	private String petImgUrl;
	private LocalDate petCreateDate;
	private LocalDate petModifiedDate;
	private LocalDate petLostDate;
	private LocalDate petFoundDate;
	private LocalDate petSightedDate;

	// @OneToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "LOC_ID")
	// private List LOCATION;

	// @ManyToOne(fetch = FetchType.EAGER)
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PET_TYPE_ID")
	private PetType petType;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_ID")
	private User user;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PET_STATUS_ID")
	private PetStatus petStatus;

	// public List getLOCATION() {
	// return LOCATION;
	// }
	//
	//
	// public void setLOCATION(List lOCATION) {
	// LOCATION = lOCATION;
	// }

	public Integer getPetId() {
		return petId;
	}

	/**
	 * @return the petStatus
	 */
	public PetStatus getPetStatus() {
		return petStatus;
	}

	/**
	 * @param petStatus
	 *            the petStatus to set
	 */
	public void setPetStatus(PetStatus petStatus) {
		this.petStatus = petStatus;
	}

	public void setPetId(Integer petId) {
		this.petId = petId;
	}

	/**
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}

	/**
	 * @param petName
	 *            the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}

	/**
	 * @return the petDesc
	 */
	public String getPetDesc() {
		return petDesc;
	}

	/**
	 * @param petDesc
	 *            the petDesc to set
	 */
	public void setPetDesc(String petDesc) {
		this.petDesc = petDesc;
	}

	/**
	 * @return the petChipTag
	 */
	public String getPetChipTag() {
		return petChipTag;
	}

	/**
	 * @param petChipTag
	 *            the petChipTag to set
	 */
	public void setPetChipTag(String petChipTag) {
		this.petChipTag = petChipTag;
	}

	/**
	 * @return the petRabiesTag
	 */
	public String getPetRabiesTag() {
		return petRabiesTag;
	}

	/**
	 * @param petRabiesTag
	 *            the petRabiesTag to set
	 */
	public void setPetRabiesTag(String petRabiesTag) {
		this.petRabiesTag = petRabiesTag;
	}

	/**
	 * @return the petBreed
	 */
	public String getPetBreed() {
		return petBreed;
	}

	/**
	 * @param petBreed
	 *            the petBreed to set
	 */
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	/**
	 * @return the petSize
	 */
	public String getPetSize() {
		return petSize;
	}

	/**
	 * @param petSize
	 *            the petSize to set
	 */
	public void setPetSize(String petSize) {
		this.petSize = petSize;
	}

	/**
	 * @return the petColor
	 */
	public String getPetColor() {
		return petColor;
	}

	/**
	 * @param petColor
	 *            the petColor to set
	 */
	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}

	/**
	 * @return the petImgUrl
	 */
	public String getPetImgUrl() {
		return petImgUrl;
	}

	/**
	 * @param petImgUrl
	 *            the petImgUrl to set
	 */
	public void setPetImgUrl(String petImgUrl) {
		this.petImgUrl = petImgUrl;
	}

	/**
	 * @return the petCreateDate
	 */
	public LocalDate getPetCreateDate() {
		return petCreateDate;
	}

	/**
	 * @param petCreateDate
	 *            the petCreateDate to set
	 */
	public void setPetCreateDate(LocalDate petCreateDate) {
		this.petCreateDate = petCreateDate;
	}

	/**
	 * @return the petModifiedDate
	 */
	public LocalDate getPetModifiedDate() {
		return petModifiedDate;
	}

	/**
	 * @param petModifiedDate
	 *            the petModifiedDate to set
	 */
	public void setPetModifiedDate(LocalDate petModifiedDate) {
		this.petModifiedDate = petModifiedDate;
	}

	/**
	 * @return the petLostDate
	 */
	public LocalDate getPetLostDate() {
		return petLostDate;
	}

	/**
	 * @param petLostDate
	 *            the petLostDate to set
	 */
	public void setPetLostDate(LocalDate petLostDate) {
		this.petLostDate = petLostDate;
	}

	/**
	 * @return the petFoundDate
	 */
	public LocalDate getPetFoundDate() {
		return petFoundDate;
	}

	/**
	 * @param petFoundDate
	 *            the petFoundDate to set
	 */
	public void setPetFoundDate(LocalDate petFoundDate) {
		this.petFoundDate = petFoundDate;
	}

	/**
	 * @return the petSightedDate
	 */
	public LocalDate getPetSightedDate() {
		return petSightedDate;
	}

	/**
	 * @param petSightedDate
	 *            the petSightedDate to set
	 */
	public void setPetSightedDate(LocalDate petSightedDate) {
		this.petSightedDate = petSightedDate;
	}
	// /**
	// * @return the user
	// */
	// public User getUser() {
	// return user;
	// }
	// /**
	// * @param user the user to set
	// */
	// public void setUser(User user) {
	// this.user = user;
	// }
	// /**
	// * @return the loc
	// */
	// public List getLoc() {
	// return loc;
	// }
	// /**
	// * @param loc the loc to set
	// */
	// public void setLoc(List loc) {
	// this.loc = loc;
	// }

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	// the following 3 overrides are all that is needed for hashes and equals.
	// DO NOT auto generate hashes & equals
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
