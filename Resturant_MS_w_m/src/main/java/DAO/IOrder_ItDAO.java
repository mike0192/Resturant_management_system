package DAO;

import MODEL.Order_item;

import java.util.List;

public interface IOrder_ItDAO {
    boolean addOrderIt(Order_item order);
    boolean updateOrderIt(Order_item order);
    boolean deleteOrderIt(String id);
    Order_item searchOrderItById(String id);
    List<Order_item> getAllOrderIt();
}
