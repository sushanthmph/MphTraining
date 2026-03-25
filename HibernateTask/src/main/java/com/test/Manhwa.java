package com.test;

import jakarta.persistence.Entity;

@Entity
public class Manhwa extends Books{
	private int characters;

	public int getCharacters() {
		return characters;
	}

	public void setCharacters(int characters) {
		this.characters = characters;
	}
	
}
