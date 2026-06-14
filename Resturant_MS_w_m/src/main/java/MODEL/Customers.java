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
public class Customers {
    private String id;
    private String name;
    private int phone;
    private String email;
    private Date registration_date;
    private int loyality_points;

    public int getLoyality_points() {
        return loyality_points;
    }

    public void setLoyality_points(int loyality_points) {
        this.loyality_points = loyality_points;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Date getRegistration_date(){
        return registration_date;
    }
    public int getPhone(){
        return phone;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setRegistration_date(Date registration_date) {
        this.registration_date = registration_date;
    }

    Customers(String id, String name, int phone, String email, Date registration_date){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.registration_date = registration_date;
    }
}
