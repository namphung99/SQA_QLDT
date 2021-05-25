/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Classic;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import javax.transaction.Transactional;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author DELL
 */
public class ClassicDAOTest {
    
    public ClassicDAOTest() {
    }
    
    

    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    @Test
    public void testGetIDClassByNameSuccess() {
        String time = "D17_SQA01";
        String idSub = "1";
        ClassicDAO instance = new ClassicDAO();
        String expResult = "1";
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);    
    }
    
    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    
    @Test
    public void testGetIDClassByNameSuccessWithIdInValid() {
        String time = "D17_SQA02";
        String idSub = "1000";
        ClassicDAO instance = new ClassicDAO();
        String expResult = null;
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    
    @Test
    public void testGetIDClassByNameSuccessWithIdNullIDSub() {
        String time = "D17_SQA02";
        String idSub = null;
        ClassicDAO instance = new ClassicDAO();
        String expResult = null;
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    
    @Test
    public void testGetIDClassByNameSuccessWithIdNullTime() {
        String time = null;
        String idSub = "1";
        ClassicDAO instance = new ClassicDAO();
        String expResult = null;
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    
    @Test
    public void testGetIDClassByNameSuccessWithIdNullIDSubAndTime() {
        String time = null;
        String idSub = null;
        ClassicDAO instance = new ClassicDAO();
        String expResult = null;
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    
    @Test
    public void testGetIDClassByNameSuccessWithIdEmptyIDSub() {
        String time = "D17_SQA02";
        String idSub = "";
        ClassicDAO instance = new ClassicDAO();
        String expResult = null;
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    
    @Test
    public void testGetIDClassByNameSuccessWithIdEmptyTime() {
        String time = "";
        String idSub = "1";
        ClassicDAO instance = new ClassicDAO();
        String expResult = null;
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
    /**
     * Test of getIDClassByName method, of class ClassicDAO.
     * get IdClass from time class and IDsubject
     */
    
    @Test
    public void testGetIDClassByNameSuccessWithIdEmptyIDSubAndTime() {
        String time = "";
        String idSub = "";
        ClassicDAO instance = new ClassicDAO();
        String expResult = null;
        String result = instance.getIDClassByName(time, idSub);
        System.out.println(result);
        assertEquals(expResult, result);
        
    }
    
    

    /**
     * Test of getListClassicByIdSubject method, of class ClassicDAO.
     */
    @Test
    public void testGetListClassicByIdSubjectSuccess() {
        String idSubject = "1";
        ClassicDAO instance = new ClassicDAO();
        ArrayList<Classic> expResult = new ArrayList<Classic>();
        Classic c1 = new Classic("1", "1", "INT-01", "D17_SQA01", null);
        Classic c2 = new Classic("2", "1", "INT-02", "D17_SQA02", null);
        expResult.add(c1);
        expResult.add(c2);
        ArrayList<Classic> result = instance.getListClassicByIdSubject(idSubject);
        assertEquals(expResult.toString(), result.toString());
    }
    
    /**
     *
     */
    @Test
    public void testGetListClassicByIdSubjectSuccessWithIdInValid() {
        String idSubject = "1000";
        ClassicDAO instance = new ClassicDAO();
        ArrayList<Classic> expResult = new ArrayList<Classic>();
        ArrayList<Classic> result = instance.getListClassicByIdSubject(idSubject);
        assertEquals(expResult.toString(), result.toString());
    }
    
    
    /**
     *
     */
    @Test
    public void testGetListClassicByIdSubjectSuccessWithIdNull() {
        String idSubject = null;
        ClassicDAO instance = new ClassicDAO();
        ArrayList<Classic> expResult = new ArrayList<Classic>();        
        ArrayList<Classic> result = instance.getListClassicByIdSubject(idSubject);
        assertEquals(expResult.toString(), result.toString());
    }
    
    /**
     *
     */
    @Test
    public void testGetListClassicByIdSubjectSuccessWithIdEmpty() {
        String idSubject = "";
        ClassicDAO instance = new ClassicDAO();
        ArrayList<Classic> expResult = new ArrayList<Classic>();
        ArrayList<Classic> result = instance.getListClassicByIdSubject(idSubject);
        assertEquals(expResult.toString(), result.toString());
    }
    
//    @Test
//    @Transactional
//    @Rollback(true)
//    public void testAddDepartment()
//    {
//        
//    }
    
}
