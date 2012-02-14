package com.opg3;

public class Main {
	
	public static void main(String[] args) {
		Persoon p1 = new Persoon("Piet", 19);
		Persoon p2 = new Persoon("Klaas", 23);
		Werknemer w1 = new Werknemer(1450.59, "Jan", 26);
		Werknemer w2 = new Werknemer(999.99, "Fiets", 21);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(w1);
		System.out.println(w2);
		
		p1.jarig();
		p2.jarig();
		w1.verhoogSalaris(49.41);
		w2.verhoogSalaris(0.01);
		
		System.out.println("");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(w1);
		System.out.println(w2);
	}

}
