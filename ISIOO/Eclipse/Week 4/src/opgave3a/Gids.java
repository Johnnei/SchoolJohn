package opgave3a;

import java.util.ArrayList;

public class Gids {
	
	private ArrayList<Programma> lijst;
	
	public Gids() {
		lijst = new ArrayList<Programma>();
	}
	
	public void voegToe(Programma p) {
		lijst.add(p);
	}
	
	public void print() {
		for(Programma p : lijst)
			System.out.println(p);
	}

}
