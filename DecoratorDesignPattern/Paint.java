package DecoratorDesignPattern;

public class Paint extends VehicleDecorator{
    Vehicle vehicle;

    public Paint(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public String toString(){
        return vehicle.getDescription() + ", fancy paint";
    }

    public double getCost(){
        return vehicle.getCost() + 150;
    }

}
