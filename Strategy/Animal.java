
package Strategy;

public class Animal{

    String name;
    double speed;
    String sound;

    public Flys flyingType;

    public Animal(){

        
    }
    
    public String trytofly(){

        return flyingType.fly();

    }






}