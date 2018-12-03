import java.util.*;
class Occurences {
	public static void Count(int[] arr){
		int count = 0;
		for(int i=0;i<arr.length;i++){
			int num = arr[i];
			for(int n=0;n<arr.length;n++){
				if(arr[n]==num);
					count++;	
			}
			System.out.printf("%d occurred %d times\n",arr[i],count);	
			count = 0;
		}	
	}	

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("please enter 10 integers: ");
		for(int i = 0;i<10;i++){
			int num = sc.nextInt();
			arr[i] = num;
		}
		Count(arr);
	}	
}	

	
