import java.awt.*;
import java.util.ArrayList;
/**
 * Benefits of polymorphism shown here:
 * polymorphism:    Ability for the same code to be used with 
 *                  different types of objects and behave 
 *                  differently with each.
 *
 *
 * @author (Mrs. Hardy)
 * @version (1.1)
 */
public class ShapeClient
{
    public static void main(String args[])
    {
      DrawingPanel draw = new DrawingPanel(1200,1200);
      Graphics g = draw.getGraphics();
      int startX = 100;
      int startY = 250;
      
      Circle c = new Circle(startX, startY, startX/3, Color.BLUE);
      Rectangle r = new Rectangle(startX * 3, startY, Color.blue);
      Triangle t = new Triangle(startX * 6, startY, Color.blue);
      
      r.draw(g);
      c.draw(g);
      t.draw(g);
      printInfo(c, r);
    } 
    
    public static void printInfo(Shape s, Shape r){
        System.out.println("The shape is : " + s);
        System.out.println("area : " + s.area() );
        System.out.println("perimeter : " + s.perimeter() );
        System.out.println("The shape is : " + r);
        System.out.println("area : " + r.area() );
        System.out.println("perimeter : " + r.perimeter() );
    }
    
    
}
