/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Point;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.transaction.Transactional;
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
public class PointDAOTest extends DAO{
    
    public PointDAOTest() throws SQLException {
        super();
        con.setAutoCommit(false);
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
    public void testGetPointByIdStudentWithIdInValid(){
        String idStudent = "1000";
        
        PointDAO instance = new PointDAO();
        Point expected = new Point(null, null, null, null, null);
        Point result = instance.getPointByIdStudent(idStudent);
        assertEquals(expected.toString(), result.toString());
    }
    
    @Test
    public void testGetPointByIdStudentWithIdNull() {
        String idStudent = null;
        
        PointDAO instance = new PointDAO();
        Point expected = new Point(null, null, null, null, null);
        Point result = instance.getPointByIdStudent(idStudent);
        assertEquals(expected.toString(), result.toString());
    }
    
    @Test
    public void testGetPointByIdStudentWithIdEmpty() {
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
    public void testEditPointSuccess(){
        String idStudent = "1";
        Point point = new Point("1", (float)10, (float)10, (float)10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =true;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    @Test
    public void testEditPointWithEmptyIdStudent(){
        String idStudent = "";
        Point point = new Point("1", (float)10, (float)10,(float) 10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditPointWithNullIdStudent() {
        String idStudent = null;
        Point point = new Point("1", (float)10, (float)10, (float)10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    @Test
    public void testEditPointWithNagetiveId(){
        String idStudent = "1000";
        Point point = new Point("1", (float)10, (float)10, (float)10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditPointWithPointExceeding(){
        String idStudent = "1";
        Point point = new Point("1", (float)100, (float)9, (float)10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditPointWithPointNegativeInteger(){
        String idStudent;
        idStudent = "1";
        Point point = new Point("1", (float)-10, (float)9, (float)10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =false;
        boolean result = instance.editPoint(point, idStudent);
        assertEquals(expResult, result);
    }
    @Test
    public void testEditPointWithPointEquals0(){
        String idStudent = "1";
        Point point = new Point("1", (float)10, (float)0, (float)10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =true;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEditPointWithPointEquals10() {
        String idStudent = "1";
        Point point = new Point("1", (float)10, (float)10,(float) 10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =true;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
    @Test
    public void testEditPointWithPointDecimal() {
        String idStudent = "1";
        Point point = new Point("1", (float)9.5, (float)10, (float)10,(float)9);
        PointDAO instance = new PointDAO();
        boolean expResult =true;
        boolean result = instance.editPoint(point, idStudent);
        System.out.println("data is: "+ (result));
        assertEquals(expResult, result);
    }
}
