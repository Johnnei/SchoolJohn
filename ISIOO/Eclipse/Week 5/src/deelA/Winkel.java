/*
 * Winkel.java
 *
 * Created on 9 maart 2007, 9:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

/**
 *
 * @author lecturer
 */
package deelA;
import java.util.*;

public class Winkel {
    
    private ArrayList<Cd> cdWinkel = new ArrayList<Cd>();

    /** Creates a new instance of Winkel */
    public Winkel() {
    }
    
    public Cd findCd( String artiest, String titel ) {
        for( Cd cd: cdWinkel ) {
            if( cd.getArtiest().equalsIgnoreCase( artiest ) &&
                cd.getTitel().equalsIgnoreCase( titel ) )
                return cd;
        }
        return null;
    }
    
    public void addTrack(String artiest, String titel, String trackTitel, String trackDuur) {
    	for(int i = 0; i < cdWinkel.size(); i++) {
    		Cd cd = cdWinkel.get(i);
    		if(cd.getArtiest().equals(artiest) && cd.getTitel().equals(titel)) {
    			Track t = new Track(trackTitel, trackDuur);
    			cd.addTrack(t);
    			cdWinkel.set(i, cd);
    			break;
    		}
    	}
    }
    
    public void printAll() {
        for( Cd cd: cdWinkel )
            System.out.println( cd );
    }
    
    public String getAll() {
        String all = "";
        for( Cd cd: cdWinkel )
            all = all + cd.toString() + "\n";
        return all;
    }
    
    public void addCd( String artiest, String titel, int voorraad ) {
        Cd cd = new Cd( artiest, titel, voorraad );
        cdWinkel.add( cd );
    }

    public void deleteCd( String artiest, String titel ) {
        Cd cd = findCd( artiest, titel );
        cdWinkel.remove( cd );
    }

    public void wijzigVoorraad( String artiest, String titel, int voorraad ) {
        Cd cd = findCd( artiest, titel );
        cd.setVoorraad( voorraad );
    }
}
