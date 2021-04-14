

public class HomeState implements State{
    
    private TV TV = new TV();

    public void pressHomeButton() {
        System.out.println("TV is already on the home screen");
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        TV.setState(TV.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        TV.setState(TV.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Home: You must pick an app to show movies.");
    }

    public void pressTVButton() {
        System.out.println("Home: You mut pick an app to show tv shows.");
    }


}
