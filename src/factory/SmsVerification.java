package factory;

public class SmsVerification implements Verification{
    @Override
    public void sendCode() {
        System.out.println("send code via sms");
    }
}
