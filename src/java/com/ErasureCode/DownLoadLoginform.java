/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ErasureCode;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Java
 */
public class DownLoadLoginform extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet DownLoadLoginform</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet DownLoadLoginform at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        
        
         HttpSession session1=request.getSession();
        
        Connection con=null;
        Statement st=null;
        ResultSet rs=null;
        
        try
        {
             ArrayList list=new ArrayList();
            String Username=request.getParameter("username");
            String Password=request.getParameter("password");
            System.out.println("Username="+Username+"    "+"password ="+Password);
           Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/erasurecode","root","password");
            st=con.createStatement();
            rs=st.executeQuery("Select * from registration where username='"+Username+"' and password='"+Password+"'");
            if(rs.next())
            {
               
               
                 File[] files=new File("C:/"+Username).listFiles(); 
                 System.out.println(">>>>>>>>>"+files.length);     
                    //if(files!=null && files.length>0)                    
                        for(int i=0;i<files.length;i++) {
                            String filename=files[i].getName();                                
                            list.add(filename);                            
                       }
                
                
                
                
                String productkey=rs.getString("userproductkey");
                
                response.sendRedirect("DownloadForm.jsp");
                session1.setAttribute("Username",Username);
                session1.setAttribute("ProductKey",productkey);
                session1.setAttribute("filename", list);
                        System.out.println("filename===="+list);
                
                System.out.println(" cheking correct login");
                
                
                
            }
            else
            {
                //System.out.println(Username+"    "+Password);
                //response.sendRedirect("Index.jsp");
                
                RequestDispatcher rd=request.getRequestDispatcher("DowloadLoginForm.jsp");  
                 rd.include(request, response); 
         out.print("<br><br><br><h1><center>Sorry UserName or Password Error!"+"</h1>");
       
                
            }
            
        }
        catch(Exception ex)
        {
            //ex.printStackTrace();
            System.out.println(ex);
        }
        
       
        
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
