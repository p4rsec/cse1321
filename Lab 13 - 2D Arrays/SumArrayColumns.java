// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 13

import java.io.*;
import java.util.*;
class SumArrayColumns {
	public static int[] sumColumn(int[][] matrix){
		int[] sums = new int[matrix[0].length];
		int c = 0, i = 0;
		do{
			int sum = 0;
			for(int r=0;r<matrix.length;r++){
				sum += matrix[r][c];
			}
			sums[i] = sum;
			i++;
			c++;
		}
		while(c<matrix[0].length);
		return sums;
	}
	
	public static void main(String[] args) {
		int[][] matrix = new int[3][4]; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the values for a 3x4 array:");
		
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
		
		int[] sums = sumColumn(matrix);
		for(int i=0;i<sums.length;i++){
			System.out.printf("Sum of column %d is %d\n",i,sums[i]);
		}
	}
} 