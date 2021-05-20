/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Subject;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author NguyenTheNghi
 */
public class SubjectDAOTest {
    
   @Test
    public void testGetSubjectByNameSuccess() {
        SubjectDAO instance = new SubjectDAO();
        String key ="English";
        
        Subject expect = instance.getSubjectByName(key);
        Subject subject = new Subject("2","1","English");
        assertEquals(expect.toString(),subject.toString());
        
    }
    @Test
    public void testGetSubjectByNameNull() {
        SubjectDAO instance = new SubjectDAO();
        String key =null;
        
        Subject expect = instance.getSubjectByName(key);
        assertNull(expect);
        
    }
    @Test
    public void testGetSubjectByNameEmpty() {
        SubjectDAO instance = new SubjectDAO();
        String key ="";
        
        Subject expect = instance.getSubjectByName(key);
        assertNull(expect);
        
    }
    @Test
    public void testGetSubjectByNameFail() {
        SubjectDAO instance = new SubjectDAO();
        String key ="English";
        
        Subject expect = instance.getSubjectByName(key);
        Subject subject = new Subject("1","1","English");
        assertNotEquals(expect.toString(),subject.toString());     
    }

    @Test
    public void testGetListUserByIdTeacherSuccess(){
        SubjectDAO instance = new SubjectDAO();
        String key ="1";
        ArrayList<Subject> expecteds = instance.getListUserByIdTeacher(key);
        ArrayList<Subject> actuals = new ArrayList<>();
        Subject sub1 = new Subject("1","1","Đảm bảo chất lượng phần mềm");
        actuals.add(sub1);
        Subject sub2 = new Subject("2","1","English");
        actuals.add(sub2);
        assertEquals(expecteds.toString(), actuals.toString());    
    }
    @Test
    public void testGetListUserByIdTeacherFail(){
        SubjectDAO instance = new SubjectDAO();
        String key ="1";
        ArrayList<Subject> expecteds = instance.getListUserByIdTeacher(key);
        ArrayList<Subject> actuals = new ArrayList<>();
        Subject sub1 = new Subject("2","1","Đảm bảo chất lượng phần mềm");
        actuals.add(sub1);
        Subject sub2 = new Subject("1","1","English");
        actuals.add(sub2);
        assertNotEquals(expecteds.toString(), actuals.toString());    
    }
     @Test
    public void testGetListUserByIdTeacherEmpty(){
        SubjectDAO instance = new SubjectDAO();
        String key ="";
        ArrayList<Subject> expecteds = instance.getListUserByIdTeacher(key);
  
         assertFalse(expecteds.toString().isEmpty());
    }
     @Test
    public void testGetListUserByIdTeacherNull(){
        SubjectDAO instance = new SubjectDAO();
        String key =null;
        ArrayList<Subject> expecteds = instance.getListUserByIdTeacher(key);
        System.out.println(expecteds.toString());
        assertFalse(expecteds.toString().isEmpty());
    } 
}
