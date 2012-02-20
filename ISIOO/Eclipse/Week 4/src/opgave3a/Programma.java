package opgave3a;

public abstract class Programma {
	
	private String titel;
	private String zender;
	private int duur;

	public Programma(String title, String channel, int duration) {
		titel = title;
		zender = channel;
		duur = duration;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public String getZender() {
		return zender;
	}
	
	public int getDuur() {
		return duur;
	}
	
	public String toString() {
		return "[" + zender + "] \"" + titel + "\" " + duur + "m";
	}
}
