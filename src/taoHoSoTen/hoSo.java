package taoHoSoTen;

public class hoSo {
    public hoSo(){

    }
    private int cMnd;
    private String hoTen;

    public hoSo(int cMnd,String hoTen){
        this.cMnd=cMnd;
        this.hoTen=hoTen;
    }
    public int getCMnd(){
        return cMnd;
    }
    public String getHoTen(){
        return hoTen;
    }
    public void setCMnd(int cMnd){
        this.cMnd=cMnd;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
}
