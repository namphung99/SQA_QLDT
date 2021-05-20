/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Teacher;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ducnam
 */
public class TeacherDAOTest {

    public TeacherDAOTest() {
    }

    @Test
    public void testGetTeacherByUserIDSuccess() {
        try {
            TeacherDAO instance = new TeacherDAO();
            String idUser = "1";

            Teacher expect = instance.getTeacherByUserID(idUser);

            Teacher actual = new Teacher();
            actual.setId("1");
            actual.setIdUser("1");
            actual.setName("NamTC");

            assertEquals(expect.toString(), actual.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetTeacherByUserIDEmptyId() {
        try {
            TeacherDAO instance = new TeacherDAO();
            String idUser = "";

            Teacher expect = instance.getTeacherByUserID(idUser);

            assertEquals(expect, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGetTeacherByUserIDWrongId() {
        try {
            TeacherDAO instance = new TeacherDAO();
            String idUser = "1000000";

            Teacher expect = instance.getTeacherByUserID(idUser);

            Teacher actual = new Teacher();
            actual.setId("1");
            actual.setIdUser("1");
            actual.setName("NamND");

            assertNotEquals(expect.toString(), actual.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
