package opgave2a;

import java.util.ArrayList;

public class Programma {
	
	private ArrayList<Optelbaar> lijst;
	
	public Programma() {
		lijst = new ArrayList<Optelbaar>();
		lijst.add(new Wiskunde());
		lijst.add(new Stopwatch());
		lijst.add(new Wiskunde());
		lijst.add(new Stopwatch());
		
		for(Optelbaar o : lijst) {
			System.out.println(o.add(50, 40));
			if(o instanceof Wiskunde) {
				System.out.println(((Wiskunde)(o)).substract(40, 20));
			}
		}
	}
	
	public static void main(String[] args) {
		new Programma();
	}

}
