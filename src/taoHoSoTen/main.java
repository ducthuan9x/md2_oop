package taoHoSoTen;

public class main {
    public static void main(String[] args) {
        hoSo hoSo=new hoSo();
        hoSo.setCMnd(123456789);
        hoSo.setHoTen("Lê Đức Thuận");
        System.out.println("hồ sơ =" + hoSo.getCMnd() +"tên" +hoSo.getHoTen());
    }
}
