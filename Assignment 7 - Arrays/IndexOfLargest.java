import java.util.*;
class IndexOfLargest {
	public static int findIndex(int[] arr){
		int i = 0;
		int index = 0;
		while(i < arr.length){
			if(index < arr[i])
				index = i;
			else
				i++;
		}	
		return index;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("please enter 10 integers: ");
		for(int i = 0;i<10;i++){
			int num = sc.nextInt();
			arr[i] = num;
		}
		System.out.printf("The index of the largest value is %d",findIndex(arr));
	}
}