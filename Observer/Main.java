// Driver Class

import java.util.Iterator;

class Main
{
    public static void main(String args[])
    {
        // create objects for testing
        AvgScoreDisplay averageScoreDisplay =
                          new AvgScoreDisplay();
        MidScoreDisplay midscoredisplay = new MidScoreDisplay();
  
        // pass the displays to Cricket data
        CricketData cricketData = new CricketData();
  
        // register display elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(midscoredisplay);

        averageScoreDisplay.display();
        midscoredisplay.display();
  
        // in real app you would have some logic to
        // call this function when data changes
        cricketData.dataChanged();
  
        //remove an observer
        averageScoreDisplay.display();
        midscoredisplay.display();
  
        
        cricketData.unregisterObserver(averageScoreDisplay);
  
        // now only currentScoreDisplay gets the
        // notification
        cricketData.dataChanged();
    }
}