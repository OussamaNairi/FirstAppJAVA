package com.applicationjava;

import java.util.Scanner;

public class Principal {
	
	
	
	private static Scanner s;

	public static void main (String[] args) {
		s = new Scanner(System.in);	
		Animal[] ta ;	
		int n = s.nextInt();
		ta = new Animal[n];		
		ta[0] = new Animal("A",5.0);
		ta[1]   = new Animal("Noir", 10.0);
		ta[2]   = new Chien("race", "Noir", 3.0);
		ta[3] = new Chien("CHB", "D", 3.0);
		ta[4]= new Homme("White", 1.50, "Oussama", "Nairi");
		
		Homme h = (Homme) ta[4];		
		h.setNom("aa");
		if(ta[0] instanceof Homme)
		{	
			Homme h2 = (Homme) ta[0];
			h2.setNom("aze");
		}
		
	int count = 0 ; 
	for(int i = 0 ; i< ta.length ;i++) {
		if(ta[i].getCouleur().equalsIgnoreCase("Noir")) {
			count ++ ;
		}
		
		 
		
		
	}
    System.out.println("nb couleur " + count);	
	
	for(int i = 0 ; i< ta.length ;i++) {
		
		if(ta[i] instanceof Homme)
		{
			Homme hom = (Homme) ta[i];
			System.out.println("nom : " +hom.getNom() + " Prenom "+ hom.getPrenom());
		}
		
		
 
		
	}
	
	
	for(int i = 0 ; i< ta.length ;i++) {
		
	 
			System.out.println(ta[i]);
		
		
		
 
		
	}
		
	for(Animal a : ta) {
		
		System.out.println(a);
		
	}
	
	
	
	
	
		
	}
	
	
	
	
	

}
