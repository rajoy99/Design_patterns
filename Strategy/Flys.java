package Strategy;



public interface Flys {
    
    String fly();

}

class Canfly implements Flys{

    public String fly(){

        return "Flying High in the sky";
    }


}

class Cannotfly implements Flys{

    public String fly(){

        return "I cannot Fly ";
    }


}
