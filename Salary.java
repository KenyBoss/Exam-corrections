
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
// public int getNetPay(int workedhours,int hourlywage){
 //   salary= workedhours*hourlywage;
 // netpay= salary-(salary*30%);
 //System.out.println(netpay);
 
 
 private double hours;
 private double netpay;
 private double salary;
 
 
 
 public void getNetPay( double workedhours,double hourlywage){
     salary= workedhours*hourlywage;
     netpay=salary-(salary*0.3);
     System.out.println(netpay);
    
     
 }
 
}
    
    
    



