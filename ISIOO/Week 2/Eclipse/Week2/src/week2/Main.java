package week2;

public class Main {
	
	public static void main(String[] args) {
		Persoon[] pers = new Persoon[4];
		pers[0] = new Persoon("Johan", 17);
		pers[1] = new Persoon("Kees", 16);
		pers[2] = new Persoon("Piet", 25);
		pers[3] = new Persoon("Klaas", 19);
		for(int i = 0; i < pers.length; i++)
			System.out.println(pers[i].toString());
	}

}
