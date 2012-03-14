package lift;

import javax.swing.JDialog;
import javax.swing.JFrame;

public class Lift {
	
	private int huidigeVerdieping;
	private int aantalEtages;
	
	public Lift(int etages) {
		aantalEtages = etages;
		huidigeVerdieping = 0;
	}
	
	public void up() throws OngeldigeVerdiepingException {
		if(huidigeVerdieping + 1 <= aantalEtages)
			huidigeVerdieping++;
		else
			throw new OngeldigeVerdiepingException();
	}
	
	public void down() throws OngeldigeVerdiepingException {
		if(huidigeVerdieping > 0)
			huidigeVerdieping--;
		else
			throw new OngeldigeVerdiepingException();
	}
	
	public int getVerdieping() {
		return huidigeVerdieping;
	}
	
	public int getAantalVerdiepingen() {
		return aantalEtages;
	}
	
	public void naarEtage(String s, JFrame f) throws OngeldigeVerdiepingException {
		int i;
		try {
			i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			i = 0;
			new ErrDialog(f, "Error!", "Ongeldige Invoer!");
		}
		
		if(i > huidigeVerdieping) {
			while(i > huidigeVerdieping) {
				up();
			}
		} else {
			while(i < huidigeVerdieping) {
				down();
			}
		}
	}

}
