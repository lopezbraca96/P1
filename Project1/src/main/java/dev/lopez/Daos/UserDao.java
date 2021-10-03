package dev.lopez.Daos;

public interface UserDao {
    /**
     *  Verify login method
     */
    boolean login(String username,String password);
}