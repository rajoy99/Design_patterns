public class MidScoreDisplay implements Observer{

    public float runrate;
    public int predicted_score;

    public void update(int runs, int wickets, float overs){

        this.runrate = (float )runs/(2*overs);
        this.predicted_score = (int)runrate*25;
    }

    
    public void display(){

        System.out.println("Run Rate : "+this.runrate+" Predicted_score : "+this.predicted_score);
    }




}