package com.applicationjava;

public class Homme extends Animal {

	
	private String nom ; 
	private String prenom ;
	
	 
	public Homme(String couleur, Double longeur, String nom, String prenom) {
		super(couleur, longeur);
		this.nom = nom;
		this.prenom = prenom;
	}


	 
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	@Override
	public String toString() {
		return "Homme [nom=" + nom + ", prenom=" + prenom + super.toString() +  "]";
	}


	
	
	
	
	
	
	
}