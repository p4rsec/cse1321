import java.io.*;
class FeetMeters{
	public static void feetToMeter() {
		System.out.println("Feet    Meter");
		double feet = 1;
		while(feet <= 20) {
			double meter = feet*.305;
			System.out.printf("%g    %g\n", feet, meter);
         feet++;
		}
	}
	
	public static void meterToFeet() {
		System.out.println("Meter    Feet");
		double meter = 1;
		while(meter <= 20) {
			double feet = meter*3.279;
			System.out.printf("%g    %g\n",meter,feet);
         meter++;
		}
	}
	
	public static void main(String[] args) {
		feetToMeter();
		System.out.println();
		meterToFeet();
	}
}