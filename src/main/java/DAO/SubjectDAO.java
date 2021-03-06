/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import entities.Subject;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SubjectDAO extends DAO{
    public SubjectDAO() {
        super();
    }
    
    public Subject getSubjectByName(String key) {
        Subject subject = new Subject();
        String sql = "SELECT * FROM subject WHERE Name=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, key);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                subject.setId(rs.getString("Id"));
                subject.setIdTeacher(rs.getString("teacherId"));
                subject.setName(rs.getString("Name"));

                return subject;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public ArrayList<Subject> getListUserByIdTeacher(String idTeacher) {
        ArrayList<Subject> result = new ArrayList<>();
        String sql = "SELECT * FROM subject where teacherId = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, idTeacher);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Subject subject = new Subject();
                subject.setId(rs.getString("Id"));
                subject.setName(rs.getString("Name"));
                subject.setIdTeacher(idTeacher);
                result.add(subject);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
   
    
    
}
