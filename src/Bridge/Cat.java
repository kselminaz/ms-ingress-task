package Bridge;

public class Cat implements Pet {
    @Override
    public void showPassport() {
        System.out.println("show cat passport");
    }
}
