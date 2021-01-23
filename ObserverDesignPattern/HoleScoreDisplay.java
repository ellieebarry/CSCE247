package ObserverDesignPattern;

public class HoleScoreDisplay implements Observer{
    private Subject golfer;
    private int strokes;
    private int par;
    public HoleScoreDisplay(Subject golfer){
        this.golfer = golfer;
    }
    public void update(int strokes, int par){
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    private void displayCurrentScore(){
        if(strokes < par){
           System.out.println((par - strokes) + " under par");
        } else if(strokes == par){
            System.out.println("Made par");
        } else {
            System.out.println((strokes - par) + " over par");
        }
    }

}
