import java.util.*;
import java.io.*;
public class bmr
{
    public static double maleBMR(int height, int weight, int age)
    {
        double bmr = 66+(6.23 * weight) + (12.7 * height) - (6.8 * age);
        return bmr;
    }

    public static double femaleBMR(int height, int weight, int age)
    {
        double bmr = 655+(4.35 * weight) + (4.7 * height) - (4.7 * age);
        return bmr;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double bmr = 0;
        double kcal = 0;
        
        System.out.print("Sex (f or m)? ");
        char sex = sc.next().charAt(0);
        System.out.print("Weight? ");
        int weight = sc.nextInt();
        System.out.print("Height? ");
        int height = sc.nextInt();
        System.out.print("Age? ");
        int age = sc.nextInt();
        System.out.println("How much do you exercise?");
        System.out.print("1. You don't exercise.\n" +
                "2. You engage in light exercise one to three days a week.\n" +
                "3. You exercise moderately three to five days a week.\n" +
                "4. You exercise intensely six to seven days a week.\n" +
                "5. You exercise intensely six to secen days a week and have a physically active job.\n");
        int exercise = sc.nextInt();

        if(sex == 'f' || sex == 'F')
        {
            bmr = femaleBMR(height, weight, age);
        }
        else if(sex == 'm' || sex == 'M')
        {
            bmr = maleBMR(height, weight, age);
        }

        switch(exercise) {
            case 1:
                kcal = bmr * 1.2;
                break;
            case 2:
                kcal = bmr * 1.375;
                break;
            case 3:
                kcal = bmr * 1.55;
                break;
            case 4:
                kcal = bmr * 1.725;
                break;
            case 5:
                kcal = bmr * 1.9;
                break;
            default:
                System.out.println("Something went horribly wrong.");
                break;
        }

        System.out.printf("%c, %d]\", %d lbs, Age %d, BMR: %f, Exercise %d, DCA(Daily KCal): %f"
                , sex, height, weight, age, bmr, exercise, kcal);
    }
}