// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 13

import java.util.*;
import java.io.*;
class LocateLargestElement {
	public static int[] locateLargest(int[][] matrix){
		int r = 0;
		int[] largest = new int[2];
		do{
			for(int c=0;c<matrix[0].length;c++){
				if(matrix[r][c]>0)
					largest[0] = r;
					largest[1] = c;
			}
			r++;
		}
		while(r<matrix.length);
		
		return largest;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matrix = new int[3][4];
		
		// accepts user input for each matrix index
		int r = 0;
		do{
			System.out.printf("Row %d:\n",r);
			for(int c=0;c<matrix[0].length;c++){
				matrix[r][c] = sc.nextInt();
			}
			r++;
		}
		while(r<matrix.length);
		
		// prints out the matrix
		System.out.println("Entered matrix: ");
		r = 0;
		do{
			for(int c=0;c<matrix[0].length;c++){
				System.out.printf("%d\t",matrix[r][c]);
			}
			System.out.println();
			r++;
		}
		while(r<matrix.length);
		
		int[] largest = locateLargest(matrix);
		
		System.out.printf("First largest value is located at row %d and column %d",largest[0],largest[1]);
	}
}