/**
* 
* Determines the acceleration due to gravity at some distance
* from the center of the moon.  The distance is read as input
* from the user.
*
* @author <Manu & Andre>
* @version <5/10/2014>
*/

import java.util.Scanner;

public class MoonGravity {
  
  public static void main(String[] args) {
  Scanner scnr = new Scanner(System.in);
  System.out.println("What is your distance from the center of the Moon in meters?");
  double distanceCenterMoon = scnr.nextDouble();
  double G = 6.673e-11;
  double massMoon = 7.34767309e22;
  double gMoon = 0;
  gMoon = (G * massMoon)/(distanceCenterMoon * distanceCenterMoon);
  System.out.println("The value of g at " + distanceCenterMoon + "m is " + gMoon + " m/s^2.");
   
  return;
  }

}