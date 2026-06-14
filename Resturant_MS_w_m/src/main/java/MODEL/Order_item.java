package MODEL;
/**
 * order_items (id, order_id, menu_item_id, quantity, price_at_time)
 * 3. Order Management
 * Create new orders (select customer, add multiple menu items)
 * Calculate total bill automatically
 * Apply discounts (10% for loyalty members)
 * Track order status (pending, preparing, completed, cancelled)
 * View today's orders
 */
public class Order_item {
    private String id;
    private String Order_id;
    private String Menu_item_id;
    private int quantity;
    private int price_at_time;

    public int getPrice_at_time() {
        return price_at_time;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getId() {
        return id;
    }

    public String getMenu_item_id() {
        return Menu_item_id;
    }

    public String getOrder_id() {
        return Order_id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMenu_item_id(String menu_item_id) {
        Menu_item_id = menu_item_id;
    }

    public void setOrder_id(String order_id) {
        Order_id = order_id;
    }

    public void setPrice_at_time(int price_at_time) {
        this.price_at_time = price_at_time;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
