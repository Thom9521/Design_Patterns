package Patterns.Singleton;

public class SingleObject {

    //Lavet et objekt af SingleObject
    private static SingleObject instance = new SingleObject();

    //Laver en private constructor
    private SingleObject(){}

    //Getter metode til instance
    public static SingleObject getInstance(){
        return instance;
    }

    //Metode som printer en besked
    public void showMessage(){
        System.out.println("Hello World!");
    }
}
