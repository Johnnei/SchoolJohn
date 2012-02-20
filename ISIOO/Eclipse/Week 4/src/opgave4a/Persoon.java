package opgave4a;

public class Persoon implements Benoembaar {

	private String voornaam;
	private String achternaam;
	
	public Persoon(String voor, String achter) {
		voornaam = voor;
		achternaam = achter;
	}
	
	@Override
	public String geefVolledigeNaam() {
		return voornaam + " " + achternaam;
	}

}
