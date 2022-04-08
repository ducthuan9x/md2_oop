package Stastic;

public class LopStastic {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

//        hàm khởi tạo rỗng.
    public LopStastic() {
    }

    //hàm khởi tạo
    public LopStastic(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    //phương thức static để thay đổi
        static void change() {
            college = "CODEGYM";
        }

        //hiển thị giá trị
        public void display() {
            System.out.println(rollno + " " + name + " " + college);
        }
    }
