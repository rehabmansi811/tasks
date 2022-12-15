 //find area and perimeter for each circle and triangle in 2 classes
package task_6;

 //invoke  all build in class in util package
import java.util.*;
//class contain two methods to get area and perimeter for circle 
 class circle {
    public double getArea(double r){
     return (Math.PI*r*r);
    }
    public double gerPerimeter(double r){
      return (2*Math.PI*r);
    }
    }
//class contain two methods to get area and perimeter for triangle
class triangle{
    double getArea(double h,double b){
    return (0.5*h*b);
    }
    double getPerimeter (double a, double b, double c){
    return (a+b+c);
    }
}  
public class Task_6 {

    public static void main(String[] args) {
      circle cir1 = new circle ();
      //enter radius of a circle 
      System.out.println("enter the radius of the circle:");
      Scanner input = new Scanner (System.in);
      double radius =input.nextDouble();
      // prinr the area and perimeter of circle
      System.out.println("the area is  "+cir1.getArea(radius));
      System.out.println("the perimeter is  "+cir1.gerPerimeter(radius));
      //enter tringle diminsions
      System.out.println("enter the three diminsions of the triangle and the hight:");
      double a=input.nextDouble();
      double b=input.nextDouble();
      double c=input.nextDouble();
      double h=input.nextDouble();
      triangle tri1= new triangle();
      // prinr the area and perimeter of tringle
      System.out.println("the area is  "+tri1.getArea(h,b));
      System.out.println("the perimeter is  "+tri1.getPerimeter(a,b,c));
    }
    
}
