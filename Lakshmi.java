import java.awt.*;
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lakshmi implements Shape
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private Color c;
    

    /**
     * Constructor for objects of class Circle
     */
    public Lakshmi(int x, int y, Color c)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.c = c;
        
    }

    /**
     * All shapes must have a draw method
     *
     * @param  g Graphics object must be passed in
     * @return   none
     */
    public void draw(Graphics g){
        g.setColor(c);
        g.fillPolygon(new int[]{100,200, }, new int[]{200, 200,}, 4);
        //String perArea = "Perim: " + perimeter() + " Area: " + area();
        String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
        g.drawString( perArea, x, y -10);
    }
    /**
     * All shapes must have a perimeter method
     *
     * @param    none
     * @return   perimeter
     */
    public double perimeter(){
        return 1;
    }
    /**
     * All shapes must have an area method
     *
     * @param    none
     * @return   area
     */
    public double area(){
        return 1;
    }
}
