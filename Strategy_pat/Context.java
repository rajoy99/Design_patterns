public class Context {
    
    Strategy strategy ;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public float execute_strategy(int arg1, int arg2){
        return strategy.do_operation(arg1, arg2);
    }
}
