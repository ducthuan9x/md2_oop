package GiaiPt;

public class GiaiPt {

    public GiaiPt() {
    }

    public GiaiPt(double a, double b, double c){
        if(a==0){
            if(b==0){
                System.out.println("phương trình vô nghiệm");
            }else{
                System.out.println("x= " + (-c)/b);
            }
            return;
        }
        double delta=b*b-4*a*c;
        double x1;
        double x2;

        if(delta<0){
            System.out.println("phương trình vô số nghiệm");
        }
        else if(delta==0){
            x1=(-b/(2*a));
            System.out.println("x1=x2= " + x1);
        }
        else{
            x1=(-b -Math.sqrt(delta))/2*a;
            x2=(-b +Math.sqrt(delta))/2*a;
            System.out.println("phương trình có 2 nghiệm" + "x1=" +x1 + ""+ "x2"+ x2);
        }
    }
}
