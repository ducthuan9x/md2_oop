package HinhTron;

public class Radius {
    private double radius =1;
    private String color="red";

    public Radius() {
    }

    public Radius(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double DienTich(double radius){
        return  radius*Math.PI;
    }
    public void ShowHtron(){
        System.out.println(getRadius());
        System.out.println(getColor());
    }
}
