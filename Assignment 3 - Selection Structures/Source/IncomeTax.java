import java.util.*;
import java.io.*;

public class IncomeTax
{
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int income, bracket, due;

        System.out.print("Input annual income: ");
        income = sc.nextInt();

        if (income <= 50000)
            bracket = 5;
        else if (income <= 50000 && income <= 200000)
            bracket = 10;
        else if (income <= 200000 && income <= 400000)
            bracket = 15;
        else if (income <= 400000 && income <= 900000)
            bracket = 25;
        else if (income > 900000)
            bracket = 35;

        switch (bracket)
        {
            case 5:
                due = income * .05;
                break;
            case 10:
                due = 50000 * .05;
                income = income - 50000;
                due = due + (income * .1);
                break;
            case 15:
                due =

                break;
            case 25:
                due = 50000 * .05;
                due = due + (100000 * .1);
                due = due + (200000 * .15);

                income = income - 200000;
                due = due + (income * .25);
                break;
            case 35:
                due = 50000 * .05;
                due = due + (100000 * .1);
                due = due + (200000 * .15);
                due = due + ()
                break;
            default:
                break;
        }

        System.out.println("Annual Income: " + income);
        System.out.println("Tax Bracket: " + bracket + "%");
        System.out.println("Tax due: " + due);
    }
}