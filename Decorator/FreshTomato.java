public class FreshTomato extends ToppingDecorator {

    Pizza pizza ;

    public FreshTomato(Pizza pizza){
        this.pizza= pizza;
    }

    public String getDescription() {
        return pizza.getDescription()+"  added with freshtomato";
    }

    public int getcost() {
        return pizza.getcost()+ 30;
    }



}