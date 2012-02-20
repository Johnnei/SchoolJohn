package opgave2a_1;

public class Stopwatch extends Optelbaar {
	
	public Stopwatch() {
		super("Stopwatch");
	}
	
	public int add(int a, int b) {
		return (a + b) % 60;
	}

}
