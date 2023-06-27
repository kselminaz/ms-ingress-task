package prototype;
public class CarFactory {

    private final Car car;
    public CarFactory(Car car){
        this.car=car;
    }
    public Car cloneCar(){
        return (Car) car.clone();
    }
}
