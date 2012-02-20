package opgave2a_1;

public abstract class Optelbaar {
	
	private String naam;
	
	public Optelbaar(String s) {
		naam = s;
	}
	
	public abstract int add(int a, int b);

}
