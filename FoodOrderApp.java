// Food Ordering App

class FoodItem{
    private String name;
    private double price;

    public FoodItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String displayMenuItem() {
        return name + " : $" + price;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

class Pizza extends FoodItem{
    private String size;
    private String[] toppings;

    public Pizza(String name, double price, String size, String[] toppings) {
        super(name, price);
        this.size = size;
        this.toppings = toppings;
    }

    @Override
    public String displayMenuItem() {
        return getName() + " Pizza (" + size + ") with " + toppings + ", Price: $" + getPrice();
    }
}

class Burger extends FoodItem {
    private boolean cheese;
    private String pattyType;

    public Burger(String name, double price, boolean cheese, String pattyType) {
        super(name, price);
        this.cheese = cheese;
        this.pattyType = pattyType;
    }

    @Override
    public String displayMenuItem() {
        return getName() + " Burger [ with Cheese : " + cheese + ", Patty Type : " + pattyType + "], Price: $" + getPrice();
    }
}

class Salad extends FoodItem {
    private String[] ingredients;

    public Salad(String name, double price, String[] ingredients) {
        super(name, price);
        this.ingredients = ingredients;
    }

    @Override
    public String displayMenuItem() {
        return getName() + " Salad with " + ingredients + ". Price: $" + getPrice();
    }
}

public class FoodOrderApp {
    public static void main(String[] args) {
        FoodItem[] menu = {
            new Pizza("Pepperoni", 9.99, "Large", new String[]{"Pepperoni", "Cheese", "Olives"}),
            new Burger("Classic", 5.49, true, "Beef"),
            new Salad("Garden Fresh", 4.99, new String[]{"Lettuce", "Tomato", "Cucumber"})
        };

        for (FoodItem item : menu) {
            System.out.println(item.displayMenuItem());
        }
    }
}