/**
 * Created by Henry Nichols on 3/28/15.
 */
import java.text.DecimalFormat;

public class Box2 extends Rectangle2 {
    private double height;

    // constructors
    public Box2()
    {
        super();
        height = 1;
    }

    public Box2(double x)
    {
        super(x);
        height = x;
    }

    public Box2(double l, double w, double h)
    {
        super(l,w);
        height  = h;
    }

    // setter and getter
    public void setHeight(double h) { height = h; }

    public double getHeight() { return height; }

    // other methods
    public double calcArea()		// area = 2 * l * w + 2 * l * h + 2 * w * h
    {
        return 2 * getLength() * getWidth() + 2 * getLength() * getHeight() + 2 * getWidth() * getHeight();
    }

    public double calcVolume()	// volume   =  l * w * h
    {
        return getLength() * getWidth() * getHeight();
    }

    // display method

    /*
    blank line
    ***** Box *****
    length			nnnn.nn
    width			nnnn.nn
    height			nnnn.nn
    surface area		nnnn.nn
    volume		nnnn.nn
    blank line
     */

    public void display()
    {
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        df.setMinimumFractionDigits(2);
        System.out.println();
        System.out.println("***** Box *****");
        System.out.println("length\t\t" + df.format(getLength()));
        System.out.println("width\t\t" + df.format(getWidth()));
        System.out.println("height\t\t" + df.format(getHeight()));
        System.out.println("surface area  " + df.format(calcArea()));
        System.out.println("volume\t\t" + df.format(calcVolume()));
        System.out.println();
    }
}
