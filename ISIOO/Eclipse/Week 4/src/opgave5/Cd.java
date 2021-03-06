/*
 * Cd.java
 *
 * Created on 9 maart 2007, 9:03
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package opgave5;

/**
 *
 * @author lecturer
 */
public class Cd {
    
    private String artiest;     // artiestnaam
    private String titel;       // cd titel
    private int voorraad;       // aantal exemplaren in voorraad

    /** Creates a new instance of Cd */
    public Cd() {
    }
    
    public Cd( String artiest, String titel, int voorraad ) {
        this.artiest = artiest;
        this.titel = titel;
        this.voorraad = voorraad;
    }
    
    public String toString() {
        return  artiest + ':' + 
                titel + ':' + 
                voorraad;
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

}
   
