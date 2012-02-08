import java.util.ArrayList;

public class Bestelling
{
    ArrayList<Artikel> lijst;
    
    public Bestelling() {
        lijst = new ArrayList<Artikel>();
    }
    
    public void voegToe(Artikel a) {
        lijst.add(a);
    }
    
    public void printFactuur() {
        System.out.println("Artikkellen bij deze Bestelling:");
        for(Artikel a : lijst) {
            System.out.println(a);
        }
        System.out.println("Totaal Prijs: " + berekenTotaal());
    }
    
    private double berekenTotaal() {
        double d = 0D;
        for(Artikel a : lijst) {
            d += a.getPrijs();
        }
        return d;
    }
}
