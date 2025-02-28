
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
  /**
   * public int eligiityToDrive (int birthpay)
   * { age= currentYear-birthyear
   *     if(age>=16){System.out.println("eligible to drive in Canada);}
   *     Else { System.out.println("wait"+ ( 16-age)+years);}
   *     return age}
   *     
   */
   private int currentYear=2025;
   
   public int eligibilityToDrive(int birthyear)
   { if ((currentYear-birthyear)>=16)
       {System.out.println("eligible to drive in Canada");}
     else {System.out.println("wait"+(16-(currentYear-birthyear))+"years");}
     return (currentYear-birthyear);
     
    
    
    
    
   
   

    }}
    