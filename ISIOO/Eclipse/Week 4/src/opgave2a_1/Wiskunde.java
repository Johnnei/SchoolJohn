package opgave2a_1;

public class Wiskunde extends Optelbaar {
	
	public Wiskunde() {
		super("Wiskunde");
	}
	
	public int substract(int a, int b) {
		return a - b;
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

}
