// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 11

class Circle_Test {
	public static void main(String[] args) {
		// instantiates two circle objects
		Circle circle1 = new Circle();
		Circle circle2 = new Circle(10);
		
		// circle 1 tests
		System.out.printf("Print radius:\n\tThe radius is %g.\n", circle1.getRadius());
		System.out.printf("Print area:\n\tThe area is %g.\n", circle1.getArea());
		System.out.printf("Print perimeter:\n\tThe perimeter is %g.\n", circle1.getPerimeter());
		
		System.out.println();
		
		// circle 2 tests
		System.out.printf("Print radius:\n\tThe radius is %g.\n", circle2.getRadius());
		System.out.printf("Print area:\n\tThe area is %g.\n", circle2.getArea());
		System.out.printf("Print perimeter:\n\tThe perimeter is %g.\n", circle2.getPerimeter());
		
	}
}