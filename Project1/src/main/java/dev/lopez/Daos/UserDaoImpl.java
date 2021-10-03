package dev.lopez.Daos;

import dev.lopez.models.Employee;
import dev.lopez.utils.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private ConnectionUtil cu = ConnectionUtil.getConnectionUtil();

    /**
     * Method used to verify login
     *
     * @param username
     * @param password
     * @return
     */
    @Override
    public boolean login(String username, String password) {

        try (Connection conn = ConnectionUtil.getConnection()) {

            String sql = "select * from \"TRMS\".staff where username = ? and pass_word = ?";

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return false;





    }

}
