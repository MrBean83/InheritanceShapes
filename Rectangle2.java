/**
 * Created by Henry Nichols on 3/28/15.
 */
import java.text.DecimalFormat;

public class Rectangle2 {
    private double length;
    private double width;

    // constructors
    public Rectangle2()
    {
        length = 1;
        width  = 1;
    }

    public Rectangle2(double x)
    {
        length = x;
        width  = x;
    }

    public Rectangle2(double l, double w)
    {
        length = l;
        width  = w;
    }

    // setters
    public void setWidth(double w)
    {
        width = w;
    }

    public void setLength(double l)
    {
        length = l;
    }

    // getters
    public double getWidth() { return width; }

    public double getLength() { return length; }

    // other methods
    public double calcArea()			// area = l * w
    {
        return getLength() * getWidth();
    }

    public double calcCircumference()	// circumference = 2 * l + 2 * w
    {
        return 2 * getLength() + 2 * getWidth();
    }

    // display method

    /*
    blank line
    ***** Rectangle *****
    length			nnnn.nn
    width			nnnn.nn
    circumference	nnnn.nn
    area			nnnn.nn
    blank line
     */

    public void display()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println();
        System.out.println("***** Rectangle *****");
        System.out.println("length\t\t" + df.format(getLength()));
        System.out.println("width\t\t" + df.format(getWidth()));
        System.out.println("circumference  " + df.format(calcCircumference()));
        System.out.println("area\t\t" + df.format(calcArea()));
        System.out.println();
    }
}
