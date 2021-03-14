package Strategy;


public class Animal_play {
    
    public static void main(String[] args) {
        

        Dog  wolvie = new Dog();

        Animal twitter = new Bird();


        System.out.println("Dog "+ wolvie.trytofly());

        System.out.println("Bird"+ twitter.trytofly());



    }


}
