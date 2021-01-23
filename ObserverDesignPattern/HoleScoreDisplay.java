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
    }

    private void displayCurrentScore(){
        
    }

}
