package com.opg3;

public class Persoon {
	
	private String naam;
	private int leeftijd;
	
	public Persoon(String s, int i) {
		naam = s;
		leeftijd = i;
	}
	
	public void jarig() {
		++leeftijd;
	}
	
	public String toString() {
		return naam + ", " + leeftijd;
	}

}
