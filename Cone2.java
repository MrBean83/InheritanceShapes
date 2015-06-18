/**
 * Created by Henry Nichols on 3/28/15.
 */
import java.text.DecimalFormat;

public class Cone2 extends Circle2 {
    private double height;

    // constructors
    public Cone2()
    {
        super();
        height = 1;
    }

    public Cone2(double r, double h)
    {
        super(r);
        height = h;
    }

    // setter and getter
    public void setHeight(double h) { height = h; }

    public double getHeight() { return height; }

    // other methods
    public double calcArea()			// area = (π * R) * [sqrt(R² + H²)]  + π * R2
    {
        return Math.PI * getRadius() * (Math.sqrt(Math.pow(getRadius(), 2) + Math.pow(getHeight(), 2))) + Math.PI * Math.pow(getRadius(),2);
    }

    public double calcVolume()		// volume = 1 / 3 * h * (PI * r * r)
    {
        return (1.0/3.0) * getHeight() * (Math.PI * Math.pow(getRadius(), 2));
    }

    // display method

    /*
    blank line
    ***** Cone *****
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
        System.out.println("***** Cone *****");
        System.out.println("radius\t\t" + df.format(getRadius()));
        System.out.println("height\t\t" + df.format(getHeight()));
        System.out.println("surface area  " + df.format(calcArea()));
        System.out.println("circumference  " + df.format(calcCircumference()));
        System.out.println("volume\t\t" + df.format(calcVolume()));
        System.out.println();
    }
}
