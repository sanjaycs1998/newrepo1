package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity





public class Director {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int DirectorId;
	@Column(unique=true)
	private String DirectorName;
    private  String gender;
    private int awardCount;
    @JsonIgnore
  
	@OneToMany( cascade = CascadeType.ALL)
	private List<Films> films;
 
	public Director() {
		super();
	}

	public Director(int directorId, String directorName, String gender, int awardCount,
			List<Films> films) {
		super();
		DirectorId = directorId;
		DirectorName = directorName;
		this.gender = gender;
		this.awardCount = awardCount;
		this.films = films;
	}

	public int getDirectorId() {
		return DirectorId;
	}

	public void setDirectorId(int directorId) {
		DirectorId = directorId;
	}

	public String getDirectorName() {
		return DirectorName;
	}

	public void setDirectorName(String directorName) {
		DirectorName = directorName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAwardCount() {
		return awardCount;
	}

	public void setAwardCount(int awardCount) {
		this.awardCount = awardCount;
	}

	public List<Films> getFilms() {
		return films;
	}

	public void setFilms(List<Films> films) {
		this.films = films;
	}
    
    
    

}
