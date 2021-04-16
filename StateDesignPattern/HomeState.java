package StateDesignPattern;

/**
 * Class that creates the HomeState from State
 * @author Eleanor Barry
 */

public class HomeState implements State {

    private TV TV;

    /**
     * Constructor method
     * @param TV TV that is on this state
     */
    public HomeState(TV TV) {
        this.TV = TV;
    }

    /**
     * Method that stays on current state
     */
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen\n");
    }

    /**
     * Method that switches to netflix state
     */
    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        TV.setState(TV.getNetflixState());
    }

    /**
     * Method that switches to hulu state
     */
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        TV.setState(TV.getHuluState());
    }

    /**
     * Method that prints that there are no movies on the home state
     */
    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.\n");
    }

    /**
     * Method that prints that there are no TV shows on the home state
     */
    public void pressTVButton() {
        System.out.println("Home: You mut pick an app to show tv shows.\n");
    }

}
