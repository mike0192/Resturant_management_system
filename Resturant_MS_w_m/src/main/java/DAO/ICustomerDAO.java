package DAO;
/*Register customers (name, phone, email, loyalty points)

Search customers by phone number

View customer order history*/

import MODEL.Customers;

import java.util.List;

public interface ICustomerDAO {
    boolean addCustomer(Customers Customer);
    boolean updateCustomer(Customers Customer);
    boolean deleteCustomer(String phone);
    Customers searchCustByPhone(int phone);
    List<Customers> getAllcust();
}
