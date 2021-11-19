public class decoratorpatterndemo {

    public static void main(String[] args){

        Pizza chikpizza1= new ChickenFista();


        System.out.println(chikpizza1.getcost());

        System.out.println(chikpizza1.getDescription());

        Pizza tomatopizza = new FreshTomato(chikpizza1);


        System.out.println(tomatopizza.getcost());

        System.out.println(tomatopizza.getDescription());



    }


}