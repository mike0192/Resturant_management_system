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

    @Override
    public boolean updateStaff(Staff staff) {
        String sql = "UPDATE students SET name=?, role=?, phone=?, Date=? WHERE id=?";

        try(Connection con = mysqlDBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, staff.getName());
            ps.setString(2, staff.getRole());
            ps.setInt(3, staff.getPhone());
            ps.setDate(4, (Date) staff.getDate());
            ps.setString(5, staff.getId());

            int rows = ps.executeUpdate();
            return rows > 0;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteStaff(String id) {
        String sql ="DELETE FROM students WHERE id=?";

        try(Connection con= mysqlDBConnection.getConnection();
            PreparedStatement ps =con.prepareStatement(sql)){

            ps.setString(1, id);
            int rows=ps.executeUpdate();
            return rows> 0;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Staff searchstaffById(String id) {
        String sql ="SELECT * FROM students WHERE id=?";


        try(Connection con= mysqlDBConnection.getConnection();
            PreparedStatement ps =con.prepareStatement(sql)){

            ps.setString(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Staff staff = new Staff();
                staff.setId(rs.getString("id"));
                staff.setName(rs.getString("name"));
                staff.setRole(rs.getString("role"));
                staff.setPhone(rs.getInt("Phone"));
                staff.setDate(rs.getDate("Date"));

                return staff;
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Staff> getAllStaff() {
        List<Staff> listofstaff = new ArrayList<>();

        String sql = "SELECT * FROM students";

        try(Connection con= mysqlDBConnection.getConnection();
            PreparedStatement ps =con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()){

            while (rs.next()) {
                Staff staff = new Staff();
                staff.setId(rs.getString("id"));
                staff.setName(rs.getString("name"));
                staff.setRole(rs.getString("role"));
                staff.setPhone(rs.getInt("phone"));

                listofstaff.add(staff);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return listofstaff;
    }
}

