package com.applicationjava;

public class Chien  extends Animal {
	   private String race ;
	   
	   
	   
	    
	public Chien(String race,String couleur, Double longeur) {
		super(couleur,longeur);
		this.race = race;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Chien [race=" + race + super.toString() + "]";
	} 
	   
	   
	   
	   
		
		
		
	}
