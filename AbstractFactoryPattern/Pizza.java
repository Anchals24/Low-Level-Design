package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern;

import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Cheese.Cheese;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Dough.Dough;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Pepperoni.Pepperoni;
import CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce.Sauce;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;

    abstract void prepare();

    void bake(){
        System.out.println("Bake for 25 minutes");
    }

    void cut(){
        System.out.println("Cutting the pizza into diagonal slices.");
    }

    void pack(){
        System.out.println("Pizza is ready now. Packing it!");
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}
