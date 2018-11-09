// Class: CSE1321 
// Section: 09
// Instructor: Kahndal 
// Name: Seth Beckman
// Lab#: 12

class ArrayMethods{
   private static int arrayMax(int[] arr){
      int i = 0;
      int max = 0;
      
      while(i<arr.length){
         if(arr[i] > max)
            max = arr[i];
         i++   
      }
      return max;
   }
   
   private static int arrayMin(int[] arr){
      int i = 0;
      int min = arr[0];
      
      while(i<arr.length){
         if(arr[i]<min)
            min = arr[i];
         i++   
      }
      return arr;
   }
   
   private static void arraySquared(int[] arr){
      int tmp;
      for(int i = 0;i<arr.length;i++){
         tmp = arr[i];
         tmp *= tmp;
         arr[i] = tmp;
      }
      for(int i=0;i<arr.length;i++){
         if(i == (arr.length-1))
            System.out.print("%d\n",arr[i]);
         else
            System.out.print("%d, ",arr[i]);
      }
   }
   
   private static void arrayReverse(int[] arr){
      for(int i = 0; i < arr.length/2; i++){
         int temp = arr[i];
         arr[i] = arr[arr.length - i - 1];
         arr[arr.length - i - 1] = temp;
      }
      for(int i=0;i<arr.length;i++){
         if(i == (arr.length-1))
            System.out.print("%d\n",arr[i]);
         else
            System.out.print("%d, ",arr[i]);
      }
   }
   
   public static void main(String[] args){
      int[] arr = new int[5];
      int i = 0;
      int min = 1; 
      int max = 100;
      long epoch = System.currentTimeMillis();
      Random rand = new Random(epoch);
      while(i<arr.length){
         arr[i] = rand.nextInt((max - min) + 1) + min;
      }
   }
}