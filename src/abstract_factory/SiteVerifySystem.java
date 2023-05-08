package abstract_factory;

import abstract_factory.website.SiteVerifySystemFactory;

public class SiteVerifySystem {

    public static void main(String[] args) {
        var siteVerifySystemFactory=new SiteVerifySystemFactory();
        var verification=siteVerifySystemFactory.getVerification();
        var checking=siteVerifySystemFactory.getChecking();

        verification.sendCode();
        checking.checkCode();
    }
}
