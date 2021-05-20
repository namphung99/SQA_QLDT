/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.User;
import java.sql.ResultSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;

/**
 *
 * @author ducnam
 */
public class UserDAOTest {

    public UserDAOTest() {
    }

    @BeforeAll
    public void BeforeAll() {
        System.out.println("before");
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
    public void testCheckLoginFail() {
        UserDAO instance = new UserDAO();
        User user = new User("demo", "1");

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
    public void testGetUserByIdFail() throws NullPointerException {
        UserDAO instance = new UserDAO();
        String key = "100000";

        instance.getUserById(key);
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
    public void testGetUserByUsernameFail() {
        UserDAO instance = new UserDAO();
        String key = "nam";

        User expect = instance.getUserByUsername(key);
        User actual = new User("2", "thao", "1", "student");

        assertNotEquals(expect.toString(), actual.toString());
    }
    
    @Test
    public void testDeleteUser() {
    }

}
