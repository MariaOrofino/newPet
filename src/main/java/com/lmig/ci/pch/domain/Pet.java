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
@Table(schema = "PCH", name = "Pet")
public class Pet {

	@Id
	@GeneratedValue
	@Column(name = "Pet_id")
    private Integer Pet_id;

	@Column(name = "Pet_name")
    private String Pet_Name;
	@Column(name = "Pet_Desc")
    private String Pet_Desc;
	@Column(name = "Pet_Chip_Tag")
	private String Pet_Chip_Tag;
	@Column(name = "Pet_Rabies_Tag")
    private String Pet_Rabies_Tag;
	@Column(name = "Pet_Breed")
    private String Pet_Breed;
	@Column(name = "Pet_Size")
    private String Pet_Size;
	@Column(name = "Pet_Color")
    private String Pet_Color;
	@Column(name = "Pet_Img_URL")
    private String Pet_Img_URL;
	@Column(name = "Pet_Create_Date")
    private LocalDate Pet_Create_Date;
	@Column(name = "Pet_Modified_Date")
    private LocalDate Pet_Modified_Date;
	@Column(name = "Pet_Lost_Date")
    private LocalDate Pet_Lost_Date;
	@Column(name = "Pet_Found_Date")
    private LocalDate Pet_Found_Date;
	@Column(name = "Pet_Sighted_Date")
    private LocalDate Pet_Sighted_Date;
	@Column(name = "user")
    private User user;
	@Column(name = "loc")
    private List loc;
	@Column(name = "Pet_Status")
    private PetStatus Pet_Status;
	
	
//	@OneToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "pettype_id_id", insertable=false, updatable=false)
//    private pettype_id pettype_id;

	
	}
    
    //TODO finish but start this off simple
	
	
    
   /* 
	public Integer getPet_id() {
		return Pet_id;
	}
	public void setPet_id(Integer Pet_id) {
		this.Pet_id = Pet_id;
	}
	public String getPetName() {
		return PetName;
	}
	public void setPetName(String PetName) {
		this.PetName = PetName;
	}
	public Integer getPetTypeId() {
		return PetTypeId;
	}
	public void setPetTypeId(Integer PetTypeId) {
		this.PetTypeId = PetTypeId;
	}
	public PetType getPetType() {
		return PetType;
	}
	public void setPetType(PetType PetType) {
		this.PetType = PetType;
	}
*/

