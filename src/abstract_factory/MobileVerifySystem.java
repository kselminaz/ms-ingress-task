package abstract_factory;

import abstract_factory.mobile.MobileVerifySystemFactory;

public class MobileVerifySystem {

    public static void main(String[] args) {
        var mobileVerifySystemFactory=new MobileVerifySystemFactory();
        var smsVerification=mobileVerifySystemFactory.getVerification();
        var checking=mobileVerifySystemFactory.getChecking();

        smsVerification.sendCode();
        checking.checkCode();

    }

}
