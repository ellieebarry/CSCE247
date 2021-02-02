package FactoryDesignPattern;

public abstract class Bike {
    
    protected String name;
    protected Double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;

    public void createBike(){
        createFrame();
        addWheels();
        addPedals();
    }

    public void createFrame(){
        System.out.println("Assembling " + name + " frame");
    }


    public void addWheels(){
        if(numWheels == 0){
            return;
        }
        System.out.println("Adding " + numWheels + "wheels(s)");
    }

    public void addPedals(){
        
    }

    public void getPrice(){

    }


}
