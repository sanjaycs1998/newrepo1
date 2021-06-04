package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity

public class Films {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(unique=true)
	private String filmName;
    private double boxOfficeCollection;
    
   
    private int rating;
   
	@ManyToOne
    @JoinColumn(name="director_id")
	private Director director;

	public Films() {
		super();
	}

	public Films(int id, String filmName, double boxOfficeCollection, int rating,
			Director director) {
		super();
		this.id = id;
		this.filmName = filmName;
		this.boxOfficeCollection = boxOfficeCollection;
		this.rating = rating;
		this.director = director;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public double getBoxOfficeCollection() {
		return boxOfficeCollection;
	}

	public void setBoxOfficeCollection(double boxOfficeCollection) {
		this.boxOfficeCollection = boxOfficeCollection;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Director getDirector() {
		return director;
	}

	public void setDirector(Director director) {
		this.director = director;
	}


	
	
	

}
