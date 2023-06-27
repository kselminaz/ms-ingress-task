package prototype;

public class Main {
    public static void main(String[] args) {
        var car=new Car(1,"Car model","color1");
        var carFactory=new CarFactory(car);
        var cloneCar=carFactory.cloneCar();
        System.out.println(cloneCar);
    }

}
