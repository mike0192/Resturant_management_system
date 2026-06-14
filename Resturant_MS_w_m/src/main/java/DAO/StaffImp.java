package DAO;

import MODEL.Staff;
import DATABASE.mysqlDBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StaffImp implements IStaffDAO{
    @Override
    public boolean addStaff(Staff staff) {

        String sql ="INSERT INTO students(id,name,role,phone,Date) VALUES(?,?,?,?,?)";

        try(Connection con= mysqlDBConnection.getConnection();
            PreparedStatement ps =con.prepareStatement(sql)){
            ps.setString(1, staff.getId());
            ps.setString(2, staff.getName());
            ps.setString(3, staff.getRole());
            ps.setInt(4, staff.getPhone());
            ps.setDate(5, (Date) staff.getDate());

            int rows=ps.executeUpdate();
            return rows> 0;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
