/**
* 
* Determines the distance at which the pulling force between two
* bodies is exactly equal.  
*
* Takes as input the mass of one body, the mass of the other, and
* the distance between the two bodies.
*
* @author <your name>
* @version <date of completion>
*/
import java.util.Scanner;

public class EqualPull {
  
  public static void main(String[] args) {
  Scanner scnr = new Scanner(System.in);
  System.out.println("Enter the mass of the first object in kg.");
  double mass1 = scnr.nextDouble();
  System.out.println("Enter the mass of the second object in kg.");
  double mass2 = scnr.nextDouble();
  System.out.println("Enter the distance between the radiuses of the two objects in meters.");
  double totDistance = scnr.nextDouble();
  double distancefromObject1 = 0;
  double distancefromObject2 = 0;
  distancefromObject1 = totDistance/(Math.sqrt(mass2/mass1) + 1);
  System.out.println("The distance from the first object of the point where the pulling forces are equal is " + distancefromObject1 + "m.");
  distancefromObject2 = totDistance - distancefromObject1;
  System.out.println("The distance of this point from the second object is " + distancefromObject2 + "m.");
   
  return;
  }
  
}