package dev.lopez.Daos;
//This class will be used to define methods that we can use to interact with our Database.
//The methods in this class will be CRUD methods
//C -Create (add or insert into a new record in our database)
//R- Read    (SELECT - retrieve data from the database)
//U - Update
//D - Delete

import dev.lopez.models.Employee;
import dev.lopez.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRepo {

    private ConnectionUtil cu = ConnectionUtil.getConnectionUtil();


    public Employee getEmployeeByUsername (String username){

        try (Connection conn = cu.getConnection()) {

            String sql = "select * from \"TRMS\".staff where username = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Employee e = new Employee(
                        rs.getInt("user_id"),
                        rs.getString ("first_name"),
                        rs.getString ("last_name"),
                        rs.getString("username"),
                        rs.getString("pass_word"),
                        rs.getString("email"),
                        rs.getString("department"),
                        rs.getString("position1"),
                        rs.getString("position2"),
                        rs.getDouble("available_reimbursement")

                );

                return e;
            }

        }catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean updateReimbursement(Employee e) {
        try (Connection con = cu.getConnection()) {
            String sql = "update \"TRMS\".staff set available_reimbursement = ? where user_id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, e.getAvailableReimbursement());
            ps.setInt(2, e.getUserid());

            ps.executeUpdate();

            return true;
        } catch (SQLException c) {
            c.printStackTrace();
        }
        return false;
    }
    //maybe add method for view all employees




}

