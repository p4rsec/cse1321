// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 13

import java.util.*;
class AddMatrices {
	public static int[][] addition(int[][] matrix1, int[][] matrix2){
		int[][] matrixSum = new int[3][3];
		
		int r = 0;
		do{
			for(int c=0;c<3;c++){
				matrixSum[r][c] = matrix1[r][c] + matrix2[r][c];
			}
			r++;
		}
		while(r<3);
		
		return matrixSum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] matrix1 = new int[3][3]; 
		int[][] matrix2 = new int[3][3];
		int[][] matrixSum = new int[3][3];
		
		int r = 0;
		do{
			System.out.printf("Matrix 1: Row %d:\n",r);
			for(int c=0;c<matrix1[0].length;c++){
				matrix1[r][c] = sc.nextInt();
			}
			r++;
		}
		while(r<matrix1.length);
		
		r = 0;
		do{
			System.out.printf("Matrix 2: Row %d:\n",r);
			for(int c=0;c<matrix2[0].length;c++){
				matrix2[r][c] = sc.nextInt();
			}
			r++;
		}
		while(r<matrix2.length);
		
		matrixSum = addition(matrix1, matrix2);
		
		// prints out the matrix
		System.out.println("Matrix 1: ");
		r = 0;
		do{
			for(int c=0;c<matrix1[0].length;c++){
				System.out.printf("%d\t",matrix1[r][c]);
			}
			System.out.println();
			r++;
		}
		while(r<matrix1.length);
		
		// prints out the matrix
		System.out.println("Matrix 2: ");
		r = 0;
		do{
			for(int c=0;c<matrix2[0].length;c++){
				System.out.printf("%d\t",matrix2[r][c]);
			}
			System.out.println();
			r++;
		}
		while(r<matrix2.length);
		
		// prints out the matrix
		System.out.println("Matrices Sum: ");
		r = 0;
		do{
			for(int c=0;c<matrixSum[0].length;c++){
				System.out.printf("%d\t",matrixSum[r][c]);
			}
			System.out.println();
			r++;
		}
		while(r<matrixSum.length);
	}
}