public class Rectangle extends Figure{
    private double base, height;

    public Rectangle(double area, double perimeter, double base, double height) {
        super(area, perimeter);
        this.base = base;
        this.height = height;
    }

    public void calcAreaPerimeterRectangle(double base, double height){
        double area, perimeter;
        area=base*height;
        perimeter=(2*base)+(2*height);
        System.out.println("The area of the rectangle is: "+area+" u^2.");
        System.out.println("The perimeter of the rectangle is: "+perimeter+" u.");
    }
}
