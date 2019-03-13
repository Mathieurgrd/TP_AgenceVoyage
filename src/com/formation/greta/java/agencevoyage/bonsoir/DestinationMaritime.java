package com.formation.greta.java.agencevoyage.bonsoir;

public class DestinationMaritime extends Destination implements Nommable {

	private String ileDest;
	private final static String ILE_DESERTE = "Île déserte";

	public DestinationMaritime(Destination d) {
		super(d);

		this.setIleDest("404 Island not found");
		this.setNomDest(d.getNomDest());
		this.setRegionDest(d.getRegionDest());
		this.setNbreJours(d.getNbreJours());
	}

	public DestinationMaritime(String ileDest, String nomDest, String regionDest, int nbreJours) {

		super(nomDest, regionDest, nbreJours);
		this.ileDest = ILE_DESERTE;

	}

	@Override
	public String getNomDest() {
		// TODO Auto-generated method stub
		return super.getNomDest();
	}

	@Override
	public void setNomDest(String nomDest) {
		// TODO Auto-generated method stub
		super.setNomDest(nomDest);
	}

	@Override
	public String getRegionDest() {
		// TODO Auto-generated method stub
		return super.getRegionDest();
	}

	@Override
	public void setRegionDest(String regionDest) {
		// TODO Auto-generated method stub
		super.setRegionDest(regionDest);
	}

	@Override
	public int getNbreJours() {
		// TODO Auto-generated method stub
		return super.getNbreJours();
	}

	@Override
	public void setNbreJours(int nbreJours) {
		// TODO Auto-generated method stub
		super.setNbreJours(nbreJours);
	}

	@Override
	public void allongerSejour(int nombreAllonger) {
		// TODO Auto-generated method stub
		super.allongerSejour(nombreAllonger);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " sur l'île de " + ileDest;
	}

	@Override
	public void finalize() {
		// TODO Auto-generated method stub
		super.finalize();
	}

	@Override
	public boolean equals(Destination d2) {
		// TODO Auto-generated method stub
		return super.equals(d2);
	}

	public String getIleDest() {
		return ileDest;
	}

	public void setIleDest(String ileDest) {
		this.ileDest = ileDest;
	}

	@Override
	public void setNom(String name) {

		super.setNom(name);
	}

}