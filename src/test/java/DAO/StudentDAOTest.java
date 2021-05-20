/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.BangDiem;
import entities.Point;
import entities.Student;
import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.Test;


/**
 *
 * @author NguyenTheNghi
 */
public class StudentDAOTest {
    
    public StudentDAOTest() {
        
    }

    @Test
    public void testGetStudentByUserIDSuccess() {
        StudentDAO instance = new StudentDAO();
        Student student = new Student("1","HoaiNam","B17DCCN452");
        String key ="1";
        
        Student expect = instance.getStudentByUserID(key);
       
        
        assertEquals(expect.toString(),student.toString());
        
    }
     @Test
    public void testGetStudentByUserIDFail() {
        StudentDAO instance = new StudentDAO();
        Student student = new Student("1","HoaiNam","B17DCCN452");
        String key ="100";
        
        Student expect = instance.getStudentByUserID(key);
       
        
         assertNull(expect);
        
    }
    @Test
    public void testGetStudentByUserIDNull() {
        StudentDAO instance = new StudentDAO();
        Student student = new Student();
        String key = null;
        
        Student expect = instance.getStudentByUserID(key);
       
        
        assertNull(expect);
        
    }
    @Test
    public void testGetStudentByUserIDEmpTy() {
        StudentDAO instance = new StudentDAO();
        Student student = new Student();
        String key ="";
        
        Student expect = instance.getStudentByUserID(key);
        assertNull(expect);
//        assertFalse(expect.toString().isEmpty());
        //assertEquals(expect.toString(),student.toString());
        
    }
    @Test
    public void testGetListStudentByIdUserSuccess() {
        StudentDAO instance = new StudentDAO();
        String key ="1";
        ArrayList<BangDiem> expecteds = instance.getListStudentByIdUser(key);
        ArrayList<BangDiem> actuals = new ArrayList<>();
        // do thành phần điểm của bài này vẫn để là 10 20 0 50 chưa sửa nên dữ liệu vào hơi ngược đời tý 
        Student std1= new Student("1","HoaiNam","B17DCCN452");
        Point p1 = new Point("1",(float)9.0,(float)10.0,(float)10.0,(float)9.0);
        p1.setDiemTB((float)7.0);
        p1.setDKDT(1);
        BangDiem bd1 = new BangDiem(std1,1,p1);
        
        Student std2= new Student("2","HOA","B17DCCN877");
        Point p2 = new Point("2",(float)8.0,(float)7.0,(float)9.0,(float)0.0);
        p2.setDiemTB((float)3.1);
        p2.setDKDT(0);
        BangDiem bd2 = new BangDiem(std2,2,p2);
        
        actuals.add(bd1);
        actuals.add(bd2);
                
        assertEquals(expecteds.toString(), actuals.toString());
    }
    @Test
    public void testGetListStudentByIdUserFail() {
        StudentDAO instance = new StudentDAO();
        String key ="50";
        ArrayList<BangDiem> expecteds = instance.getListStudentByIdUser(key);
        ArrayList<BangDiem> actuals = new ArrayList<>();
        Student ex = new Student();
        // do thành phần điểm của bài này vẫn để là 10 20 0 50 chưa sửa nên dữ liệu vào hơi ngược đời tý 
        Student std1= new Student("1","HoaiNam","B17DCCN452");
        Point p1 = new Point("1",(float)10.0,(float)9.0,(float)10.0,(float)8.0);
        p1.setDiemTB((float)7.0);
        p1.setDKDT(1);
        BangDiem bd1 = new BangDiem(std1,1,p1);
        
        Student std2= new Student("2","HOA","B17DCCN877");
        Point p2 = new Point("2",(float)8.0,(float)7.0,(float)9.0,(float)0.0);
        p2.setDiemTB((float)3.1);
        p2.setDKDT(0);
        BangDiem bd2 = new BangDiem(std2,2,p2);
        
        actuals.add(bd1);
        actuals.add(bd1);
                
     boolean sizearray =true;
        if(expecteds.size()==0)
        {
            sizearray=false;
        }
     
        assertFalse(sizearray);
    }
    @Test
    public void testGetListStudentByIdUserNull() {
        StudentDAO instance = new StudentDAO();
        String key =null;
        ArrayList<BangDiem> expecteds = instance.getListStudentByIdUser(key);
        
        boolean sizearray =true;
        if(expecteds.size()==0)
        {
            sizearray=false;
        }
     
        assertFalse(sizearray);
        // do thành phần điểm của bài này vẫn để là 10 20 0 50 chưa sửa nên dữ liệu vào hơi ngược đời tý 
//        Student std1= new Student("1","HoaiNam","B17DCCN452");
//        Point p1 = new Point("1",(float)10.0,(float)9.0,(float)10.0,(float)8.0);
//        p1.setDiemTB((float)7.0);
//        p1.setDKDT(1);
//        BangDiem bd1 = new BangDiem(std1,1,p1);
//        
//        Student std2= new Student("2","HOA","B17DCCN877");
//        Point p2 = new Point("2",(float)8.0,(float)7.0,(float)9.0,(float)0.0);
//        p2.setDiemTB((float)3.1);
//        p2.setDKDT(0);
//        BangDiem bd2 = new BangDiem(std2,2,p2);
//        
//        actuals.add(bd1);
//        actuals.add(bd2);
//      
       
    }
    @Test
       public void testGetListStudentByIdUserEmpty() {
           StudentDAO instance = new StudentDAO();
           String key ="";
           ArrayList<BangDiem> expecteds = instance.getListStudentByIdUser(key);
           boolean sizearray =true;
        if(expecteds.size()==0)
        {
            sizearray=false;
        }
     
        assertFalse(sizearray);
//           assertFalse(expecteds.get(0).toString().isEmpty());
      }
    @Test
    public void testTinhTBSuccess() {
        StudentDAO instance = new StudentDAO();
        float tb = instance.tinhTB((float)10.0,(float)9.0,(float)10.0,(float)8.0,(float)10 ,(float)20,(float)20,(float)50);
        
        float test = (float)8.8;
        assertEquals(String.valueOf(tb), String.valueOf(test));
    }
    @Test
    public void testTinhTBFail() {
        StudentDAO instance = new StudentDAO();
        float tb = instance.tinhTB((float)-10.0,(float)9.0,(float)10.0,(float)8.0,(float)10 ,(float)20,(float)20,(float)50);
        float test = (float)6.8;
        assertEquals(String.valueOf(tb), String.valueOf(test));
    }
    
}
