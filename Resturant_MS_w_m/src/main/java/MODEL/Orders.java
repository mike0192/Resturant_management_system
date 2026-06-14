package MODEL;

import java.util.Date;

/*
Discount Rules:
Customers with >500 loyalty points get 10% discount
Orders above $100 get 5% discount (stacks with loyalty)
Inventory Rules:
Menu item cannot be ordered if is_available = false
Track quantity of items ordered (simulate stock deduction)
Order Status Flow:
pending → preparing → completed OR cancelled
Cannot modify completed/cancelled orders
Loyalty Points:
Earn 1 point per $10 spent
Points can be viewed but not redeemed in this version
*/

public class Orders {
    private String O_id;
    private String Cust_id;
    private String Staff_id;
    private Date O_date;
    private boolean status;
    private double total_amount;
    private double discount;


    boolean isStatus() {
        return status;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public double getDiscount() {
        return discount;
    }

    public Date getO_date() {
        return O_date;
    }

    public String getCust_id() {
        return Cust_id;
    }

    public String getO_id() {
        return O_id;
    }

    public void setCust_id(String cust_id) {
        Cust_id = cust_id;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setO_date(Date o_date) {
        O_date = o_date;
    }

    public void setO_id(String o_id) {
        O_id = o_id;
    }

    public void setStaff_id(String staff_id) {
        Staff_id = staff_id;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }
    Orders(String O_id, String Cust_id, String Staff_id, Date O_date, boolean status, double total_amount, double discount){
        this.O_id = O_id;
        this.Cust_id = Cust_id;
        this.Staff_id =Staff_id;
        this.O_date = O_date;
        this.status = status;
        this.total_amount = total_amount;
        this.discount = discount;

    }
}
