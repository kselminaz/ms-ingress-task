package abstract_factory.mobile;

import abstract_factory.Checking;
import abstract_factory.Verification;
import abstract_factory.VerifySystemFactory;

public class MobileVerifySystemFactory implements VerifySystemFactory {
    @Override
    public Verification getVerification() {
        return new SmsVerification();
    }

    @Override
    public Checking getChecking() {
        return new SmsChecking();
    }
}
