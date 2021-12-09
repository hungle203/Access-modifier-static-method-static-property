package thuchanh;

public class MainStudent {
    public static void main(String[] args) {
        Student.chane();
      // khởi tạo đối tượng
        Student student1 = new Student(111,"Nam");
        Student student2 = new Student(113,"Tiến");
        Student student3 = new Student(111,"Dio");

        // Gọi hàm Hiển thị
        student1.display();
        student2.display();
        student3.display();
    }
}
