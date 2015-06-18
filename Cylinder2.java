/**
 * Created by Henry Nichols on 3/28/15.
 */
import java.text.DecimalFormat;

public class Cylinder2 extends Circle2 {
    private double height;

    // constructors
    public Cylinder2()
    {
        super();
        height = 1;
    }

    public Cylinder2(double r, double h)
    {
        super(r);
        height = h;
    }

    // setter and getter
    public void setHeight(double h)
    {
        height = h;
    }

    public double getHeight()
    {
        return height;
    }

    // other methods
    public double calcArea()		  // area = 2 * (PI * r * r) + (PI * 2 * r) * h
    {
        return 2 * (Math.PI * Math.pow(getRadius(), 2)) + (Math.PI * 2 * getRadius()) * getHeight();
    }

    public double calcVolume()		  // volume = h * (PI * r * r)
    {
        return getHeight() * (Math.PI * Math.pow(getRadius(), 2));
    }

    // display method

    /*
    blank line
    ***** Cylinder *****
    radius			nnnn.nn
    height			nnnn.nn
    surface area		nnnn.nn
    circumference	nnnn.nn
    volume		nnnn.nn
    blank line
     */

    public void display()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println();
        System.out.println("***** Cylinder *****");
        System.out.println("radius\t\t" + df.format(getRadius()));
        System.out.println("height\t\t" + df.format(getHeight()));
        System.out.println("surface area  " + df.format(calcArea()));
        System.out.println("circumference  " + df.format(calcCircumference()));
        System.out.println("volume\t\t" + df.format(calcVolume()));
        System.out.println();
    }
}
