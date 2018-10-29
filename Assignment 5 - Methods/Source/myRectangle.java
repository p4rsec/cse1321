import java.util.*;
import java.io.*;
class myRectangle{
    public static boolean isValid(double width, double height){
        if((width+height)>30)
            return true;
        else
            return false;
    }

    public static double Area(double width, double height){
        double area = width*height;
        return area;
    }

    public static double Perimeter(double width, double height){
        double perimeter = (width*2)+(height*2);
        return perimeter;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double width = 0;
        double height = 0;
        
        do {
            System.out.println("Please input width and height: ");
            width = sc.nextDouble();
            height = sc.nextDouble();
            if(isValid(width, height) == false)
                System.out.println("Sorry, that's not a valid rectangle. Try again.");
        }
        while(isValid(width,height) != true);

        System.out.printf("Entered width: %g\n", width);
        System.out.printf("Entered height: %g\n", height);
        System.out.printf("Area: %g\n", Area(width,height));
        System.out.printf("Perimeter: %g\n", Perimeter(width,height));
    }
}