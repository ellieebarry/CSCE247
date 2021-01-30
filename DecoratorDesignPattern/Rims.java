package DecoratorDesignPattern;

public class Rims {
    Vehicle vehicle;

    public Rims(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String toString(){
        return vehicle.getDescription() + ", cool rims";
    }

    public double getCost(){
        return vehicle.getCost() + 200;
    }

}
