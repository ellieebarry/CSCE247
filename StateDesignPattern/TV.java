public class TV {
    
    private State HomeState;
    private State NetflixState;
    private State HuluState;
    private State state = HomeState;

    public TV(){
        HomeState = new HomeState();
        NetflixState = new NetflixState();
        HuluState = new HuluState();
    }



    public void pressHomeButton() {
        state.pressHomeButton();
    }

    public void pressNetflixButton() {
        state.pressNetflixButton();
    }

    public void pressHuluButton() {
        state.pressHuluButton();
    }

    public void pressMovieButton() {
        state.pressMovieButton();
    }

    public void pressTVButton(){
        state.pressTVButton();
    }

    public void setState(State state) { 
        this.state = state;
    }

    public State getHomeState() {
        return HomeState;
    }

    public State getNetflixState() {
        return NetflixState;
    }

    public State getHuluState() {
        return HuluState;
    }


}
