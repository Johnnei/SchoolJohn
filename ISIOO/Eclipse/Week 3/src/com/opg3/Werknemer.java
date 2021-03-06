package com.opg3;

public class Werknemer extends Persoon {
	
	private double salaris;
	
	public Werknemer(double d, String s, int i) {
		super(s, i);
		salaris = d;
	}
	
	public void verhoogSalaris(double d) {
		salaris += d;
	}
	
	public double getSalaris() {
		return salaris;
	}
	
	public String toString() {
		return super.toString() + ", " + salaris;
	}

}
