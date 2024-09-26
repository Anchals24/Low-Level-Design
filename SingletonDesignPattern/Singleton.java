package CreationalDesignPattern.SingletonDesignPattern;

public class Singleton {
    //Step1: We have created a private constructor of Singleton class & it can only be instantiated within this class.
    private Singleton(){
    }

    //Step2: Create a static var to hold one instance of Singleton class.

    private static Singleton uniqueInstance;

    //Step3: Create a static getInstance() method to instantiate the class and also to return an instance of it.

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    //other useful methods here.
}
