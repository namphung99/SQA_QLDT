/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

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
public class PhanTramDiemTest {
    
    public PhanTramDiemTest() {
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
     * Test of getId method, of class PhanTramDiem.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        PhanTramDiem instance = new PhanTramDiem();
        String expResult = "";
        String result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class PhanTramDiem.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        String id = "";
        PhanTramDiem instance = new PhanTramDiem();
        instance.setId(id);
        
    }

    /**
     * Test of getIdSubject method, of class PhanTramDiem.
     */
    @Test
    public void testGetIdSubject() {
        System.out.println("getIdSubject");
        PhanTramDiem instance = new PhanTramDiem();
        String expResult = "";
        String result = instance.getIdSubject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdSubject method, of class PhanTramDiem.
     */
    @Test
    public void testSetIdSubject() {
        System.out.println("setIdSubject");
        String idSubject = "";
        PhanTramDiem instance = new PhanTramDiem();
        instance.setIdSubject(idSubject);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhantramCC method, of class PhanTramDiem.
     */
    @Test
    public void testGetPhantramCC() {
        System.out.println("getPhantramCC");
        PhanTramDiem instance = new PhanTramDiem();
        Float expResult = null;
        Float result = instance.getPhantramCC();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhantramCC method, of class PhanTramDiem.
     */
    @Test
    public void testSetPhantramCC() {
        System.out.println("setPhantramCC");
        Float phantramCC = null;
        PhanTramDiem instance = new PhanTramDiem();
        instance.setPhantramCC(phantramCC);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
     public void testSetPhantramCCWithNegative() {
        float phantramCC = -100;
        PhanTramDiem instance = new PhanTramDiem(); 
//        instance.setPhantramCC(phantramCC);
//        System.out.println("expected result: ");
        Exception exception = Assertions.assertThrows(Exception.class,
                () ->instance.setPhantramCC(phantramCC) );
    }

    /**
     * Test of getPhantramTP1 method, of class PhanTramDiem.
     */
    @Test
    public void testGetPhantramTP1() {
        System.out.println("getPhantramTP1");
        PhanTramDiem instance = new PhanTramDiem();
        Float expResult = null;
        Float result = instance.getPhantramTP1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhantramTP1 method, of class PhanTramDiem.
     */
    @Test
    public void testSetPhantramTP1() {
        System.out.println("setPhantramTP1");
        Float phantramTP1 = null;
        PhanTramDiem instance = new PhanTramDiem();
        instance.setPhantramTP1(phantramTP1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhantramTP2 method, of class PhanTramDiem.
     */
    @Test
    public void testGetPhantramTP2() {
        System.out.println("getPhantramTP2");
        PhanTramDiem instance = new PhanTramDiem();
        Float expResult = null;
        Float result = instance.getPhantramTP2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhantramTP2 method, of class PhanTramDiem.
     */
    @Test
    public void testSetPhantramTP2() {
        System.out.println("setPhantramTP2");
        Float phantramTP2 = null;
        PhanTramDiem instance = new PhanTramDiem();
        instance.setPhantramTP2(phantramTP2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhantramDT method, of class PhanTramDiem.
     */
    @Test
    public void testGetPhantramDT() {
        System.out.println("getPhantramDT");
        PhanTramDiem instance = new PhanTramDiem();
        Float expResult = null;
        Float result = instance.getPhantramDT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhantramDT method, of class PhanTramDiem.
     */
    @Test
    public void testSetPhantramDT() {
        System.out.println("setPhantramDT");
        Float phantramDT = null;
        PhanTramDiem instance = new PhanTramDiem();
        instance.setPhantramDT(phantramDT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PhanTramDiem.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PhanTramDiem instance = new PhanTramDiem();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
