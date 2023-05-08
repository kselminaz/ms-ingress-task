package singleton;

public class Singleton {

    private static Singleton singleton=null;

    public static Singleton getSingletonInstance(){
        if(singleton==null) singleton=new Singleton();
        return singleton;
    }
    private Singleton(){

    }
    public void doItOnce(){
        System.out.println("It was executed");
    }
}
