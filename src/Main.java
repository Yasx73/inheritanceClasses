public class Main {
    public static void main(String[] args) {
        System.out.println("*******AREA AND PERIMETER*******");
        System.out.println("---------------------------------------------------------" +
                "-------------------------------");
        System.out.println("Note: u^2 are square units for the area of the figure and" +
                " u are units for the perimeter.");
        System.out.println("---------------------------------------------------------" +
                "-------------------------------");
        System.out.println(">>>Triangle:");
        Triangle trianglex = new Triangle(0,0,0,0,0,0);
        trianglex.calcAreaPerimeterTriangle(3,6,5,5);
        System.out.println("---------------------------------------------------------" +
                "-------------------------------");
        System.out.println(">>>Square:");
        Square squarex = new Square(0,0,0);
        squarex.calcAreaPerimeterSquare(13);
        System.out.println("---------------------------------------------------------" +
                "-------------------------------");
        System.out.println(">>>Rectangle:");
        Rectangle rectanglex = new Rectangle(0,0,0,0);//valores iniciales
        rectanglex.calcAreaPerimeterRectangle(15,8);
    }
}
