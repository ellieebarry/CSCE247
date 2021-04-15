public class NetflixState implements State{
    
    private TV TV;

    public NetflixState(TV TV) {
        this.TV = TV;
    }

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        TV.setState(TV.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("We are already in Netflix\n");
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...\n");
        TV.setState(TV.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        System.out.println("- The Land Before Time\n- Frozen\n- The Little Mermaid\n- Ice Age\n");
    }

    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        System.out.println("- Peppa Pig\n- My Little Pony\n- Garfield\n- Teenage Mutant Ninja Turtles\n");
    }

}
