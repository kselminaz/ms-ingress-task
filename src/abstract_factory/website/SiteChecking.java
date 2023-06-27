package abstract_factory.website;

import abstract_factory.Checking;

public class SiteChecking implements Checking {
    @Override
    public void checkCode() {
        System.out.println("check link");
    }
}
