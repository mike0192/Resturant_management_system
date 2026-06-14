package MODEL;
/*1. Menu Management
Add/Edit/Delete menu items (name, price, category, availability)
Search menu items by category or price range
- menu_items (id, name, category, price, is_available, description)
Track if item is currently available*/
public class Menu_items {
    private String id;
    private String name;
    private String category;
    private double price;
    private boolean is_available;
    private String description;

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean getIs_available(){
        return is_available;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIs_available(boolean is_available) {
        this.is_available = is_available;
    }

    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
        else{
            System.out.println("Price cant be 0 and below so input the price again!");
        }
    }
    Menu_items(String id, String name, String category, double price, boolean is_available, String description){
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.is_available = is_available;
        this.description = description;
    }
}
