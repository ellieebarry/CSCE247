package ObserverDesignPattern;

/**
 * Class that displays the round score
 * @author Eleanor Barry
 */
public class RoundScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Constructor
     * @param golfer being observed
     */
    public RoundScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Method to update the round score
     * @param strokes for the round
     * @param par     for the round
     */
    public void update(int strokes, int par) {
        this.strokes += strokes;
        this.par += par;
        displayCurrentScore();
    }

    /**
     * Method to display the current score for the golfer for the round
     */
    private void displayCurrentScore() {
        System.out.println("\nCurrent Round Stats:");
        System.out.println("Par: " + par);
        System.out.println("Strokes: " + strokes);
        if (strokes < par) {
            System.out.println((par - strokes) + " under par");
        } else if (strokes == par) {
            System.out.println("Made par");
        } else {
            System.out.println((strokes - par) + " over par");
        }
    }
}
