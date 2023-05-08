package factory;

public class MailVerification implements Verification{
    @Override
    public void sendCode() {
        System.out.println("send code via mail");
    }
}