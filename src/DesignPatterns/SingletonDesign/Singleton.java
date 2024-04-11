package DesignPatterns.SingletonDesign;

public class Singleton {
    //volatile keyword is used so that thread doesn't cache this object and once it is intialized ,
    // it is visible to all other thread
    private static volatile Singleton object;
    private Singleton(){}

    public static Singleton getInstance(){
        if(object == null){
            synchronized (Singleton.class){
                if(object == null)
                    object = new Singleton();
            }
        }
        return object;
    }
}
