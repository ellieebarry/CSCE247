

public class HomeState implements State{
    
    private TV TV;

    public HomeState(TV TV) {
        this.TV = TV;
    }

    public void pressHomeButton() {
        System.out.println("TV is already on the home screen\n");
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        TV.setState(TV.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        TV.setState(TV.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.\n");
    }

    public void pressTVButton() {
        System.out.println("Home: You mut pick an app to show tv shows.\n");
    }


}
