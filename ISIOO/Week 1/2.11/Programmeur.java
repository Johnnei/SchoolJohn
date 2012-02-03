
/**
 * Write a description of class Programmeur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Programmeur
{
    private String naam;
    private String prof; //Specialiteit
    
    public Programmeur(String naam, String spec)
    {
        this.naam = naam;
        prof = spec;
    }
    
    public void print()
    {
        System.out.println("Werknemer: \"" + naam + "\", Specialiteit: " + prof);
    }
}
