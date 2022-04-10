package MoveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point1=new Point(3,6);
        System.out.println(point1);


        Moveable moveable1=new Moveable(1,2,6,8);
        System.out.println(moveable1);
        System.out.println(moveable1.Move());
    }
}
