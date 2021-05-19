/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.PhanTramDiem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class PhanTramDiemDAOTest {
    
    public PhanTramDiemDAOTest() {
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
     * Test of getPhanTramDiemByIdSubject method, of class PhanTramDiemDAO.
     */
    @Test
    public void testGetPhanTramDiemByIdSubjectSuccess() {
        System.out.println("getPhanTramDiemByIdSubject");
        String idSubject = "2";
        float cc =10, tp1 =20, tp2 =20, thi = 50;
        PhanTramDiemDAO instance = new PhanTramDiemDAO();
        PhanTramDiem expResult = new PhanTramDiem("2","2",cc,tp1,tp2,thi);
        PhanTramDiem result = instance.getPhanTramDiemByIdSubject(idSubject);
        System.out.println("data: "+ result);
        assertEquals(expResult.toString(), result.toString());
    }
    @Test
    public void testGetPhanTramDiemByIdSubjectInValid(){
       
        String idSubject = "abc";
        
        PhanTramDiemDAO instance = new PhanTramDiemDAO();
       
        PhanTramDiem result = instance.getPhanTramDiemByIdSubject(idSubject);
        PhanTramDiem expResult = new PhanTramDiem(null,null,null,null,null,null);
        System.out.println("data: " + result);
        assertEquals(expResult.toString(), result.toString());
    }
   
    @Test
    public void testGetPhanTramDiemByIdSubjecNull(){
       
        String idSubject = null;
        
        PhanTramDiemDAO instance = new PhanTramDiemDAO();
       
        PhanTramDiem result = instance.getPhanTramDiemByIdSubject(idSubject);
        PhanTramDiem expResult = new PhanTramDiem(null,null,null,null,null,null);
        assertEquals(expResult.toString(), result.toString());
    }
    @Test
    public void testGetPhanTramDiemByIdSubjecEmpty() throws NullPointerException{
       
        String idSubject = "";
        
        PhanTramDiemDAO instance = new PhanTramDiemDAO();
       
        PhanTramDiem result = instance.getPhanTramDiemByIdSubject(idSubject);
        PhanTramDiem expResult = new PhanTramDiem(null,null,null,null,null,null);
        assertEquals(expResult.toString(), result.toString());
    }
   
}
