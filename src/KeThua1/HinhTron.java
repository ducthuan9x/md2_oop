package KeThua1;

public class HinhTron extends KhoiHinhve {
    public double radius;

    public HinhTron() {
        this.radius = radius;
    }

    public HinhTron(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double Dtich(){
        return radius*Math.PI;
    }
    public double Cvi(double radius){
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "HinhTron có diện tích" +Dtich()+","+
                "radius=" + radius +
                super.toString() ;
    }
}
