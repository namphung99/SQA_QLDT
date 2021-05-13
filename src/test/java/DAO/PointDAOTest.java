/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Point;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class PointDAOTest {
    
    public PointDAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPointByIdStudent method, of class PointDAO.
     */
    @Test
    public void testGetPointByIdStudentSuccess() {
        String idStudent = "10";
        float cc = 10, tp1=4,tp2=9, thi =3;
        PointDAO instance = new PointDAO();
        Point expResult = new Point("10", cc, tp1, tp2, thi);
        Point result = instance.getPointByIdStudent(idStudent);
        assertEquals(expResult.toString(), result.toString());
    }
    
    @Test
    public void testGetPointByIdStudentSuccessWithIdInValid(){
        String idStudent = "1000";
        
        PointDAO instance = new PointDAO();
//        Exception exception = Assertions.assertThrows(Exception.class,
//                () -> instance.getPointByIdStudent(idStudent));
        Point expected = new Point(null, null, null, null, null);
        Point result = instance.getPointByIdStudent(idStudent);
        assertEquals(expected.toString(), result.toString());
    }
    
    @Test
    public void testGetPointByIdStudentSuccessWithIdNull() {
        String idStudent = null;
        
        PointDAO instance = new PointDAO();
        Point expected = new Point(null, null, null, null, null);
        Point result = instance.getPointByIdStudent(idStudent);
        assertEquals(expected.toString(), result.toString());
    }
    
    @Test
    public void testGetPointByIdStudentSuccessWithIdEmpty() {
        String idStudent = "";
        
        PointDAO instance = new PointDAO();
        Point expected = new Point(null, null, null, null, null);
        Point result = instance.getPointByIdStudent(idStudent);
        assertEquals(expected.toString(), result.toString());
    }

    /**
     * Test of editPoint method, of class PointDAO.
     */
    @Test
    public void testEditPointSuccess() {
        String idStudent = "1";
        Point point = new Point("1", 10F, 9F, 10F,9F);
        PointDAO instance = new PointDAO();
        boolean expResult =true;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    @Test
    public void testEditPointWithEmptyIdStudent() {
        String idStudent = "";
        Point point = new Point("1", 10F, 9F, 10F,9F);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditPointWithNullIdStudent() {
        String idStudent = null;
        Point point = new Point("1", 10F, 9F, 10F,9F);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    @Test
    public void testEditPointWithNagetive() {
        String idStudent = "1000";
        Point point = new Point("1", 10F, 9F, 10F,9F);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditPointWithPointExceeding() {
        String idStudent = "1";
        Point point = new Point("1", 100F, 9F, 10F,9F);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditPointWithPointNegativeInteger() {
        String idStudent = "1";
        Point point = new Point("1", -10F, 9F, 10F,9F);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
}
