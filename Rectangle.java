import java.awt.*;
/**
 * Write a description of class Square here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle implements Shape{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int height;
    private int width;
    private Color c;
    
    /**
     * Constructor for objects of class Square
     */
    public Rectangle(int x, int y, Color c)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
        this.c = c;
        width = 60;
        height = 120;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw(Graphics g)
    {
        // put your code here
       g.setColor(c);
       g.fillRect(x, y, width, height);
       String perArea = "Perim: " + String.format("%.3f", perimeter()) + " Area: " + String.format("%.3f",area());
       g.drawString( perArea, x, y -10);;
        //String perArea = "Perim: " + perimeter() + " Area: " + area();
    }
    
    public double perimeter(){
        return (width * 2) + (height * 2);
    }
    
    public double area(){
        return width * height;
    }
}
