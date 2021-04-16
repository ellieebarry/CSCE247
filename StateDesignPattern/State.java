package StateDesignPattern;
/**
 * Interface to set a state for the TV
 * @author Eleanor Barry
 */

public interface State {
    public void pressHomeButton();

    public void pressNetflixButton();

    public void pressHuluButton();

    public void pressMovieButton();

    public void pressTVButton();
}
