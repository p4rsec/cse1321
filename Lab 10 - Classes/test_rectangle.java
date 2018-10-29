class Test_Rectangles{
    public static void main(String[] args){
        // declares two rectangles, giving them height and with
        Rectangle rect1 = new Rectangle(1,1);
        Rectangle rect2 = new Rectangle(5,6);

        // prints out first rectangle
        System.out.printf("First object:\n");
        System.out.printf("Height: %g\n", rect1.getHeight());
        System.out.printf("Width: %g\n", rect1.getWidth());
        System.out.printf("Area: %g\n", rect1.getArea());
        System.out.printf("Perimeter: %g\n", rect1.getPerimeter());

        // prints out second rectangle
        System.out.printf("Second object:\n");
        System.out.printf("Height: %g\n", rect2.getHeight());
        System.out.printf("Width: %g\n", rect2.getWidth());
        System.out.printf("Area: %g\n", rect2.getArea());
        System.out.printf("Perimeter: %g\n", rect2.getPerimeter());
    }
}