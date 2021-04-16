package StateDesignPattern;
/**
 * Class that creates the NetflixState from State
 * @author Eleanor Barry
 */

public class NetflixState implements State {

    private TV TV;

    /**
     * Constructor Method
     * @param TV TV that is on this state
     */
    public NetflixState(TV TV) {
        this.TV = TV;
    }

    /**
     * Method that switches to home state
     */
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        TV.setState(TV.getHomeState());
    }

    /**
     * Method that stays on netflix state
     */
    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    /**
     * Method that switches to hulu state
     */
    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        TV.setState(TV.getHuluState());
    }

    /**
     * Method that prints out movies
     */
    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        System.out.println("- The Land Before Time\n- Frozen\n- The Little Mermaid\n- Ice Age\n");
    }

    /**
     * Method that prints out TV shows
     */
    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        System.out.println("- Peppa Pig\n- My Little Pony\n- Garfield\n- Teenage Mutant Ninja Turtles\n");
    }

}
