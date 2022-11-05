/*
(Geography: estimate areas) Use the GPS locations for Atlanta, Georgia; 
Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the fig￾ure in Section 4.1 to compute the estimated area enclosed by these four cities. 
(Hint: Use the formula in Programming Exercise 4.2 to compute the distance 
between two cities. Divide the polygon into two triangles and use the formula in 
Programming Exercise 2.19 to compute the area of a triangle.)
*/

public class AreaBetweenCities {
  
	public static void main(String[] args) {
	    
	    final double radius = 6371.01; // radius of earth
	    
	    //coordinates of the latitudes and longitudes of cities in degrees
	    double x1 = 35.2270869; // Charlotte
	    double y1 = -80.8431267;
	    
	    double x2 = 33.7489954; // Atlanta
	    double y2 = -84.3879824;
	    
	    double x3 = 28.5383355; // Orlando
	    double y3 = -81.3792365;
	    
	    double x4 = 32.0835407; // Savannah
	    double y4 = -81.0998342;
	    
	     // distance between Charlotte and Atlanta
	     double d1 = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
	                 Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
	   
		   // distance between Atlanta and Orlando
	     double d2 = radius * Math.acos(Math.sin(Math.toRadians(x2)) * Math.sin(Math.toRadians(x3)) +
	                 Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y2 - y3)));
	
	     // distance between Orlando and Savannah
	     double d3 = radius * Math.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x4)) +
	                 Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y3 - y4)));
	    
	     // distance between Charlotte and savannah
	     double d4 = radius * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x4)) +
	                 Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y1 - y4)));
	
	    // distance between Savannah and Atlanta
	     double d5 = radius * Math.acos(Math.sin(Math.toRadians(x2)) * Math.sin(Math.toRadians(x4)) +
	                 Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y2 - y4)));
	    
        // area of triangle1 (Charlotte, Atlanta and Savannah)
        double s1 = (d1 + d4 + d5) / 2;
        double area1 = Math.sqrt(s1 * (s1 - d1) * (s1 - d4) * (s1 - d5));
        
        // area of triangle2 (Atalnta, Orlando, Savannah) 
        double s2 = (d2 + d3 + d5) / 2;
        double area2 = Math.sqrt(s2 * (s2 - d2) * (s2 - d3) * (s2 - d5));
        
        // compute and display the area
        double totalArea = area1 + area2;
        System.out.println(totalArea);

	}
}
