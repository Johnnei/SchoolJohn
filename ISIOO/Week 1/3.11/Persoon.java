
/**
 * Write a description of class Persoon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persoon
{
    private String naam;
    private Datum gebDatum;
    
    public Persoon(String naam, Datum gebDatum)
    {
        this.naam = naam;
        this.gebDatum = gebDatum;
    }
    
    public String getNaam()
    {
        return naam;
    }
    
    public void setNaam(String s)
    {
        naam = s;
    }
    
    public String toString()
    {
        return naam + " " + gebDatum.getDag() + "-" + gebDatum.getMaand() + "-" + gebDatum.getJaar();
    }
}
