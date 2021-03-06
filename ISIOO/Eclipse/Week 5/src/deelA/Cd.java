/*
 * Cd.java
 *
 * Created on 9 maart 2007, 9:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package deelA;

import java.util.ArrayList;

/**
 *
 * @author lecturer
 */
public class Cd {
    
    private String artiest;     // artiestnaam
    private String titel;       // cd titel
    private int voorraad;       // aantal exemplaren in voorraad
    private ArrayList<Track> tracks;

    /** Creates a new instance of Cd */
    public Cd() {
    }
    
    public Cd( String artiest, String titel, int voorraad ) {
        this.artiest = artiest;
        this.titel = titel;
        this.voorraad = voorraad;
        this.tracks = new ArrayList<Track>();
    }
    
    public String toString() {
        String s = artiest + ':' + 
                titel + ':' + 
                voorraad;
        
        int i = 1;
        for(Track t : tracks) {
        	s += "\n  " + i++ + ") " + t;
        }
        
        return s;
    }
    
    public String getArtiest() {
        return artiest;
    }

    public String getTitel() {
        return titel;
    }
    
    public int getVoorraad() {
        return voorraad;
    }
    
    public void setArtiest( String artiest ) {
        this.artiest = artiest;
    }
    
    public void setTitel( String titel ) {
        this.titel = titel;
    }
    
    public void setVoorraad( int voorraad ) {
        this.voorraad = voorraad;
    }
    
    public void addTrack(Track t) {
    	tracks.add(t);
    }

}
   
