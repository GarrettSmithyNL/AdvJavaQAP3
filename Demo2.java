public class Demo2 {
  public static void main(String[] args) {
    // Test the Shape class
    Shape S = new Shape("Red", true);

    // Test the Circle class
    Circle C = new Circle(5.0);
    Circle C1 = new Circle(5.0,"blue",true);
    
    // Test the Rectangle class
    Rectangle R = new Rectangle(2.0,3.0);
    Rectangle R1 = new Rectangle(2.0,3.0,"green",false);
    
    // Test the Square class
    Square Sq = new Square(4.0);
    Square Sq1 = new Square(4.0,"yellow",true);
    
    // Pring Shape S
    System.out.println(S);

    // Print Circle C
    System.out.println(C);

    //Printing (C.getArea() and C.getPerimeter())
    System.out.println("The area of C is: " + C.getArea() + " and the perimeter is: " + C.getPerimeter());

    // Print Circle C1
    System.out.println(C1);

    // Printing(C1.getArea() and C1.getPerimeter())
    System.out.println("The area of C1 is: " + C1.getArea() + " and the perimeter is: " + C1.getPerimeter());

    // Print Rectangle R
    System.out.println(R);

    // Printing(R.getArea() and R.getPerimeter())
    System.out.println("The area of R is: " + R.getArea() + " and the perimeter is: " + R.getPerimeter());

    // Print Rectangle R1
    System.out.println(R1);
  
    // Printing (R1.getArea() and R1.getPerimeter())
    System.out.println("The area of R1 is: " + R1.getArea() + " and the perimeter is: " + R1.getPerimeter());

    // Print Square Sq
    System.out.println(Sq);

    // Printing (sq.getArea() and sq.getPerimeter())
    System.out.println("The area of Sq is: " + Sq.getArea() + " and the perimeter is: " + Sq.getPerimeter());

    // Print Square Sq1
    System.out.println(Sq1);

    // Printing (sq1.getArea() and sq1.getPerimeter())
    System.out.println("The area of Sq1 is: " + Sq1.getArea() + " and the perimeter is: " + Sq1.getPerimeter());
  }
  
}
