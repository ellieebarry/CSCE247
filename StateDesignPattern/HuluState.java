public class HuluState implements State{
    
    private TV TV;

    public HuluState(TV TV) {
        this.TV = TV;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...\n");
        TV.setState(TV.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("Loading Netflix...\n");
        TV.setState(TV.getNetflixState());
    }

    public void pressHuluButton() {
        System.out.println("We are already in Hulu\n");
    }

    public void pressMovieButton() {
        System.out.println("Hulu Movies:");
        System.out.println("- Cars\n- Cinderella\n- Wall-E\n- ET\n");
    }

    public void pressTVButton() {
        System.out.println("Hulu TV Shows:");
        System.out.println("- Sesame Street\n- Care Bears\n- Looney Tunes\n");
    }

}
