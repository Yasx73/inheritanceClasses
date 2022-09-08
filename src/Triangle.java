public class Triangle extends Figure{
    private double base, height, side1, side2;

    public Triangle(double area, double perimeter, double base, double height, double side1, double side2) {
        super(area, perimeter);
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public void calcAreaPerimeterTriangle(double base, double height, double side1, double side2){
        double area, perimeter;
        area=(base*height)/2;
        perimeter=base+side1+side2;
        System.out.println("The area of the triangle is: "+area+" u^2.");
        System.out.println("The perimeter of the triangle is: "+perimeter+" u.");
    }
}
