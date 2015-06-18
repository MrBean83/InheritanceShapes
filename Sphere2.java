/**
 * Created by Henroid83 on 3/28/15.
 */
import java.text.DecimalFormat;

public class Sphere2 extends Circle2 {

    // constructors
    public Sphere2() { super(); }

    public Sphere2(double r) { super(r); }

    // other method

    double calcVolume()			// volume = (4 / 3) * PI * r * r * r
    {
        return (4.0/3.0) * Math.PI * Math.pow(getRadius(), 3);
    }

    // display method

    /*
    blank line
    ***** Sphere *****
    radius			nnnn.nn
    area			nnnn.nn
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
        System.out.println("***** Sphere *****");
        System.out.println("radius\t\t" + df.format(getRadius()));
        System.out.println("area\t\t" + df.format(calcArea()));
        System.out.println("circumference  " + df.format(calcCircumference()));
        System.out.println("volume\t\t" + df.format(calcVolume()));
        System.out.println();
    }
}
