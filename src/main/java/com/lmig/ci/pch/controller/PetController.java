/*
 * Copyright (C) 2018, Liberty Mutual Group
 *
 * Created on Feb 6, 2018
 */

package com.lmig.ci.pch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lmig.ci.pch.service.DatabaseService;

/**
 * @author n0129947
 *
 */
@Controller
@RequestMapping("/pet")
public class PetController {

	@Autowired
	private DatabaseService databaseService;

	//TODO decide if you need a controller for each domain object
	//TODO have your methods here call your service which calls your dao
}
