package strategy;

public class AdminUnblock implements Strategy {

    @Override
    public boolean unblock() {
        System.out.println("Unblocked by admin");
        return true;
    }
}
