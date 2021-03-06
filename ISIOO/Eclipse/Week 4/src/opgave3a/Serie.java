package opgave3a;

public class Serie extends Programma {
	
	private String regisseur;
	private int nummer;
	
	public Serie(int nummer, String regis, String titel, String zender, int duur) {
		super(titel, zender, duur);
		regisseur = regis;
		this.nummer = nummer;
	}
	
	public int getNummer() {
		return nummer;
	}
	
	public String getRegisseur() {
		return regisseur;
	}
	
	public String toString() {
		return super.toString() + " | Afl. " + nummer + " door " + regisseur; 
	}

}
