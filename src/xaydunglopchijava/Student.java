package xaydunglopchijava;

public class Student {
     public String name;
     public String classes;

     public Student() {
     }
     public Student(String name, String classes) {
         this.name = name;
         this.classes = classes;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
