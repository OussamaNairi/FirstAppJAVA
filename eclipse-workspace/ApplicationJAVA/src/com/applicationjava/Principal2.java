package com.applicationjava;

import java.util.ArrayList;
import java.util.List;

public class Principal2 {
 
	public static void main (String[] args) {
		 
		List<Animal>  ta = new ArrayList<>() ;	
 	
		ta.add(new Animal("A",5.0));
		ta.add(new Animal("Noir", 10.0));
		ta.add(new Chien("race", "Noir", 3.0));
		ta.add(new Chien("CHB", "D", 3.0));
		ta.add(new Homme("Black", 1.50, "Oussema", "Neri"));
		
		Homme h = (Homme) ta.get(0);		
		h.setNom("aa");
		
		if(ta.get(0) instanceof Homme)
		{	
			Homme h2 = (Homme) ta.get(0);
			h2.setNom("aze");
		}
		  
		Chien chien = new Chien("race", "Noir", 3.0);
		ta.remove(chien);
		
		
	
		
	  int count = 0 ; 
	  for(int i = 0 ; i< ta.size() ;i++) {
		if(ta.get(i).getCouleur().equalsIgnoreCase("Noir")) {
			count ++ ;
		}
 	
	}
	  
    System.out.println("nb couleur " + count);	
	for(int i = 0 ; i< ta.size() ;i++) {
		
		if(ta.get(i) instanceof Homme)
		{
			Homme hom = (Homme) ta.get(i);
			System.out.println("nom : " +hom.getNom() + " Prenom "+ hom.getPrenom());
		}
		
 
	}
	
	
	for(int i = 0 ; i< ta.size() ;i++) {
	 
			System.out.println(ta.get(i));
 
	}
 
	for(Animal a : ta)
	{
		System.out.println(a);
		
	}
	
	
	
 		
	}
	
	

	
	
	
	

}
