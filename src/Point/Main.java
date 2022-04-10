package Point;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D Point2D1=new Point2D(2,3);
        System.out.println(Point2D1);
            System.out.println(Arrays.toString(Point2D1.getXY()));


        Point3D Point3D1=new Point3D(1,2,3);
        System.out.println(Point3D1);
        System.out.println(Arrays.toString(Point3D1.getXYZ()));
    }
}
