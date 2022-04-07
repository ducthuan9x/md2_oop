package GiaiPt;

public class PhuongTrinhBac2 {

    public PhuongTrinhBac2() {
    }
    private double a;
    private double b;
    private double c;

    public PhuongTrinhBac2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA(){
        return a;
    }
    public double getB(){
        return  b;
    }
    public double getC(){
        return c;
    }
    public void setA(double a){
        this .a=a;
    }
    public void setB(double b){
        this.b=b;
    }
    public void setC(double c){
        this.c=c;
    }
    public double delta() {
        return  b * b - 4 * a * c;
    }

//
    public void giaiPhuongTrinhBac2(){
        double x1;
        double x2;
        x1=(-b -Math.sqrt(delta()))/2*a;
        x2=(-b +Math.sqrt(delta()))/2*a;
        if(a==0){
            if(b==0){
                System.out.println("phương trình vô nghiệm");
            }else{
                System.out.println("x= " + (-c)/b);
            }
            return;
        }

        if(delta()<0){
            System.out.println("phương trình vô số nghiệm");
        }
        else if(delta()==0){
            System.out.println("x1=x2= " + (-b/(2*a)) );
        }
        else{
            System.out.println("phương trình có 2 nghiệm" + "x1=" +x1+ ""+ "x2"+x2 );
        }
    }
}
