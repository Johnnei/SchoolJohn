package opgave3a;

public class Talkshow extends Programma {
	private String presentator;
	private String onderwerp;
	
	public Talkshow(String subject, String pres, String zender, String titel, int duur) {
		super(titel, zender, duur);
		presentator = pres;
		onderwerp = subject;
	}
	
	public String getPresentator() {
		return presentator;
	}
	
	public String getOnderwerp() {
		return onderwerp;
	}
	
	public String toString() {
		return super.toString() + " | " + presentator + " over " + onderwerp;
	}
}
