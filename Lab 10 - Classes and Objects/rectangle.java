class Rectangle{
    double width = 1;
    double height = 1;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public double getWidth(){
        return width;
    }

    public double getPerimeter(){
        double perimeter = (height*2)+(width*2);
        return perimeter;
    }

    public double getArea(){
        double area = (height*2)*(width*2);
        return area;
    }
}