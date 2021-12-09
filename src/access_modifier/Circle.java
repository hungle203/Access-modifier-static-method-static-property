package access_modifier;

public class Circle {
    private double radius;
   public Circle(){
   }
    public Circle(double radius) {
       this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow(this.radius,2) * 3.14;
    }
}
