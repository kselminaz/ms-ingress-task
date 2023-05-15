package strategy;

public class UserUnblock implements Strategy {
    @Override
    public boolean unblock() {
        System.out.println("Unblocked by User");
        return true;
    }
}
