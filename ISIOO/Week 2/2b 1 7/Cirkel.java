public class Cirkel {

    double radius;
    
    public Cirkel(double straal) {
        radius = straal;
    }
    
    /* Setters */
    public void setStraal(double d) {
        radius = d;
    }
    
    /* Getters */
    public double getStraal() {
        return radius;
    }
    
    public double getOmtrek() {
        return 2 * Math.PI * radius;
    }
    
    public double getOppervlakte() {
        return Math.PI * (Math.pow(radius, 2));
    }
    
    public void print() {
        System.out.println("Straal: " + radius + ", Omtrek: " + getOmtrek() + ", Oppervlakte: " + getOppervlakte());
    }

}