/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the earth.  The distance is read as input
* from the user.
*
* @author <Manu & Andre>
* @version <05/10/2014>
*/
import java.util.Scanner;

public class EarthGravity {
  
  public static void main(String[] args) {
  Scanner scnr = new Scanner(System.in);
  System.out.println("What is your distance from the center of the Earth in meters?");
  double G = 6.673e-11;
  double M = 5.98e24;
  double distance = scnr.nextDouble();
  double g = 0;
  g = (G * M)/(distance * distance);
  System.out.println("The value of g at " + distance + "m is " + g + " m/s^2.");
   
  return;
  }
  
}
