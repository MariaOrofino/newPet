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
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.apache.catalina.User;
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
//	@Column(name = "petID")    if not using JPA you would need this to reference your DB
    private Integer petId;
    private String petName;
    private String petDesc;
	private String petChipTag;
    private String petRabiesTag;
    private String petBreed;
    private String petSize;
    private String petColor;
    private String petImgURL;
    private LocalDate petCreateDate;
    private LocalDate petModifiedDate;
    private LocalDate petLostDate;
    private LocalDate petFoundDate;
    private LocalDate petSightedDate;
    private User user;
    private List loc;
    
    
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "PET_TYPE_ID", insertable=false, updatable=false)
//    private PetType petType;	
//	
//	@JoinColumn(name = "PET_STATUS_ID", insertable=false, updatable=false)
//    private PetStatus petStatus;	
    
    //TODO finish but start this off simple
	/**
	 * @return the petId
	 */
    
    
	/**
	 * @return the petId
	 */
	public Integer getPetId() {
		return petId;
	}
	/**
	 * @param petId the petId to set
	 */
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
	 * @param petName the petName to set
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
	 * @param petDesc the petDesc to set
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
	 * @param petChipTag the petChipTag to set
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
	 * @param petRabiesTag the petRabiesTag to set
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
	 * @param petBreed the petBreed to set
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
	 * @param petSize the petSize to set
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
	 * @param petColor the petColor to set
	 */
	public void setPetColor(String petColor) {
		this.petColor = petColor;
	}
	/**
	 * @return the petImgURL
	 */
	public String getPetImgURL() {
		return petImgURL;
	}
	/**
	 * @param petImgURL the petImgURL to set
	 */
	public void setPetImgURL(String petImgURL) {
		this.petImgURL = petImgURL;
	}
	/**
	 * @return the petCreateDate
	 */
	public LocalDate getPetCreateDate() {
		return petCreateDate;
	}
	/**
	 * @param petCreateDate the petCreateDate to set
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
	 * @param petModifiedDate the petModifiedDate to set
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
	 * @param petLostDate the petLostDate to set
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
	 * @param petFoundDate the petFoundDate to set
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
	 * @param petSightedDate the petSightedDate to set
	 */
	public void setPetSightedDate(LocalDate petSightedDate) {
		this.petSightedDate = petSightedDate;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the loc
	 */
	public List getLoc() {
		return loc;
	}
	/**
	 * @param loc the loc to set
	 */
	public void setLoc(List loc) {
		this.loc = loc;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((loc == null) ? 0 : loc.hashCode());
		result = prime * result + ((petBreed == null) ? 0 : petBreed.hashCode());
		result = prime * result + ((petChipTag == null) ? 0 : petChipTag.hashCode());
		result = prime * result + ((petColor == null) ? 0 : petColor.hashCode());
		result = prime * result + ((petCreateDate == null) ? 0 : petCreateDate.hashCode());
		result = prime * result + ((petDesc == null) ? 0 : petDesc.hashCode());
		result = prime * result + ((petFoundDate == null) ? 0 : petFoundDate.hashCode());
		result = prime * result + ((petId == null) ? 0 : petId.hashCode());
		result = prime * result + ((petImgURL == null) ? 0 : petImgURL.hashCode());
		result = prime * result + ((petLostDate == null) ? 0 : petLostDate.hashCode());
		result = prime * result + ((petModifiedDate == null) ? 0 : petModifiedDate.hashCode());
		result = prime * result + ((petName == null) ? 0 : petName.hashCode());
		result = prime * result + ((petRabiesTag == null) ? 0 : petRabiesTag.hashCode());
		result = prime * result + ((petSightedDate == null) ? 0 : petSightedDate.hashCode());
		result = prime * result + ((petSize == null) ? 0 : petSize.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Pet other = (Pet) obj;
		if (loc == null) {
			if (other.loc != null)
				return false;
		} else if (!loc.equals(other.loc))
			return false;
		if (petBreed == null) {
			if (other.petBreed != null)
				return false;
		} else if (!petBreed.equals(other.petBreed))
			return false;
		if (petChipTag == null) {
			if (other.petChipTag != null)
				return false;
		} else if (!petChipTag.equals(other.petChipTag))
			return false;
		if (petColor == null) {
			if (other.petColor != null)
				return false;
		} else if (!petColor.equals(other.petColor))
			return false;
		if (petCreateDate == null) {
			if (other.petCreateDate != null)
				return false;
		} else if (!petCreateDate.equals(other.petCreateDate))
			return false;
		if (petDesc == null) {
			if (other.petDesc != null)
				return false;
		} else if (!petDesc.equals(other.petDesc))
			return false;
		if (petFoundDate == null) {
			if (other.petFoundDate != null)
				return false;
		} else if (!petFoundDate.equals(other.petFoundDate))
			return false;
		if (petId == null) {
			if (other.petId != null)
				return false;
		} else if (!petId.equals(other.petId))
			return false;
		if (petImgURL == null) {
			if (other.petImgURL != null)
				return false;
		} else if (!petImgURL.equals(other.petImgURL))
			return false;
		if (petLostDate == null) {
			if (other.petLostDate != null)
				return false;
		} else if (!petLostDate.equals(other.petLostDate))
			return false;
		if (petModifiedDate == null) {
			if (other.petModifiedDate != null)
				return false;
		} else if (!petModifiedDate.equals(other.petModifiedDate))
			return false;
		if (petName == null) {
			if (other.petName != null)
				return false;
		} else if (!petName.equals(other.petName))
			return false;
		if (petRabiesTag == null) {
			if (other.petRabiesTag != null)
				return false;
		} else if (!petRabiesTag.equals(other.petRabiesTag))
			return false;
		if (petSightedDate == null) {
			if (other.petSightedDate != null)
				return false;
		} else if (!petSightedDate.equals(other.petSightedDate))
			return false;
		if (petSize == null) {
			if (other.petSize != null)
				return false;
		} else if (!petSize.equals(other.petSize))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
		

	
	
	
	
}
