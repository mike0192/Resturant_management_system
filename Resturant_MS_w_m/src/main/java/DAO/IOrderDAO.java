package DAO;

import MODEL.Orders;

import java.util.List;

public interface IOrderDAO {
    boolean addOrder(Orders order);
    boolean updateOrder(Orders order);
    boolean deleteOrder(String id);
    Orders searchOrderById(String id);
    List<Orders> getAllOrder();
}
