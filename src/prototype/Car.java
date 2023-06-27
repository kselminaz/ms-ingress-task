package prototype;

public class Car implements Cloneable {
    private final int id;
    private final String model;
    private final String color;

    public Car(int id, String model, String color) {
        this.id = id;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        return new Car(id,model,color);
    }
}
