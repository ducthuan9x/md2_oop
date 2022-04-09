package BaiTap;

public class HinhTru extends HinhTron {
    public double chieuCao;

    public HinhTru(double radius, String corlor, double chieuCao) {
        super(radius, corlor);
        this.chieuCao = chieuCao;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    public double TheTich(double radius,double chieuCao){
        return  super.Dtich(radius)*chieuCao;
    }

    @Override
    public String toString() {
        return "HinhTru{" +
                "chieuCao=" + chieuCao +
                super.toString() +
                '}';
    }
    public void ShowHt(){
        System.out.println(getChieuCao());
        System.out.println("thể tích = " + TheTich(radius,chieuCao));
        super.Show();
    }
}
