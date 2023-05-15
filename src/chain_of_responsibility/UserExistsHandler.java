package chain_of_responsibility;

public class UserExistsHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        if(username==null) {
          return false;
        }
        System.out.println("Username was checked");
        return handleNext(username,password);

    }
}
