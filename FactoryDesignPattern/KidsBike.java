package FactoryDesignPattern;

public class KidsBike extends Bike{
    
    public KidsBike(){
        this.name = "Kids Bike";
        this.price = 80.99;
        this.numWheels = 2;
        this.hasPedals = true;
        this.hasTrainingWheels = true;
    }

}
