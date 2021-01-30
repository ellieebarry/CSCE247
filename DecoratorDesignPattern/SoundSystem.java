package DecoratorDesignPattern;

public class SoundSystem {
    
    Vehicle vehicle;

    public SoundSystem(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String toString(){
        return vehicle.getDescription() + ", awesome sound";
    }

    public double getCost(){
        return vehicle.getCost() + 350;
    }

}
