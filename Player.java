public abstract class Player {

    protected String name;
    private boolean defense;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior OffenceBehavior;

    // constructor
    public Player(String name) {
        this.name = name;
    }
    public void setDefenceBehavior();
    public void setOffenceBehavior();
    public String play();
    public void turnover();
}
