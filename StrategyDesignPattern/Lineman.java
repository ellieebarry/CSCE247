import java.util.Random;
public class Lineman extends Player{
    
    public Lineman(String name){
        super(name);
        this.setOffenceBehavior();
        this.setDefenceBehavior();
    }

    public void setOffenceBehavior(){
        this.offenceBehavior = new OBlockBehavior();
    }

    public void setDefenceBehavior(){
        Random rand = new Random();
        int r = rand.nextInt(3);
        if(r == 0){ // block
                this.defenceBehavior = new BlockBehavior();
        } else if(r == 1){ // strip
            this.defenceBehavior = new StripBehavior();
        } else { // sack
            this.defenceBehavior = new SackBehavior();
        }
    }

}