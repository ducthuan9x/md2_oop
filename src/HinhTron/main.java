package HinhTron;

public class main {
    public static void main(String[] args) {
        Radius radius1=new Radius();
        radius1.setRadius(5);
        radius1.setColor("red");
        radius1.ShowHtron();
        System.out.println("diện tích = " +radius1.DienTich(radius1.getRadius()));
    }
}
