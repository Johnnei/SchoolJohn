package com.opg2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Persoon p = new Persoon("Piet", 180);
		Student s = new Student(1046379, "Johan", 180);
		p.voegMailToe("piet@hotmail.com");
		p.voegMailToe("piet1337@live.nl");
		System.out.println(p);
		System.out.println(s);
	}

}
