package chain_of_responsibility;

public class UserRoleHandler extends Handler{
    @Override
    public boolean handle(String username, String password) {
        if("admin".equals(username)) {
            System.out.println("Loading admin page");
           return true;
        }
        System.out.println("Loading default page");
        return handleNext(username, password);
    }
}
