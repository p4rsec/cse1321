// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 11

class Circle {
	double radius = 1;
	final double pi = 3.14;
	
	// default no-argument constructor
	public Circle(){
		this.radius = radius;
	}
	
	// constructor for circle with area input
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public void setRadius(double radius){
		radius = radius;
	}
	
	public double getArea(){
		double area = pi*(radius*radius);
		return area;
	}
	
	public double getPerimeter(){
		double perimeter = radius*(2*pi);
		return perimeter;
	}
	
	public String toString(){
		return "This circle has radius " + radius;
	}

}