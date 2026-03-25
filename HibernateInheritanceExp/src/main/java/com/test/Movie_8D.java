package com.test;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
//@DiscriminatorValue("4D_Movie")
@Table(name="8D_Movie")
public class Movie_8D extends Movie{
	private String directors;

	public String getDirectors() {
		return directors;
	}

	public void setDirectors(String directors) {
		this.directors = directors;
	}
	
}
