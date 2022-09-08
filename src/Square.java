public class Square extends Figure{
    private double side;

    public Square(double area, double perimeter, double side) {
        super(area, perimeter);
        this.side = side;
    }
    public void calcAreaPerimeterSquare(double side){
        double area, perimeter;
        area=side*side;
        perimeter=4*side;
        System.out.println("The area of the square is: "+area+" u^2.");
        System.out.println("The perimeter of the square is: "+perimeter+" u.");
    }
}
