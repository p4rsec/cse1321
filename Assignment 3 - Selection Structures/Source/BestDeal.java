import java.util.*;
import java.io.*;

public class BestDeal
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);

        int lg_weight, lg_price, sm_weight, sm_price, sm_value, lg_value;
        System.out.print("Small box weight (in lbs) = ");
        sm_weight = sc.nextInt();
        System.out.println();
        System.out.print("Price = ");
        sm_price = sc.nextInt();
        System.out.println();
        System.out.print("Large box weight (in lbs) = ");
        lg_weight = sc.nextInt();
        System.out.println();
        System.out.print("Price = ");
        lg_price = sc.nextInt();

        System.out.println("Small box weight: " + sm_weight + " Pounds");
        System.out.println("Small box price: " + sm_price + " Dollars");
        System.out.println("Large box weight: " + lg_weight + " Pounds");
        System.out.println("Large box price: " + lg_price + " Dollars");

        sm_value = sm_price / sm_weight;
        lg_value = lg_price / lg_weight;

        if (lg_value > sm_value)
            System.out.println("Judgement: The small box is a better deal.");
        else if (lg_value < sm_value)
            System.out.println("Judgement: The large box is a better deal.");
        else if (lg_value == sm_value)
            System.out.println("Judgement: The boxes are equal in value.");
    }
}