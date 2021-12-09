package thuchanh;

public class Student {
        private int rollno;
        private String name;
        private static String college = "BBDIT";

        // hàm khởi tạo để khởi tạo biến
        Student(int rollno, String name) {
              this.rollno = rollno;
              this.name = name;
        }
        // phương thức static để thay đổi giá trị của biến static
        static void chane() {
            college = "CODEGYM";
        }

        void display() {
            System.out.println(rollno + " " + name + " " + college);
        }

}
