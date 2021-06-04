package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Director;
import com.example.demo.service.DirectorService;

@RestController
//SANJAYCSA09@GMAIL.com
@CrossOrigin("*")
public class directorController {

	//shivam123dfghj

    //saaa
	@Autowired
	private DirectorService directorservice;
	
	@PostMapping("/add")
	public Director addDirector(@RequestBody Director director) {
		return  directorservice.addDirector(director);
	}
	

}
