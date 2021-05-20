/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;


import entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author DELL
 */
public class UserDAO extends DAO {

    public UserDAO() {
        super();
    }

    public boolean checkLogin(User user) {
        boolean result = false;
        String sql = "SELECT Potion FROM user WHERE Username = ? AND Password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
//            String password = user.getPassword();
//            String hash_pws = MD5Hashing.getMD5(password);
            
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                user.setPotion(rs.getString("Potion"));
                result = true;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return result;
    }
    
    public User getUserById(String key) {
        User user = new User();
        String sql = "SELECT * FROM user WHERE Id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user.setId(rs.getString("Id"));
                user.setPotion(rs.getString("Potion"));
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                System.out.println(user.toString());
                return user;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }
    
    public User getUserByUsername(String key) {
        User user = new User();
        String sql = "SELECT * FROM user WHERE Username=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                user.setId(rs.getString("Id"));
                user.setPotion(rs.getString("Potion"));
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("Password"));
                System.out.println(user.toString());
                return user;
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }



    /**
     * delete the User whose id is @id
     *
     * @param id
     */
    public boolean deleteUser(int id) {
        String sql = "DELETE FROM user WHERE id=?";
        int kt = 0;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            kt = ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

        return kt != 0;
    }

}
