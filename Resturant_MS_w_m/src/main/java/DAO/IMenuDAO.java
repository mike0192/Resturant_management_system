package DAO;

import MODEL.Menu_items;

import java.util.List;

public interface IMenuDAO {
    boolean addMenu(Menu_items menu);
    boolean updateMenu(Menu_items menu);
    boolean deleteMenu(String id);
    Menu_items searchMenuById(String id);
    List<Menu_items> getAllMenu();

}
