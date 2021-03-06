package com.opg2;

public class Persoon {
	private String naam;
	private String[] emailadressen;
	private int slot = 0;
	private int[][] studiepunten;
	private int lengte;
	
	public Persoon(String s, int i) {
		emailadressen = new String[10];
		naam = s;
		lengte = i;
		studiepunten = new int[][] {
				{ 15, 13, 15, 12 },
				{ 14, 15, 15, 15 },
				{ 13, 10, 6, 2 },
				{ 12, 6, 0, 0}
		};
	}
	
	public void voegMailToe(String adres) {
		emailadressen[slot++] = adres;
	}
	
	public int getLengte() {
		return lengte;
	}
	
	public String toString() {
		String s = naam + ", " + lengte + "cm";
		
		for(int i = 0; i < emailadressen.length; i++) {
			s += "\n" + emailadressen[i];
		}
		
		int totaal = 0;
		
		for(int i = 0; i < studiepunten.length; i++) {
			s += "\nJaar " + (i + 1) + ": ";
			for(int j = 0; j < studiepunten[i].length; j++) {
				s += "per" + (j + 1) + " = " + studiepunten[i][j] + ", ";
				totaal += studiepunten[i][j];
			}
			s = s.substring(0, s.length() - 2);
		}
		
		s += "\nTotaal: " + totaal + " studiepunten";
		
		return s;
	}
}
