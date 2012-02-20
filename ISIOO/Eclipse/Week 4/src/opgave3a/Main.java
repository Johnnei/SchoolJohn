package opgave3a;

public class Main {
	
	public static void main(String[] args) {
		Gids g = new Gids();
		Programma p = new Uitzending("Shownieuws", "SBS6", 30);
		g.voegToe(p);
		p = new Serie(1, "Pietje", "Dr. House", "SBS6", 30);
		g.voegToe(p);
		p = new Talkshow("Fietsbanden", "Pietje", "RTL8", "Pietje's lul uurtje", 60);
		g.voegToe(p);
		g.print();
	}

}
