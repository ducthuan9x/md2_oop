package KeThua1;

public class HinhVuong extends KhoiHinhve{
    public double cd;
    public  double cr;

    public HinhVuong() {
    }

    public HinhVuong(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    public HinhVuong(String color, boolean filled, double cd, double cr) {
        super(color, filled);
        this.cd = cd;
        this.cr = cr;
    }

    public double getCd() {
        return cd;
    }

    public void setCd(double cd) {
        this.cd = cd;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public double Dtich(){
        return cd*cr;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                Dtich() +","+
                "cd=" + cd +
                ", cr=" + cr +
                super.toString()
                + "}";
    }
}
