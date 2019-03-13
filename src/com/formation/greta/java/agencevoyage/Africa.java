package com.formation.greta.java.agencevoyage;

import java.util.Scanner;

public class Africa {

	public static void affichNamibie() throws RuntimeException {
		Utils u = new Utils();
		Scanner sc = new Scanner(System.in);
		Utils.print("Entrez votre nom");
		String nom = sc.nextLine();
		if(nom.equalsIgnoreCase("Etienne") || nom.equalsIgnoreCase(("Dylan"))) {
			
			sc.close();
			throw new KoalaException("Non c'est mort");
		
		}
		
		Utils.print("Entrez votre e-mail");
		String eMail = sc.nextLine();
		if(!eMail.substring(2 , eMail.length() - 2).contains("@")) {
			
			
			Utils.print("NON");
			
		}
		
		
		
		sc.close();

		
	
	
	
	
	}

}
