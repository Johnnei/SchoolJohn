
public class Artikel
{
    private int nummer;
    private String omschrijving;
    private double prijs;
    
    public Artikel(int nr, String omschrijf, double prijs) {
        nummer = nr;
        omschrijving = omschrijf;
        this.prijs = prijs;
    }
    
    public int getNummer() {
        return nummer;
    }
    
    public double getPrijs() {
        return prijs;
    }
    
    public String toString() {
        return "[" + nummer + "] " + omschrijving + ", Prijs: " + prijs;
    }
}
