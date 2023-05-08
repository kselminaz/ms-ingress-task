package abstract_factory.website;

import abstract_factory.Checking;
import abstract_factory.Verification;
import abstract_factory.VerifySystemFactory;

public class SiteVerifySystemFactory implements VerifySystemFactory {
    @Override
    public Verification getVerification() {

        return new SiteVerification();
    }

    @Override
    public Checking getChecking() {

        return new SiteChecking();
    }
}
