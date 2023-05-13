package Bridge;

public class Dog implements Pet{
    @Override
    public void showPassport() {
        System.out.println("show dog Passport");
    }
}
