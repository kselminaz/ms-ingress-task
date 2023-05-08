package abstract_factory.mobile;

import abstract_factory.Checking;

public class SmsChecking implements Checking {
    @Override
    public void checkCode() {
        System.out.println("check otp");
    }
}
