
public class Club
{
    private String naam;
    private int stichingsJaar;
    private int leden;
    
    public Club(String naam, int stichtJaar, int ledenAantal) {
        this.naam = naam;
        stichingsJaar = stichtJaar;
        leden = ledenAantal;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public int getStichtingsJaar() {
        return stichingsJaar;
    }
    
    public int getAantalLeden() {
        return leden;
    }

    public String toString() {
        return getNaam() + " (" + getStichtingsJaar() + ") heeft " + getAantalLeden() + " leden";
    }
}
