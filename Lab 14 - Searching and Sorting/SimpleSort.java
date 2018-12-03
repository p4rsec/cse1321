// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 14

import java.util.*;
import java.io.*;
class SimpleSort {
	public static void bubbleSort(int[] arr){
		int swaps, last_swaps = 0;
		do{
			swaps = 0;
			for (int i = 0; i < arr.length - 1; i++){
				for (int j = i; j < arr.length; j++){
					if (arr[j] < arr[i]){
						int temp = arr[j];
						arr[j] = arr[i];
						arr[i] = temp;
						swaps++;
					}
				}
			}
			if(swaps > 0){
				last_swaps = swaps;	
			}
		}
		while(swaps>0);
		
		System.out.print("Bubble Sorted values: ");
		for(int i=0;i<arr.length;i++){
			if(i == arr.length-1){
				System.out.printf("%d\n", arr[i]);
			}
			else{
				System.out.printf("%d, ", arr[i]);
			}
		}
		System.out.println("Bubble Sort swaps: "+ last_swaps);
	}
	
	public static void insertionSort(int[] arr){
//		List<Integer> inOrder = new List<>();
		int swaps = 0;
		for(int j=0;j<arr.length;j++){
			boolean added = false;
			for(int i = 0; i < arr.length; i++){
				if (arr[j] < arr[i]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					added = true;
					swaps++;
					break;
				}
			}
			if (!added);
		}
		
		System.out.print("Insertion Sorted values: ");
		for(int i=0;i<arr.length;i++){
			if(i == arr.length-1){
				System.out.printf("%d\n", arr[i]);
			}
			else{
				System.out.printf("%d, ", arr[i]);
			}
		}
		System.out.println("Insertion Sort swaps: " + swaps);
	}
	
	public static void selectionSort(int[] arr){
		int i = 0;
		int j = 0;
		int swaps = 0;
		for (i = 0; i < arr.length - 1; i++){
			int minPos = i;
			for (j = i + 1; j < arr.length; j++){
				if (arr[j] < arr[minPos])
					minPos = j;
			}
			if (i != minPos && minPos < arr.length){	
				int temp = arr[minPos];
				arr[minPos] = arr[i];
				arr[i] = temp;
			}
			swaps++;
		}
		
		System.out.print("Selection Sorted values: ");
		for(i=0;i<arr.length;i++){
			if(i == arr.length-1){
				System.out.printf("%d\n", arr[i]);
			}
			else{
				System.out.printf("%d, ", arr[i]);
			}
		}
		System.out.println("Selection Sort swaps: "+ swaps);
	}
	
	public static void main(String[] args) {
		int[] arr = new int[50];
		int i = 0;
		int min = 1; 
		int max = 100;
		long epoch = System.currentTimeMillis();
		Random rand = new Random(epoch);
		while(i<arr.length){
			arr[i] = rand.nextInt((max - min) + 1) + min;
			i++;
		}
		
		bubbleSort(arr);
		System.out.println();
		insertionSort(arr);
		System.out.println();
		selectionSort(arr);
	}
}