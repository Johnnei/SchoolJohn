
/**
 * Write a description of class Laptopfabriek here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laptopfabriek
{
    Laptop l;
    
    public Laptopfabriek()
    {
        l = new Laptop("Compaq", 600.99);
    }
    
    public void printLaptop()
    {
        System.out.println("Merk: " + l.getMerk() + ", Prijs: " + l.getPrijs());
    }
}
