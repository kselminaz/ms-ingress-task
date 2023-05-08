package factory;

import static factory.VerificationType.SMS;

public class UserVerification {

    public static void main(String[] args) {

        var verificationFactory=createVerificationFactory(SMS);
        var verification=verificationFactory.createVerification();
        verification.sendCode();
    }
    public static VerificationFactory createVerificationFactory(VerificationType type){
        return switch (type){
            case SMS->new SmsVerificationFactory();
            case  MAIL->new MailVerificationFactory();
        };

    }
}
