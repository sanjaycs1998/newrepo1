package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Director;
import com.example.demo.repo.directorRepository;


@Service
public class DirectorServiceImpl implements DirectorService{

	@Autowired
	private  directorRepository directorrepo;
	
	@Override
	public Director addDirector(Director director) {
		
		return directorrepo.save(director);
	}
	

	
	
}
