package singleton;

public class Main {
    public static void main(String[] args) {
        var instance=Singleton.getSingletonInstance();
        instance.doItOnce();
        System.out.println(instance);
        var instance2=Singleton.getSingletonInstance();
        instance2.doItOnce();
        System.out.println(instance2);
    }
}
