import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
  private ArrayList<Bird> zooBirds;
  public Zoo(){
      zooBirds.add(new Bird("blue" ,"blue jay",2));
      zooBirds.add(new Bird("red,","red cardinal",1));
      
      zooBirds.add(new Bird("blue,","red cardinal",1));
      zooBirds.add(new Bird("blue,","red cardinal",1));
      zooBirds.add(new Bird("red,","red cardinal",1));
      zooBirds.add(new Bird("red,","red cardinal",1));
      zooBirds.add(new Bird("red,","red cardinal",1));
      zooBirds.add(new Bird("blue,","red cardinal",1));
  }
  
  int countBlueBirds(){
      int countBlueBirds=0;
      for (Bird b : zooBirds){
          if (b.getColor().equals("blue")){
              countBlueBirds++;
          }
      }
      return countBlueBirds;
  }
  /**
   * public void countBlueBirds()
   * count=0
   * For each blue birds add 1 to count
   */
}
