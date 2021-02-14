package IteratorDesignPattern;

public class WishList {
    private String name;
    private Item[] items;
    private int count;

    public WishList(String name){
        this.name = name;
        items = new Item[5];
        count = 0;
    }

    public void addItem(String title, String description, double price){
        if(count == items.length){
            items = growArray(items);
        }
        items[count] = new Item(title, description, price);
        count++;
    }

    public WishListIterator createIterator(){
        return new WishListIterator(items);
    }

    public double getTotalCost(){
        double totalCost = 0.0;
        for(int i = 0; i < count; i++){
            totalCost += items[i].getPrice();
        }
        return totalCost;
    }

    private Item[] growArray(Item[] items){
        Item[] temp = new Item[items.length * 2];
        for(int i = 0; i < items.length; i++){
            temp[i] = items[i];
        }
        return temp;
    }


}
