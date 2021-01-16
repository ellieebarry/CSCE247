public class Receiver extends Player{
    
    public Receiver(String name){
        super(name);
        this.setOffenceBehavior();
        this.setDefenceBehavior();
    }

    public void setOffenceBehavior(){
        this.offenceBehavior = new ReceiverBehavior();
    }

    public void setDefenceBehavior(){
        this.defenceBehavior = null;
    }

}
