/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author n0129947
 *
 */
@Entity
@Table(schema = "PCH", name = "PET")
public class Pet {

	@Id
	@GeneratedValue
	@Column(name = "petid")
    private Integer petId;

	@Column(name = "petname")
    private String petName;
//    private String petDesc;
//    private String petChipTag;
//    private String PetRabiesTag;
//    private String petBreed;
//    private String petSize;
//    private String petColor;
//    private String petImgURL;
//    private LocalDate petCreateDate;
//    private LocalDate petModifiedDate;
//    private LocalDate petLostDate;
//    private LocalDate petFoundDate;
//    private LocalDate petSightedDate;
//    private User user;
//    private List<Loc> loc;
//    private PetStatus petStatus;
	@Column(name = "pettypeid")
	private Integer petTypeId;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pettypeid", insertable=false, updatable=false)
    private PetType petType;
    
    //TODO finish but start this off simple
    
    
	public Integer getPetId() {
		return petId;
	}
	public void setPetId(Integer petId) {
		this.petId = petId;
	}
	public String getPetName() {
		return petName;
	}
	public void setPetName(String petName) {
		this.petName = petName;
	}
	public Integer getPetTypeId() {
		return petTypeId;
	}
	public void setPetTypeId(Integer petTypeId) {
		this.petTypeId = petTypeId;
	}
	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}

}
