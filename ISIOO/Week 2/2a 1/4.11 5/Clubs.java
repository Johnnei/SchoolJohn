import java.util.ArrayList;

public class Clubs
{
    ArrayList<Club> clubs;
    
    public Clubs() {
        clubs = new ArrayList<Club>();
    }
    
    public void voegToe(Club c) {
        clubs.add(c);
    }
    
    public void printAlleClubs() {
        System.out.println("Alle Clubs: ");
        for(Club c : clubs) {
            System.out.println(c);
        }
    }
}
