// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 14

import java.util.*;
import java.io.*;
class LinearBinarySearch {
	public static int LinearSearch(int[] arr, int target){
		int iterations = 0;
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == target){
				iterations = i;
			}
		}
		iterations++;
		if (iterations == 0){
			iterations = -1;
		}
		return iterations;
	}
	
	public static int BinarySearch(int[] arr, int target){
		int low=0,high=arr.length,mid=0,iterations=0;
		boolean found = false;
		Arrays.sort(arr);
		
		while(found == false){
			iterations++;
			mid = (low+high)/2;
			if(target == arr[mid]){
				found = true;
			}
			else if(target<arr[mid]){
				high = mid;
			}
			else {
				low = mid;
			}
			if(low>high-1 || high<low+1)
				found = false;
		}
		iterations++;
		if(found == true)
			return iterations;
		else
			return -1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int target;
		
		System.out.println("Please enter 6 values:");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Target value: ");
		target = sc.nextInt();
		
		System.out.println();
		int linearComparisons = LinearSearch(arr, target);
		if(linearComparisons == -1){
			System.out.println("The target number was not found.");
		}
		else {
			System.out.printf("Linear Search Comparisons: %d\n",linearComparisons);
		}
		
		int binaryComparisons = BinarySearch(arr, target);
		if(binaryComparisons == -1){
			System.out.println("The target number was not found.");
		}	
		else {
			System.out.printf("Binary Search Comparisons: %d",binaryComparisons);
		}	
	}
}