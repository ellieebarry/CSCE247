/**
 * Class that creates the HuluState from State
 * @author Eleanor Barry
 */

public class HuluState implements State {

    private TV TV;

    /**
     * Constructor Method
     * @param TV TV that is on this state
     */
    public HuluState(TV TV) {
        this.TV = TV;
    }

    /**
     * Method that switches to home state
     */
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        TV.setState(TV.getHomeState());
    }

    /**
     * Method that switches to netflix state
     */
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        TV.setState(TV.getNetflixState());
    }

    /**
     * Method that stays in current state
     */
    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    /**
     * Method that prints movies
     */
    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        System.out.println("- Cars\n- Cinderella\n- Wall-E\n- ET\n");
    }

    /**
     * Method that prints TV shows
     */
    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        System.out.println("- Sesame Street\n- Care Bears\n- Looney Tunes\n");
    }

}
