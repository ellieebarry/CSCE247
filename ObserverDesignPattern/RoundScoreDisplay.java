package ObserverDesignPattern;

public class RoundScoreDisplay {
    private Subject golfer;
    private int strokes;
    private int par;
    public RoundScoreDisplay(Subject golfer){
        this.golfer = golfer;
    }
    public void update(int strokes, int par){
        this.strokes += strokes;
        this.par += par;
        displayCurrentScore();
    }

    private void displayCurrentScore(){
        System.out.println("Current Round Stats:");
        System.out.println("Par: " + par);
        System.out.println("Strokes: " + strokes);
        if(strokes < par){
           System.out.println((par - strokes) + " under par");
        } else if(strokes == par){
            System.out.println("Made par");
        } else {
            System.out.println((strokes - par) + " over par");
        }
    }
}
