public abstract class Skeleton {

    public abstract void initialize();
    public abstract void start();
    public abstract void end();

    public void play(){

        initialize();
        start();
        end();

    }



}
