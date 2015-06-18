/**
 * Created by Henry Nichols on 3/28/15.
 */
import java.text.DecimalFormat;

public class Circle2 {
    private double radius;

    // constructors
    public Circle2()
    {
        radius = 1;
    }

    public Circle2(double r)
    {
        radius = r;
    }

    // setter and getter
    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius() { return radius; }

    // other methods
    public double calcArea()			// area = PI * r * r
    {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double calcCircumference()	// circumference = PI * 2 * r
    {
        return Math.PI * 2 * getRadius();
    }

    // display method

    /*
    blank line
    ***** Circle *****
    radius			nnnn.nn
    area			nnnn.nn
    circumference	nnnn.nn
    blank line
    */

    public void display()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println();
        System.out.println("***** Circle *****");
        System.out.println("radius\t\t" + df.format(getRadius()));
        System.out.println("area\t\t" + df.format(calcArea()));
        System.out.println("circumference  " + df.format(calcCircumference()));
        System.out.println();
    }
}
