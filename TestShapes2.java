/**
 * Created by Henroid83 on 3/28/15.
 */
public class TestShapes2 {
    public static void main(String args[])
    {
        // Testing the Circle class

        Circle2 cir1, cir2;
        cir1 = new Circle2();
        cir2 = new Circle2(12.5);

        cir1.display();
        cir2.display();

        cir1.setRadius(23);
        cir1.display();

        // Testing the Sphere class

        Sphere2 sph1, sph2;
        sph1 = new Sphere2();
        sph2 = new Sphere2(7);

        sph1.display();
        sph2.display();

        sph1.setRadius(3);
        sph1.display();

        // Testing the Cylinder class

        Cylinder2 cyl1, cyl2;
        cyl1 = new Cylinder2();
        cyl2 = new Cylinder2(5, 10);

        cyl1.display();
        cyl2.display();

        cyl1.setRadius(2);
        cyl1.setHeight(4.5);
        cyl1.display();

        // Testing the Cone class

        Cone2 cn1, cn2;
        cn1 = new Cone2();
        cn2 = new Cone2(3, 4);

        cn1.display();
        cn2.display();

        cn1.setRadius(6);
        cn1.setHeight(5);
        cn1.display();

        // Testing the Rectangle class

        Rectangle2 r1, r2, r3;
        r1 = new Rectangle2();
        r2 = new Rectangle2(2);
        r3 = new Rectangle2(4, 12);

        r1.display();
        r2.display();
        r3.display();

        r1.setWidth(2.5);
        r1.setLength(5.25);
        r1.display();

        // Testing the Box class

        Box2 b1, b2, b3;
        b1 = new Box2();
        b2 = new Box2(3.33);
        b3 = new Box2(10, 5, 2.5);

        b1.display();
        b2.display();
        b3.display();

        b1.setLength(15);
        b1.setWidth(6.5);
        b1.setHeight(8.7);
        b1.display();
    }
}
