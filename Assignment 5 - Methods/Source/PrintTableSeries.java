import java.util.*;
class PrintTableSeries{
    public static void displaySums(int n){
        System.out.print("i    sum(i)\n");
        double sum = 0;
        double num = 0;
        for(int i=1;i<n;i++){
            num = i;
            sum = sum + (num/(num+1));
            System.out.printf("%d    %g\n",i,sum);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        displaySums(num);
    }
}