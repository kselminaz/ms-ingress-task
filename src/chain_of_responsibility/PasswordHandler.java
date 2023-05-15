package chain_of_responsibility;

public class PasswordHandler extends Handler{

    @Override
    public boolean handle(String username, String password) {
        if(password==null) {
            return false;
        }
        System.out.println("Password was checked");
        return handleNext(username, password);
    }
}
