package factory;

public class MailVerificationFactory implements VerificationFactory {

    @Override
    public Verification createVerification() {
        return new MailVerification();
    }
}