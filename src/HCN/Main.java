package HCN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập chiều dài và chiều rộng");
        Hcn h1 = new Hcn();
        int cd1 = h1.getCd();
        int cr1 = h1.getCr();
        cd1 = scanner.nextInt();
        cr1 = scanner.nextInt();
        System.out.println(" diện tích = " +h1.dTich(cd1, cr1));
        System.out.println( "chu vi = " + h1.cVi(cd1,cr1));
    }
}
