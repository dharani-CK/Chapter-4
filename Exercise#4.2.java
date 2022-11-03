/*
This program prompts the user to enter the latitude and longitude of two points on the earth in degrees and displays its great circle distance. 
The average radius of the earth is 6,371.01 km
*/

import java.util.Scanner; // importing scanner class

public class GreatCircleDistance {
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in); // creating a new scanner class object
	    
	    // prompt the user to enter point 1
		  System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
		  double x1 = input.nextDouble();
		  double y1 = input.nextDouble();
		  
		  // prompt the user to enter point 2
		  System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
		  double x2 = input.nextDouble();
		  double y2 = input.nextDouble();
		  
      // creating a variable to store the value of radius
		  final double radius = 6371.01;
		
		  // calculate the great circle distance
		  double a = Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2));
		  double b = Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2));
		  double c = Math.cos(Math.toRadians(y1 - y2));
		  double distance = radius * Math.acos(a + b * c);
		
		  //display the great circle distance
		  System.out.println("The distance between the two points is " + distance + " km");
		
	}
}
