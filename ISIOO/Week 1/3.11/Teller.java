public class Teller {
    private int waarde;
    
    public Teller()
    {
        waarde = 0;
    }
    
    public void verhoog()
    {
        ++waarde;
    }
    
    public void verlaag()
    {
        --waarde;
    }
    
    public void setWaarde(int waarde)
    {
        this.waarde = waarde;
    }
    
    public int getWaarde()
    {
        return waarde;
    }
}