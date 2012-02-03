
/**
 * Write a description of class Scorebord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scorebord
{
   Teller ploeg1;
   Teller ploeg2;

   public Scorebord()
   {
       ploeg1 = new Teller();
       ploeg2 = new Teller();
   }
   
   public void verhoogPloeg1()
   {
       ploeg1.verhoog();
   } 
   
   public void verhoogPloeg2()
   {
       ploeg2.verhoog();
   }
   
   public void verlaagPloeg1()
   {
       ploeg1.verlaag();
   }
   
   public void verlaagPloeg2()
   {
       ploeg2.verlaag();
   }
   
   public void print()
   {
       System.out.println(toString());
   }
   
   @Override
   public String toString()
   {
       return ploeg1.getWaarde() + "-" + ploeg2.getWaarde();
   }
}
