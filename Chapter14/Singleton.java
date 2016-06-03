package Chapter14;

/**
 * Created by yuwang on 5/19/16.
 */
public class Singleton {

    private static  Singleton singleton = new Singleton();

    private Singleton() {

        System.out.println("Init a private singleton class");
    }

    public static Singleton getSingleton() {

        return singleton;
    }

    public void doSth() {
        System.out.println("Do action singleton class");

    }


}
