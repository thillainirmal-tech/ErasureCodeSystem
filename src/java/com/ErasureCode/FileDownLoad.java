/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ErasureCode;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Java
 */
public class FileDownLoad extends HttpServlet {

    String servertemmsg = "";
    String dataservertemmsg = "";
    int servercount = 0;
    int dataserverrcount = 0;
    static String filename;

    private static Key generateKey(String productkey) {
        String keyValue = productkey;
        Key key = new SecretKeySpec(keyValue.getBytes(), "AES");
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
            out.println("<title>Servlet FileDownLoad</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FileDownLoad at " + request.getContextPath() + "</h1>");
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

        String server1 = "D:/server1";
        String server2 = "D:/server2";
        String server3 = "D:/server3";
        String server4 = "D:/server4";
        HttpSession session1 = request.getSession(true);
        String productkey = request.getParameter("password");
        String group = session1.getAttribute("Username").toString();
        String orgkey = session1.getAttribute("ProductKey").toString();
        filename = request.getParameter("filename");
        System.out.println("org key=====" + orgkey);
        System.err.println("org key=====" + orgkey);
        System.out.println("pws" + productkey);
        System.out.println("username" + group);
        System.out.println("file anme" + filename);
        if (productkey.equals(orgkey)) {
            //String productkey=session1.getAttribute("productkey").toString();
            try {
                String TempDownloadDirectory = "C:/temp15/";
                File files1 = new File(server1);
                File files2 = new File(server2);
                File files3 = new File(server3);
                File files4 = new File(server4);
                if (!(files1.exists())) {
                    // file.mkdir();   
                    servertemmsg = " sever1 not found  " + servertemmsg;
                    servercount++;
                    System.out.println("sever1 not found ");
                }
                if (!(files2.exists())) {
                    //file.mkdir();   
                    servertemmsg = " sever2 not found " + servertemmsg;
                    servercount++;
                    System.out.println("sever2 not found ");
                }
                if (!(files3.exists())) {
                    servertemmsg = " sever3 not found  " + servertemmsg;
                    //  file.mkdir();   
                    servercount++;
                    System.out.println("sever3 not found ");
                }
                if (!(files4.exists())) {
                    servertemmsg = " sever2 not found " + servertemmsg;
                    //file.mkdir();  
                    servercount++;
                    System.out.println("sever3 not found ");
                }

                String sm1 = server1 + "/" + filename + ".001";
                String sm2 = server2 + "/" + filename + ".002";
                String sm3 = server3 + "/" + filename + ".003";
                String sm4 = server4 + "/" + filename + ".004";
                File datafiles1 = new File(sm1);
                File datafiles2 = new File(sm2);
                File datafiles3 = new File(sm3);
                File datafiles4 = new File(sm4);
                System.out.println("vvvvvv===" + sm1);
                System.out.println("\n nnnnnn===" + datafiles1);
                if (!(datafiles1.exists())) {
                    // file.mkdir();   
                    dataserverrcount++;
                    dataservertemmsg = " sever1 data hacked " + dataservertemmsg;
                    //System.out.println("sever1 data not found ");
                } else {
                    //File input = new File("datafiles1");

                    /* BufferedImage buffImg = ImageIO.read(datafiles1);
                    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                    ImageIO.write(buffImg, "png", outputStream);
                    byte[] data = outputStream.toByteArray();
                    System.out.println("Start MD5 Digest");
                    MessageDigest md = null;
                    try {
                            md = MessageDigest.getInstance("MD5");
                        } catch (NoSuchAlgorithmException ex) 
                            {
                                Logger.getLogger(FileDownLoad.class.getName()).log(Level.SEVERE, null, ex);
                            }
                    md.update(data);
                    byte[] hash = md.digest();
                    try {
                            System.out.println("severkey generazsdfgsdfg"+returnHex(hash));
                        } 
                    catch (Exception ex) {
                             Logger.getLogger(FileDownLoad.class.getName()).log(Level.SEVERE, null, ex);
                        }
                     */
                }
                if (!(datafiles2.exists())) {
                    //file.mkdir();   
                    dataserverrcount++;
                    dataservertemmsg = " sever2 data hacked \n" + dataservertemmsg;
                    ///System.out.println("sever2 data not found ");   
                }
                if (!(datafiles3.exists())) {
                    //  file.mkdir();   
                    dataserverrcount++;
                    dataservertemmsg = " sever3 data hacked \n" + dataservertemmsg;
                    ///System.out.println("sever3 data not found ");
                }
                if (!(datafiles4.exists())) {
                    //file.mkdir();  
                    dataserverrcount++;
                    dataservertemmsg = " sever4 data hacked \n" + dataservertemmsg;
                    ///System.out.println("sever4 data not found ");
                }
                System.err.println("file name analysis========" + sm1);
                if ((servercount == 0) && (dataserverrcount == 0)) {
                    File file = new File(TempDownloadDirectory);
                    if (!(file.exists())) {
                        file.mkdir();
                    }
                    System.err.println("key " + productkey);
                    Key key1 = generateKey(productkey);
                    System.out.println(productkey + " ######### " + TempDownloadDirectory + filename + "????? " + group);
                    AESEncrypter Decrypter = new AESEncrypter((SecretKey) key1);
                    Decrypter.decrypt(new FileInputStream("C:/" + group + "/" + filename), new FileOutputStream(TempDownloadDirectory + filename));
                    String filepath1 = TempDownloadDirectory + filename;
                    System.out.println(filepath1 + "???????" + filename + "....." + TempDownloadDirectory);
                    //System.out.println("********* "+fn);
                    FileInputStream filetoDownload = new FileInputStream(filepath1);
                    ServletOutputStream output = response.getOutputStream();
                    //response.setContentType("images/jpg");
                    response.addHeader("Content-Disposition", "attachment;filename=" + filename);
                    response.setContentLength(filetoDownload.available());
                    int readBytes = 0;
                    byte[] buffer = new byte[1024];
                    //while((readBytes=filetoDownload.read(buffer,0,100))!=-1)
                    while (filetoDownload.available() > 0) {
                        output.write(filetoDownload.read());
                    }
                    output.close();
                    filetoDownload.close();
                } else {
                    if (!(servercount == 0)) {
                        response.sendRedirect("ServerMsg.jsp");
                        session1.setAttribute("ServerMsg", servertemmsg);
                        System.err.println(" All server hacked msg ==== " + servertemmsg);
                    } else {
                        response.sendRedirect("ServerMsg_2.jsp");
                        session1.setAttribute("ServerMsg", "data loss");
                        System.err.println(" All server data hacked  msg ====" + dataservertemmsg);
                    }
                }

            } catch (Exception ex) {
                request.setAttribute("message", "File Upload Failed due to " + ex);
                ex.printStackTrace();
                //request.setAttribute("message", "File Download Failed due to " + ex);
            }

        } else {

            response.sendRedirect("Pro_Key_Result.jsp");
            System.out.println(" ProductKey incorrect");

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

    /* static String returnHex(byte[] inBytes) throws Exception {
        String hexString = null;
        for (int i=0; i < inBytes.length; i++) { //for loop ID:1
            hexString +=
            Integer.toString( ( inBytes[i] & 0xff ) + 0x100, 16).substring( 1 );
        }                                   // Belongs to for loop ID:1
    return hexString;
  }  */
}
