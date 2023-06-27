package abstract_factory.mobile;

import abstract_factory.Verification;

public class SmsVerification implements Verification {
    @Override
    public void sendCode() {
        System.out.println("send otp");
    }
}
