package Class21;

public class Task2 {
   /* Write a program: Shape class has a constructor that takes the radius and has a subclass as circle class.
    In circle class creeate a method to calculate the area of circle. Test your code */
}
class Shape {
    double radius;
    Shape(double radius){
        this.radius=radius;

    }
    }
    class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void calculateAndPrintArea(){
        double area=Math.PI*Math.pow(radius,2);
    }
    }
