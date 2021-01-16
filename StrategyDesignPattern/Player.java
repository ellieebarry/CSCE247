public abstract class Player {

    protected String name;
    private boolean defense;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;

    // constructor
    public Player(String name) {
        this.name = name;
    }
    public abstract void setDefenceBehavior();
    public abstract void setOffenceBehavior();
    public String play();
    public void turnover();
}
