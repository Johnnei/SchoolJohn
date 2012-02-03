
/**
 * Write a description of class Team here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Team
{
    private Programmeur p0;
    private Programmeur p1;
    private Programmeur p2;
    private Programmeur p3;
    
    public Team(Programmeur p0, Programmeur p1, Programmeur p2, Programmeur p3)
    {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    
    public void printAlleLeden()
    {
        p0.print();
        p1.print();
        p2.print();
        p3.print();
    }
}
