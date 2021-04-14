public class NetflixState implements State{
    
    private TV TV = new TV();

    public void pressHomeButton() {
        System.out.println("Loading the Home Screen...");
        TV.setState(TV.getHomeState());
    }

    public void pressNetflixButton() {
        System.out.println("We are already in Netflix");
    }

    public void pressHuluButton() {
        System.out.println("Loading Hulu...");
        TV.setState(TV.getHuluState());
    }

    public void pressMovieButton() {
        System.out.println("Netflix Movies:");
        System.out.println("- The Land Before Time\n- Frozen\n- The Little Mermaid\n- Ice Age");
    }

    public void pressTVButton() {
        System.out.println("Netflix TV Shows:");
        System.out.println("- Peppa Pig\n- My Little Pony\n- Garfield\n- Teenage Mutant Ninja Turtles");
    }

}
