package food;

public class Menuitems extends Menu{


    Menuitems(String itemName, double price, int calories) {
        super(itemName, price, calories);
    }

    public static void main(String[] args) {
        Menuitems item = new Menuitems("Biryani", 16.00, 1000);
    }
}
