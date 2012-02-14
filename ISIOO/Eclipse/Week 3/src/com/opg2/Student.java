package com.opg2;

public class Student extends Persoon {
	
	int nummer;
	
	public Student(int nummer, String naam, int lengte) {
		super(naam, lengte); //Dit is nodig omdat ik geen default/empty constructor heb :D
		this.nummer = nummer;
	}
	
	public int getNummer() {
		return nummer;
	}
	
	public String toString() {
		return "Student Nummer: " + nummer + "\n" + super.toString();
	}

}
