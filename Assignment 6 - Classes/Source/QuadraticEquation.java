class QuadraticEquation {
	private int a, b, c = 0;
	
	public QuadraticEquation(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA(){
		return a;
	}
	
	public int getB(){
		return b;
	}
	
	public int getC(){
		return c;
	}
	
	public double getDiscriminant(){
		double disc = (b*b)-(4*a*c);
		return disc;
	}
	
	public double getRoot1(double disc){
		double root1 = (((-b)+(Math.sqrt(disc))/(2*a)));
		return root1;
	}
	
	public double getRoot2(double disc){
		double root2 = (((-b)-(Math.sqrt(disc))/(2*a)));
		return root2;
	}
	
}