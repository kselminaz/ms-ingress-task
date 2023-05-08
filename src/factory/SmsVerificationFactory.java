package factory;

public class SmsVerificationFactory implements VerificationFactory {


    @Override
    public Verification createVerification() {
        return new SmsVerification();
    }
}
