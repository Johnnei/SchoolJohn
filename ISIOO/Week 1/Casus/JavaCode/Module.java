
/**
 * Write a description of class Module here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Module
{
   private int credits;
   private double resultaat;
   private String code;
   private Student student;
   
   public Module(Student st, String code, int credits)
   {
       student = st;
       this.code = code;
       this.credits = credits;
   }
   
   public void setResultaat(double d)
   {
       resultaat = d;
   }
   
   public String getCode()
   {
       return code;
   }
   
   public double getResultaat()
   {
       return resultaat;
   }
   
   public int getCredits()
   {
       return credits;
   }
   
   public void print()
   {
       System.out.println(toString());
   }
   
   public String toString()
   {
       int behaald = (resultaat >= 5.5) ? credits : 0;
       return student.toString() + "\t" + code + "\t" + resultaat + "\t" + behaald;
   }
}
