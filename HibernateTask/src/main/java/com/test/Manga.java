package com.test;

import jakarta.persistence.Entity;

@Entity
public class Manga extends Books{
	private int chapters;

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	
}
