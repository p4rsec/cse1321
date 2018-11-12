import java.util.*;
import java.io.*;
class HeadsTails {
	public static void main(String[] args) {
		Counter heads = new Counter();
		Counter tails = new Counter();
		
		int n = 0;
		int min = 1; 
		int max = 2;
		long epoch = System.currentTimeMillis();
		Random rand = new Random(epoch);

		for(int i=0;i<100;i++){
			n = rand.nextInt((max - min) + 1) + min;
			if(n == 1)
				heads.increment();
			else if(n == 2)
				tails.increment();	
		}
		System.out.printf("Heads: %d\n", heads.getValue());
		System.out.printf("Tails: %d", tails.getValue());
	}
}