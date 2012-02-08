import java.util.ArrayList;

public class Catalogus
{
       ArrayList<Artikel> lijst;
       
       public Catalogus() {
           lijst = new ArrayList<Artikel>();
       }
       
       public void voegToe(Artikel a) {
           lijst.add(a);
       }
       
       public Artikel zoek(int nr) {
           for(Artikel a : lijst) {
               if(a.getNummer() == nr)
                    return a;
           }
           return null;
       }
       
       public void print() {
           System.out.println("Artikellen:");
           for(Artikel a : lijst) {
               System.out.println(a);
           }
       }
}
