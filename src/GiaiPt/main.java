package GiaiPt;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhập a");
        double a=scanner.nextDouble();
        System.out.println("nhập b");
        double b =scanner.nextDouble();
        System.out.println("nhập c");
        double c= scanner.nextDouble();
        GiaiPt b1 = new GiaiPt(a,b,c);
    }
}
