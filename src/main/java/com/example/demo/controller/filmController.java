package com.example.demo.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Films;

import com.example.demo.service.DirectorService;
import com.example.demo.service.FilmService;


@RestController
@RequestMapping("/films")
@CrossOrigin(origins="http://localhost:4200")
public class filmController {

	@Autowired
	private DirectorService directorserviceImpl;
	@Autowired
	private FilmService filmsSerbiceImpl;
	
	
	
	
}
