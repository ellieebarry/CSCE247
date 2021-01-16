import java.util.Random;
public class QuarterBack extends Player{
    
    public QuarterBack(String name){
        super(name);
        this.setOffenceBehavior();
        this.setDefenceBehavior();
    }

    public void setOffenceBehavior(){
        Random rand = new Random();
        int r = rand.nextInt(2);
        if(r == 0){ // run
                this.offenceBehavior = new RunBehavior();
        } else { // pass
            this.offenceBehavior = new PassBehavior();
        }
    }

    public void settDefenceBehavior(){
        this.defenceBehavior = null;
    }

}
