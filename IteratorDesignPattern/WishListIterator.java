package IteratorDesignPattern;

public class WishListIterator implements Iterator{
    
    private Item[] items;
    private int position;

    public WishListIterator(Item[] items){
        this.items = items;
        position = 0;
    }

    public boolean hasNext(){
        return (position < items.length && items[position] != null);
    }

    public Item next(){
        Item wishListItem = items[position];
        position++;
        return wishListItem;
        
    }


}
