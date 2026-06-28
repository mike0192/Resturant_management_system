package MODEL;

import java.util.Date;


public class Staff {
    private String id;
    private String name;
    private String role;
    private int phone;
    private Date Date;
    private boolean is_active;

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public int getPhone(){
        return phone;
    }
    public Date getDate(){
        return Date;
    }
    public boolean isIs_active() {
        return is_active;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setDate(Date date) {
        Date = date;
    }

    public void setIs_active(boolean is_active) {
        this.is_active = is_active;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public Staff(){
        this.id = id;
        this.name = name;
        this.role = role;
        this.phone = phone;
        this.Date = Date;
        this.is_active = is_active;

    }
}
