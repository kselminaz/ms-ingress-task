package abstract_factory.website;

import abstract_factory.Verification;

public class SiteVerification implements Verification {
    @Override
    public void sendCode() {

        System.out.println("send link");
    }
}
