package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce;

public class MarinaraSauce implements Sauce{
    public MarinaraSauce() {
        System.out.println("Using PlumTomatoSauce");
    }

    public String toString() {
        return "Marinara Sauce";
    }
}
