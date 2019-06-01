package com.applicationjava;

public   class Animal {
	
	
	private String couleur ; 
	private Double longeur ;
	
	
 
	
	public Animal(String couleur, Double longeur) {
	
		this.couleur = couleur;
		this.longeur = longeur;
	}
	
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public Double getLongeur() {
		return longeur;
	}
	public void setLongeur(Double longeur) {
		this.longeur = longeur;
	}


	@Override
	public String toString() {
		return "couleur=" + couleur + ", longeur=" + longeur  ;
	} 
	
	
	
	

}