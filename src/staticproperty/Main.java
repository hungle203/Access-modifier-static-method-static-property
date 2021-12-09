package staticproperty;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Cút Kít 3","HonDA");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Tải","Samsung");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("Cẩu","IOS");
        System.out.println(Car.numberOfCar);
        Car car4 = new Car("Cút Kít 3","HonDA");
        System.out.println(Car.numberOfCar);
        Car car5 = new Car("Tải","Samsung");
        System.out.println(Car.numberOfCar);
        Car car6 = new Car("Cẩu","IOS");
        System.out.println(Car.numberOfCar);
    }


}
