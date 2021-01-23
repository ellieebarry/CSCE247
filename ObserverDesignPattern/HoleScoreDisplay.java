package ObserverDesignPattern;

/**
 * Class that displays the hole score
 * @author Eleanor Barry
 */

public class HoleScoreDisplay implements Observer {
    private Subject golfer;
    private int strokes;
    private int par;

    /**
     * Constructor
     * @param golfer that is being observed
     */
    public HoleScoreDisplay(Subject golfer) {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    /**
     * Method to updates strokes and par for golfer
     * @param strokes for that hole
     * @param par     for that hole
     */
    public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }

    /**
     * method that displays the strokes and par for the current hole of the golfer
     * being observed
     */
    private void displayCurrentScore() {
        System.out.println("\nCurrent Hole Stats:");
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
