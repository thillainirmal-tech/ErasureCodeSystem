/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ErasureCode;

import com.commondb.Common_DB;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Key;
import java.sql.ResultSet;
import java.util.List;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author Java
 */
public class FileUpload2 extends HttpServlet {

    String group1 = "server1";
    String group2 = "server2";
    String group3 = "server3";
    String group4 = "server4";
    String serverkey1 = "";
    String serverkey2 = "";
    String serverkey3 = "";
    String serverkey4 = "";
    String code1 = "";
    String code2 = "key1";
    String code3 = "key2";
    String code4 = "key3";

    private static Key generateKey(String productkey) throws Exception {

        System.out.println("Run time aggruments" + productkey);
        String keyValue = "";
        ResultSet rs1 = Common_DB.ViewParticularData("erasurecode", "registration", "userproductkey", productkey);
        String group2 = "";
        if (rs1.next()) {
            group2 = rs1.getString("userproductkey");

            System.out.println("  head key ==" + group2);
        }
        System.out.println("WWWWWWWWWW" + group2);
        Key key = new SecretKeySpec(group2.getBytes(), "AES");
        return key;
    }

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
            out.println("<title>Servlet FileUpload2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileUpload2 at " + request.getContextPath() + "</h1>");
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
        
        
        int partCounter = 1;//I like to name parts from 001, 002, 003, ...
        int serv = 0; //you can change it to 0 if you want 000, 001, ...
        long fileSize ;
              
        int ff =0;
                        int s=0 ;
                        int m=0;
                        
        String name = null;
        String hashvalue1 = "";
        String hashvalue2 = "";
        String hashvalue3 = "";
        HttpSession session1 = request.getSession(true);
        String productkey = session1.getAttribute("productkey").toString();
        String group = session1.getAttribute("Username").toString();
        System.out.println("FFFFFFFFFF" + productkey);
        System.out.println("deva i will checking");
        final String UPLOAD_DIRECTORY = "C:/" + group;
        System.out.println("file cheking " + UPLOAD_DIRECTORY);
        final String UPLOAD_DIRECTORY1 = "D:/" + group1;
        System.out.println("file cheking " + UPLOAD_DIRECTORY1);
        final String UPLOAD_DIRECTORY2 = "D:/" + group2;
        System.out.println("file cheking " + UPLOAD_DIRECTORY1);
        final String UPLOAD_DIRECTORY3 = "D:/" + group3;
        System.out.println("file cheking " + UPLOAD_DIRECTORY1);
        final String UPLOAD_DIRECTORY4 = "D:/" + group4;
        System.out.println("file cheking " + UPLOAD_DIRECTORY1);
        System.out.println("-------------------------------------");
        String TempUploadDirectory = "C:/temp10";
        System.out.println("AAAAAAAAAAAAAAAAAAAAA" + TempUploadDirectory);
        File file = new File(TempUploadDirectory);
        if (!(file.exists())) {
            file.mkdir();
        }
        if (ServletFileUpload.isMultipartContent(request)) {
            try {
                String nn = "";
                List<FileItem> multiparts = new ServletFileUpload(
                        new DiskFileItemFactory()).parseRequest(request);

                for (FileItem item : multiparts) {
                    if (!item.isFormField()) {
                        name = new File(item.getName()).getName();
                        item.write(new File(TempUploadDirectory + File.separator + name));
                        nn = name;
                       
                        fileSize = item.getSize();
                        System.out.println("ssssizeeeee" + fileSize);
                       ff = Integer.parseInt(String.valueOf(fileSize));
                        s = ff / 1024;
                        m = s / 4;
                        
                        
                        
                        

                    }
                }
                Key key1 = generateKey(productkey);
                AESEncrypter encrypter = new AESEncrypter((SecretKey) key1);
                encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY + File.separator + nn));
               //encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY1 + File.separator + nn));
                //encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY2 + File.separator + nn));
               //encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY3 + File.separator + nn));
               //encrypter.encrypt(new FileInputStream(TempUploadDirectory + File.separator + nn), new FileOutputStream(UPLOAD_DIRECTORY4 + File.separator + nn));

                String hashvalue = mdhashing.shaa(UPLOAD_DIRECTORY + File.separator + nn);

                hashvalue1 = hashvalue.concat(code2);

                hashvalue2 = hashvalue.concat(code3);

                hashvalue3 = hashvalue.concat(code4);

                Common_DB.InsertTable("erasurecode", "insert into ownerprofile values('" + group + "','" + group + "','" + name + "','" + hashvalue + "','" + hashvalue1 + "','" + hashvalue2 + "','" + hashvalue3 + "')");
                //File uploaded successfully
                request.setAttribute("message", "File gggg Uploaded Successfully");
                
                
                int sizeOfFiles = m * 1024;// 1MB
                byte[] buffer = new byte[sizeOfFiles];
                  try (BufferedInputStream bis = new BufferedInputStream(
                                new FileInputStream(TempUploadDirectory + File.separator + nn))) {
                       int tmp = 0;
                            while ((tmp = bis.read(buffer)) > 0) {
                                //write each chunk of data into separate file with different number in name

                                serv++;
                                
                                File newFile = new File("D:/server" + serv + "/", name + "." + String.format("%03d", partCounter++));
                                System.out.println(serv);
                                try (FileOutputStream out = new FileOutputStream(newFile)) {
                                    out.write(buffer, 0, tmp);//tmp is chunk size
                                }
                            }
                  }
                
            } catch (Exception ex) {
                request.setAttribute("message", "File Upload Failed due to " + ex);
            }

        } else {
            request.setAttribute("message",
                    "Sorry this Servlet only handles file upload request");
        }

        request.getRequestDispatcher("/result.jsp").forward(request, response);
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
