package DecoratorDesignPattern;

public abstract class Vehicle {
    protected String description;

    public String getDescription() {
		return description;
	}
	
	public abstract double getCost();

}
