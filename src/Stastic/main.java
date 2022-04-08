package Stastic;

public class main {
        public static void main(String args[]) {
            LopStastic.change(); //calling change method

            //creating objects
            LopStastic s1 = new LopStastic(111, "Hoang");
            LopStastic s2 = new LopStastic(222, "Khanh");
            LopStastic s3 = new LopStastic(333, "Nam");

            //calling display method
            s1.display();
            s2.display();
            s3.display();
        }
    }
