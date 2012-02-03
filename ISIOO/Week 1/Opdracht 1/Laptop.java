
/**
 * Write a description of class Laptop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laptop
{
    // instance variables - replace the example below with your own
    private String merk;
    private double prijs;

    /**
     * Constructor for objects of class Laptop
     */
    public Laptop(String merk, double prijs)
    {
        this.merk = merk;
        this.prijs = prijs;
    }
    
    public Laptop()
    {
        // initialise instance variables
        merk = "Unkown";
        prijs = 0.00;
    }
    
    public String getMerk()
    {
        return merk;
    }
    
    public double getPrijs()
    {
        return prijs;
    }
    
    public void setPrijs(int i)
    {
        prijs = i;
    }
    
    
}
