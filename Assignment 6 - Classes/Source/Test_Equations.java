class Test_Equations {
	public static void main(String[] args) {
		QuadraticEquation eq1 = new QuadraticEquation(3, 8, 4);
		QuadraticEquation eq2 = new QuadraticEquation(3, 4, 8);
		QuadraticEquation eq3 = new QuadraticEquation(2, 8, 2);
		
		// tests for eq1
		System.out.println("Sample run 1 for 3x^2+8x+4:");
		System.out.printf("a = %d\n", eq1.getA());
		System.out.printf("b = %d\n", eq1.getB());
		System.out.printf("c = %d\n", eq1.getC());
		if(eq1.getDiscriminant() < 0){
			System.out.println("Root 1 is Undefined");
			System.out.println("Root 2 is Undefined");
		}
		else if(eq1.getDiscriminant() >= 0){
			System.out.printf("Root 1 = %g\n", eq1.getRoot1(eq1.getDiscriminant()));
			System.out.printf("Root 2 = %g\n", eq1.getRoot2(eq1.getDiscriminant()));
		}
		
		// tests for eq2
		System.out.println();
		System.out.println("Sample run 2 for 3x^2+4x+8:");
		System.out.printf("a = %d\n", eq2.getA());
		System.out.printf("b = %d\n", eq2.getB());
		System.out.printf("c = %d\n", eq2.getC());
		if(eq2.getDiscriminant() < 0){
			System.out.println("Root 1 is Undefined");
			System.out.println("Root 2 is Undefined");
		}
		else if(eq2.getDiscriminant() >= 0){
			System.out.printf("Root 1 = %g\n", eq2.getRoot1(eq2.getDiscriminant()));
			System.out.printf("Root 2 = %g\n", eq2.getRoot2(eq2.getDiscriminant()));
		}
		
		// tests for eq3
		System.out.println();
		System.out.println("Sample run 3 for 2x^2+8x+2:");
		System.out.printf("a = %d\n", eq3.getA());
		System.out.printf("b = %d\n", eq3.getB());
		System.out.printf("c = %d\n", eq3.getC());
		if(eq3.getDiscriminant() < 0){
			System.out.println("Root 1 is Undefined");
			System.out.println("Root 2 is Undefined");
		}
		else if(eq3.getDiscriminant() >= 0){
			System.out.printf("Root 1 = %g\n", eq3.getRoot1(eq3.getDiscriminant()));
			System.out.printf("Root 2 = %g\n", eq3.getRoot2(eq3.getDiscriminant()));
		}
	}
}