package BaiTap;

public class HinhTron {
    public double radius;
    public String corlor;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getCorlor() {
        return corlor;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }

    public HinhTron(double radius, String corlor) {
        this.radius = radius;
        this.corlor = corlor;
    }

    public double Dtich(double radius){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "radius=" + radius +
                ", corlor='" + corlor + '\'' +
                '}';
    }
    public void Show(){
        System.out.println("diện tích = "+ Dtich(radius) );
        System.out.println( "bán kính = "+getRadius() );
    }
}
