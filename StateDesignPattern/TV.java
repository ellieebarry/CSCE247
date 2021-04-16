package StateDesignPattern;
/**
 * Class that creates a TV object
 * @author Eleanor Barry
 */

public class TV {

    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state = HomeState;

    /**
     * Constructor method that sets up the states of the TV
     */
    public TV() {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
    }

    /**
     * Method that calls the pressHomeButton method on current state
     */
    public void pressHomeButton() {
        state.pressHomeButton();
    }

    /**
     * Method that calls the pressNetflixButton method on current state
     */
    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    /**
     * Method that calls the pressHuluButton method on current state
     */
    public void pressHuluButton() {
        state.pressHuluButton();
    }

    /**
     * Method that calls the pressMovieButton method on current state
     */
    public void pressMovieButton() {
        state.pressMovieButton();
    }

    /**
     * Method that calls the pressTVButton method on current state
     */
    public void pressTVButton() {
        state.pressTVButton();
    }

    /**
     * Method that sets the current state
     * @param state
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Method that returns the home state
     * @return HomeState of TV
     */
    public State getHomeState() {
        return HomeState;
    }

    /**
     * Method that returns the netflix state
     * @return NetflixState of TV
     */
    public State getNetflixState() {
        return NetflixState;
    }

    /**
     * Method that returns the hulu state
     * @return HuluState of TV
     */
    public State getHuluState() {
        return HuluState;
    }

}
