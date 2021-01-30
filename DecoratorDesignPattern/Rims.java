package DecoratorDesignPattern;

public class Rims extends VehicleDecorator{
    Vehicle vehicle;

    public Rims(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String toString(){
        return vehicle.toString() + ", cool rims";
    }

    public double getCost(){
        return vehicle.getCost() + 200;
    }

}
