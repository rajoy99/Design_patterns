public class Shapemaker {

    Shape circle;
    Shape rectangle;

    public Shapemaker(){
        circle= new Circle();
         rectangle = new Rectangle();
    }

    public void drawcircle(){
        circle.draw();
    }

    public void drawrectangle(){
        rectangle.draw();
    }

}