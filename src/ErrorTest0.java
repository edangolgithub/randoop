import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        Point point0 = null;
        Vector vector2 = new Vector(point0, (java.lang.Integer) (-1));
        Point point3 = vector2.getOrigin();
        Point point6 = new Point((double) 100L, (double) (byte) -1);
        Line line7 = new Line(point3, point6);
        Point point10 = new Point((double) 100L, (double) (byte) -1);
        line7.point1 = point10;
        Point point12 = line7.point1;
        double double13 = point12.y;
        point12.y = 100.0f;
        Point point16 = null;
        Vector vector18 = new Vector(point16, (java.lang.Integer) (-1));
        Point point19 = vector18.getOrigin();
        Point point20 = vector18.origin;
        point20.x = 100.0f;
        Point point23 = null;
        Vector vector25 = new Vector(point23, (java.lang.Integer) (-1));
        Point point26 = vector25.getOrigin();
        Point point29 = new Point((double) 100L, (double) (byte) -1);
        Line line30 = new Line(point26, point29);
        Point point31 = null;
        Vector vector33 = new Vector(point31, (java.lang.Integer) (-1));
        Point point34 = vector33.getOrigin();
        Point point37 = new Point((double) 100L, (double) (byte) -1);
        Line line38 = new Line(point34, point37);
        Line line39 = line30.rotate(point37);
        Point point40 = null;
        Vector vector42 = new Vector(point40, (java.lang.Integer) (-1));
        Point point43 = vector42.getOrigin();
        boolean boolean45 = point43.equals((java.lang.Object) "");
        line30.point2 = point43;
        Parabola parabola47 = new Parabola(point12, point20, line30);
        Point point48 = null;
        Vector vector50 = new Vector(point48, (java.lang.Integer) (-1));
        Point point51 = vector50.getOrigin();
        Point point52 = vector50.origin;
        Vector vector54 = new Vector(point52, (java.lang.Integer) 100);
        double double55 = point52.y;
        parabola47.setVertex(point52);
        Point point57 = null;
        Vector vector59 = new Vector(point57, (java.lang.Integer) (-1));
        Point point60 = vector59.getOrigin();
        Point point63 = new Point((double) 100L, (double) (byte) -1);
        Line line64 = new Line(point60, point63);
        Point point67 = new Point((double) 100L, (double) (byte) -1);
        line64.point1 = point67;
        parabola47.directrix = line64;
        java.lang.Object obj70 = null;
        boolean boolean71 = parabola47.equals(obj70);
        Point point72 = null;
        Vector vector74 = new Vector(point72, (java.lang.Integer) (-1));
        Point point75 = vector74.getOrigin();
        point75.Mirror("");
        parabola47.setFocus(point75);
        Point point79 = parabola47.vertex;
        Line line80 = parabola47.getDirectrix();
        Line line81 = parabola47.directrix;
        Line line82 = null;
        parabola47.directrix = line82;
        Line line84 = parabola47.getDirectrix();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass85 = line84.getClass();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        Point point0 = null;
        Vector vector2 = new Vector(point0, (java.lang.Integer) (-1));
        int int3 = vector2.degrees;
        Point point4 = null;
        Vector vector6 = new Vector(point4, (java.lang.Integer) (-1));
        Point point7 = vector6.getOrigin();
        boolean boolean8 = vector2.equals((java.lang.Object) vector6);
        Point point9 = null;
        vector2.origin = point9;
        vector2.setDegrees((int) (short) 10);
        Point point13 = vector2.origin;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class<?> wildcardClass14 = point13.getClass();
    }
}

