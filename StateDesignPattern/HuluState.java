public class HuluState implements State{
    
    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        TV.setState(new HomeState());
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...");
        TV.setState(new NetflixState());
    }

    public void pressHuluButton() {
        System.out.println("We are already in Hulu");
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        System.out.println("- Cars\n- Cinderella\n-Wall-E\n- ET");
    }

    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        System.out.println("- Sesame Street\n- Care Bears\n- Looney Tunes");
    }

}
