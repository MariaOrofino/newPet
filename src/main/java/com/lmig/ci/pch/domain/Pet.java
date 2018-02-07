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
	
	
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Pet_type_id", insertable=false, updatable=false)
    private PetType Pet_Type;
	
	
	@JoinColumn(name = "Pet_Status_id", insertable=false, updatable=false)
    private PetStatus Pet_Status;

	
	
    
    //TODO finish but start this off simple
	/**
	 * @return the pet_id
	 */
	public Integer getPet_id() {
		return Pet_id;
	}
	/**
	 * @param pet_id the pet_id to set
	 */
	public void setPet_id(Integer pet_id) {
		Pet_id = pet_id;
	}
	/**
	 * @return the pet_Name
	 */
	public String getPet_Name() {
		return Pet_Name;
	}
	/**
	 * @param pet_Name the pet_Name to set
	 */
	public void setPet_Name(String pet_Name) {
		Pet_Name = pet_Name;
	}
	/**
	 * @return the pet_Desc
	 */
	public String getPet_Desc() {
		return Pet_Desc;
	}
	/**
	 * @param pet_Desc the pet_Desc to set
	 */
	public void setPet_Desc(String pet_Desc) {
		Pet_Desc = pet_Desc;
	}
	/**
	 * @return the pet_Chip_Tag
	 */
	public String getPet_Chip_Tag() {
		return Pet_Chip_Tag;
	}
	/**
	 * @param pet_Chip_Tag the pet_Chip_Tag to set
	 */
	public void setPet_Chip_Tag(String pet_Chip_Tag) {
		Pet_Chip_Tag = pet_Chip_Tag;
	}
	/**
	 * @return the pet_Rabies_Tag
	 */
	public String getPet_Rabies_Tag() {
		return Pet_Rabies_Tag;
	}
	/**
	 * @param pet_Rabies_Tag the pet_Rabies_Tag to set
	 */
	public void setPet_Rabies_Tag(String pet_Rabies_Tag) {
		Pet_Rabies_Tag = pet_Rabies_Tag;
	}
	/**
	 * @return the pet_Breed
	 */
	public String getPet_Breed() {
		return Pet_Breed;
	}
	/**
	 * @param pet_Breed the pet_Breed to set
	 */
	public void setPet_Breed(String pet_Breed) {
		Pet_Breed = pet_Breed;
	}
	/**
	 * @return the pet_Size
	 */
	public String getPet_Size() {
		return Pet_Size;
	}
	/**
	 * @param pet_Size the pet_Size to set
	 */
	public void setPet_Size(String pet_Size) {
		Pet_Size = pet_Size;
	}
	/**
	 * @return the pet_Color
	 */
	public String getPet_Color() {
		return Pet_Color;
	}
	/**
	 * @param pet_Color the pet_Color to set
	 */
	public void setPet_Color(String pet_Color) {
		Pet_Color = pet_Color;
	}
	/**
	 * @return the pet_Img_URL
	 */
	public String getPet_Img_URL() {
		return Pet_Img_URL;
	}
	/**
	 * @param pet_Img_URL the pet_Img_URL to set
	 */
	public void setPet_Img_URL(String pet_Img_URL) {
		Pet_Img_URL = pet_Img_URL;
	}
	/**
	 * @return the pet_Create_Date
	 */
	public LocalDate getPet_Create_Date() {
		return Pet_Create_Date;
	}
	/**
	 * @param pet_Create_Date the pet_Create_Date to set
	 */
	public void setPet_Create_Date(LocalDate pet_Create_Date) {
		Pet_Create_Date = pet_Create_Date;
	}
	/**
	 * @return the pet_Modified_Date
	 */
	public LocalDate getPet_Modified_Date() {
		return Pet_Modified_Date;
	}
	/**
	 * @param pet_Modified_Date the pet_Modified_Date to set
	 */
	public void setPet_Modified_Date(LocalDate pet_Modified_Date) {
		Pet_Modified_Date = pet_Modified_Date;
	}
	/**
	 * @return the pet_Lost_Date
	 */
	public LocalDate getPet_Lost_Date() {
		return Pet_Lost_Date;
	}
	/**
	 * @param pet_Lost_Date the pet_Lost_Date to set
	 */
	public void setPet_Lost_Date(LocalDate pet_Lost_Date) {
		Pet_Lost_Date = pet_Lost_Date;
	}
	/**
	 * @return the pet_Found_Date
	 */
	public LocalDate getPet_Found_Date() {
		return Pet_Found_Date;
	}
	/**
	 * @param pet_Found_Date the pet_Found_Date to set
	 */
	public void setPet_Found_Date(LocalDate pet_Found_Date) {
		Pet_Found_Date = pet_Found_Date;
	}
	/**
	 * @return the pet_Sighted_Date
	 */
	public LocalDate getPet_Sighted_Date() {
		return Pet_Sighted_Date;
	}
	/**
	 * @param pet_Sighted_Date the pet_Sighted_Date to set
	 */
	public void setPet_Sighted_Date(LocalDate pet_Sighted_Date) {
		Pet_Sighted_Date = pet_Sighted_Date;
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
	/**
	 * @return the pet_Status
	 */
	public PetStatus getPet_Status() {
		return Pet_Status;
	}
	/**
	 * @param pet_Status the pet_Status to set
	 */
	public void setPet_Status(PetStatus pet_Status) {
		Pet_Status = pet_Status;
	}
	

	
	
}
