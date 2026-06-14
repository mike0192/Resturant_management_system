package DAO;

import MODEL.Staff;
/*Create new orders (select customer, add multiple menu items)

Calculate total bill automatically

Apply discounts (10% for loyalty members)

Track order status (pending, preparing, completed, cancelled)

View today's orders*/

import java.util.List;

public interface IStaffDAO {
    boolean addStaff(Staff staff);
    boolean updateStaff(Staff staff);
    boolean deleteStaff(String id);
    Staff searchstaffById(String id);
    List<Staff> getAllStaff();
}
