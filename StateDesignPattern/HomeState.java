

public class HomeState implements State{
    public void pressHomeButton() {
        System.out.println("TV is already on the home screen");
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        TV.setState(new NetflixState());
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        TV.setState(new HuluState());
    }

    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.");
    }

    public void pressTVButton() {
        System.out.println("Home: You mut pick an app to show tv shows.");
    }


}
