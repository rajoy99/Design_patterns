public class Strategy_pattern_demo {
    
    public static void main(String[] args){

        Context contxt = new Context(new Operation_multiply());

        int j=10;
        int k=37 ;

        float res = contxt.execute_strategy(j, k);

        System.out.println(res);
    }
}
