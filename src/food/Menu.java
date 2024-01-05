package food;

abstract public class Menu {
    private String itemName;
    private double price;
    private int calories;

    Menu(String itemName,double price,int calories)
    {
        this.itemName = itemName;
        this.price = price;
        this.calories = calories;
    }
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    public int getCalories(){
        return calories;
    }

}
