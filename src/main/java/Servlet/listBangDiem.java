/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DAO.ClassicDAO;
import DAO.PhanTramDiemDAO;
import DAO.StudentDAO;
import DAO.SubjectDAO;
import entities.BangDiem;
import entities.Classic;
import entities.PhanTramDiem;
import entities.Subject;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author BENH VIEN CONG NGHE
 */
public class listBangDiem extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession sesion = request.getSession();
        sesion.setAttribute("emty", "false");
        sesion.setAttribute("listPass", "true");
        sesion.setAttribute("listFail", "true");
        String userID = (String) sesion.getAttribute("idUser");
//        String nameSubject = request.getParameter("nameSub");
        String idSub = (String) sesion.getAttribute("idSubject");
        String timeClass = request.getParameter("timeClass");
        sesion.setAttribute("timeClass", timeClass);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            sesion.setAttribute("timeCla", timeClass);
            
            SubjectDAO subjectDAO = new SubjectDAO();
            List<Subject> listSubjects = new ArrayList<Subject>();
            listSubjects = subjectDAO.getListUserByIdTeacher(userID);
//            Subject subject = subjectDAO.getSubjectByName(nameSubject);
            request.setAttribute("listSubject", listSubjects);
            
            ClassicDAO classicDAO = new ClassicDAO();
            List<Classic> listClassics = new ArrayList<>();
            listClassics = classicDAO.getListClassicByIdSubject(idSub);
            String idClass = classicDAO.getIDClassByName(timeClass, idSub);
            request.setAttribute("listClassics", listClassics);
            
            PhanTramDiemDAO phanTramDiemDAO = new PhanTramDiemDAO();
            PhanTramDiem phanTramDiem = new PhanTramDiem();
            phanTramDiem = phanTramDiemDAO.getPhanTramDiemByIdSubject(idSub);
            request.setAttribute("phanTramDiem", phanTramDiem);
            
            StudentDAO studentDAO = new StudentDAO();
            List<BangDiem> listBangDiems = new ArrayList<BangDiem>();
            listBangDiems = studentDAO.getListStudentByIdUser(idClass);
            
            sapXep(listBangDiems);
//            Collections.sort(listBangDiems, Comparator.comparing(BangDiem::getPoint));
            
            request.setAttribute("listBangDiems", listBangDiems);
            if(listBangDiems.size() > 0){
                sesion.setAttribute("emty", "true");
            }
            int countDK = 0, coutKDK = 0;
            
            for (BangDiem listBangDiem : listBangDiems) {
                if (listBangDiem.getPoint().getDKDT() == 0) {
                    coutKDK ++;
                }
                else{
                    countDK ++;
                }
            }
            sesion.setAttribute("duDK", countDK);
            sesion.setAttribute("kduDK", coutKDK);
            
            RequestDispatcher view = request.getRequestDispatcher("/Home.jsp");
//            RequestDispatcher view = request.getRequestDispatcher("/listSubject.jsp");
            view.forward(request, response);
    }
    }
    
    public void sapXep(List<BangDiem> list) {
    Collections.sort(list, new Comparator<BangDiem>() {
        @Override
        public int compare(BangDiem bd1, BangDiem bd2) {
            return  bd1.getStudent().getName().compareTo(bd2.getStudent().getName());
        }
    });
}


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
