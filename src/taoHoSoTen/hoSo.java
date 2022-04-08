package taoHoSoTen;

import java.util.Calendar;

public class hoSo {
    public hoSo(){

    }
    private int cMnd;
    private String hoTen;
    private int namSinh;

    public hoSo(int cMnd,String hoTen,int namSinh){
        this.cMnd=cMnd;
        this.hoTen=hoTen;
        this.namSinh=namSinh;
    }
    public int getCMnd(){
        return cMnd;
    }
    public String getHoTen(){
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    //    tính tuổi
    public int getTuoi(){
        Calendar now=Calendar.getInstance();
        return now.get(Calendar.YEAR)-getNamSinh();
    }
//

    public void setCMnd(int cMnd){
        this.cMnd=cMnd;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void ShowStudenst(){
        System.out.println("họ tên      \t\t:" + getHoTen());
        System.out.println("năm sinh     \t\t:" + getNamSinh());
        System.out.println("số cmnd         \t:"+getCMnd());
        System.out.println("tuổi           \t\t:" + getTuoi());
    }
}
