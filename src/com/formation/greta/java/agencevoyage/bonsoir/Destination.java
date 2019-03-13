package com.formation.greta.java.agencevoyage.bonsoir;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author Java
 *
 */
public class Destination implements Nommable {

	private String nomDest;
	private String regionDest;
	private int nbreJours;

	
	public Destination() {

		this("France", "Toulouse", 0);

	}

	/**
	 * 
	 * @param nomDest
	 * @param regionDest
	 * @param nbreJours
	 */
	public Destination(String nomDest, String regionDest, int nbreJours) {
		super();
		this.nomDest = nomDest;
		this.regionDest = regionDest;
		this.nbreJours = nbreJours;
	}
	
	/* Commentaire */ 
	public Destination(Destination d) {

		this.nomDest = d.nomDest;
		this.regionDest = d.regionDest;
		this.nbreJours = d.nbreJours;
	}

	public String getNomDest() {
		return nomDest;
	}

	public void setNomDest(String nomDest) {
		this.nomDest = nomDest;
	}

	public String getRegionDest() {
		return regionDest;
	}

	public void setRegionDest(String regionDest) {
		this.regionDest = regionDest;
	}

	public int getNbreJours() {
		return nbreJours;
	}

	public void setNbreJours(int nbreJours) {
		this.nbreJours = nbreJours;
	}

	public void allongerSejour(int nombreAllonger) {

		nbreJours += nombreAllonger;

	}

	public String toString() {

		return ("Bienvenue en " + nomDest + ", " + regionDest + ", le séjour conseillé est de  " + nbreJours
				+ " jours");

	}

	public void finalize() {

		System.out.println("Le destructeur");

	}

	public boolean equals(Destination d2) {

		if (this.nomDest.equals(d2.nomDest) && this.regionDest.equals(d2.regionDest))

			return true;

		else {

			return false;

		}
	}

	@Override
	public void setNom(String name) {

		System.out.println("Le nom est " + name);
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	public List<Destination> nothernEu() {

		List<Destination> destList = Arrays.asList(

				new Destination("Allemagne", "Munich", 10), new Destination("Allemagne", "Berlin", 10),
				new Destination("Netherlands", "Brabanthallen", 10),
				new Destination("Netherlands", "Sportshallenzuid", 10));

		return destList;
	}

	public List<Destination> filteredNothernEu(List<Destination> destList) {

		List<Destination> filtered = destList.stream().filter(d -> d.nomDest.startsWith("A"))
				.collect(Collectors.toList());

		System.out.println(filtered);
		return filtered;

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}
