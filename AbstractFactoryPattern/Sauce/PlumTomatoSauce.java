package CreationalDesignPattern.FactoryPattern.AbstractFactoryPattern.Sauce;

public class PlumTomatoSauce implements Sauce{
    public PlumTomatoSauce() {
        System.out.println("Using PlumTomatoSauce");
    }

    public String toString() {
        return "Tomato sauce with plum tomatoes";
    }
}
