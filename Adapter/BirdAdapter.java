public class BirdAdapter implements Toy {


    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void cring(){
        bird.chrip();
    }


}