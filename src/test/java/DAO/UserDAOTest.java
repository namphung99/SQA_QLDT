/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.User;
import java.sql.SQLException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ducnam
 */
public class UserDAOTest {

    public UserDAOTest() {
    }

    @Test
    public void testCheckLoginSuccess() {
        UserDAO instance = new UserDAO();
        User user = new User("demo", "1234567");

        boolean expect = instance.checkLogin(user);
        boolean actual = true;

        assertEquals(expect, actual);
    }

    @Test
    public void testCheckLoginEmptyUsername() {
        UserDAO instance = new UserDAO();
        User user = new User("", "1234567");

        boolean expect = instance.checkLogin(user);
        boolean actual = false;

        assertEquals(expect, actual);
    }

    @Test
    public void testCheckLoginEmptyPassword() {
        UserDAO instance = new UserDAO();
        User user = new User("demo", "");

        boolean expect = instance.checkLogin(user);
        boolean actual = false;

        assertEquals(expect, actual);
    }

    @Test
    public void testCheckLoginWrongUsername() {
        UserDAO instance = new UserDAO();
        User user = new User("demo1", "1234567");

        boolean expect = instance.checkLogin(user);
        boolean actual = false;

        assertEquals(expect, actual);
    }

    @Test
    public void testCheckLoginWrongPassword() {
        UserDAO instance = new UserDAO();
        User user = new User("demo", "1");

        boolean expect = instance.checkLogin(user);
        boolean actual = false;

        assertEquals(expect, actual);
    }

    @Test
    public void testCheckLoginWrongPasswordEqualGreatThan6Character() {
        UserDAO instance = new UserDAO();
        User user = new User("demo", "123456");

        boolean expect = instance.checkLogin(user);
        boolean actual = false;

        assertEquals(expect, actual);
    }

    @Test
    public void testGetUserByIdSuccess() {
        UserDAO instance = new UserDAO();
        String key = "10";

        User expect = instance.getUserById(key);
        User actual = new User("10", "nam", "1", "student");

        assertEquals(expect.toString(), actual.toString());
    }

    @Test
    public void testGetUserByIdWrongId() {
        UserDAO instance = new UserDAO();
        String key = "1000";

        User expect = instance.getUserById(key);

        assertEquals(expect, null);
    }

    @Test
    public void testGetUserByIdEmptyId() {
        UserDAO instance = new UserDAO();
        String key = "";

        User expect = instance.getUserById(key);

        assertEquals(expect, null);
    }

    @Test
    public void testGetUserByIdWrongDataTypeId() {
        UserDAO instance = new UserDAO();
        String key = "abc";

        User expect = instance.getUserById(key);

        assertEquals(expect, null);
    }

    @Test
    public void testGetUserByUsernameSuccess() {
        UserDAO instance = new UserDAO();
        String key = "thao";

        User expect = instance.getUserByUsername(key);
        User actual = new User("2", "thao", "1", "student");

        assertEquals(expect.toString(), actual.toString());
    }

    @Test
    public void testGetUserByUsernameEmpty() {
        UserDAO instance = new UserDAO();
        String key = "";

        User expect = instance.getUserByUsername(key);
        User actual = null;

        assertEquals(expect, actual);
    }

    @Test
    public void testGetUserByUsernameWrongDataType() {
        UserDAO instance = new UserDAO();
        String key = "abc";

        User expect = instance.getUserByUsername(key);
        User actual = null;

        assertEquals(expect, actual);
    }

    @Test
    public void testGetUserByUsernameWrong() {
        UserDAO instance = new UserDAO();
        String key = "nam";

        User expect = instance.getUserByUsername(key);
        User actual = new User("2", "thao", "1", "student");

        assertNotEquals(expect.toString(), actual.toString());
    }

    @Test
    public void testDeleteUserSuccess() throws SQLException {
        UserDAO instance = new UserDAO();
        int id = 3;

        try {
            DAO.con.setAutoCommit(false);
            boolean expect = instance.deleteUser(id);
            boolean actual = false;

            assertEquals(expect, actual);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    @Test
    public void testDeleteUsertestDeleteUserWrongId() throws SQLException {
        UserDAO instance = new UserDAO();
        int id = 100000;

        try {
            DAO.con.setAutoCommit(false);
            boolean expect = instance.deleteUser(id);
            boolean actual = false;

            assertEquals(expect, actual);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                DAO.con.rollback();
                DAO.con.setAutoCommit(true);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
}
