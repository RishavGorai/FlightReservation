/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Rishav
 */
public class Adminlogin extends HttpServlet 
{
    public void doPost(HttpServletRequest req,
          HttpServletResponse res)throws IOException,ServletException
  {
      res.setContentType("text/html");
      PrintWriter pw1=res.getWriter();
      String nm=req.getParameter("n");
      String na=req.getParameter("n1");
      try
         {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             
             Connection con =DriverManager.getConnection
                 ("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
              Statement stmt=con.createStatement();
              String s1="select * from student1 where EID='"+nm+"' and PASSWORD='"+na+"'";
               ResultSet rs=stmt.executeQuery(s1);
              if(rs.next())
              {
                  pw1.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"  <title>Welcome Page</title>\n" +
"  <style>\n" +
"    body {\n" +
"      \n" +
"      background-image:url('pexels-photo-3140204.jpeg');\n" +
"      background-size: cover;\n" +
"      font-family: Arial, sans-serif;\n" +
"      margin: 0;\n" +
"      padding: 0;\n" +
"    }\n" +
"\n" +
"    .container {\n" +
"     \n" +
"      width: 400px;\n" +
"      margin: 100px auto;\n" +
"      background-color: #fff;\n" +
"      padding: 20px;\n" +
"      border-radius: 15px;\n" +
"      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n" +
"      text-align: center;\n" +
"    }\n" +
"\n" +
"    h1 {\n" +
"      color: #333;\n" +
"    }\n" +
"\n" +
"    p {\n" +
"      color: #666;\n" +
"    }\n" +
"\n" +
"    .admin-message {\n" +
"      font-size: 18px;\n" +
"      font-weight: bold;\n" +
"      margin-top: 30px;\n" +
"      color: chartreuse;\n" +
"    }\n" +
"  </style>\n" +
"</head>\n" +
"<body>\n" +
"  <div class=\"container\">\n" +
"    <h1>Welcome</h1>\n" +
"    <p class=\"admin-message\">Hello, Admin!</p>\n" +
"    <p><a href=\"Adminadd.jsp\">Update Module</a></p>\n" +
"  </div>\n" +
"</body>\n" +
"</html>");
              }
              else
              {
                  pw1.println("not found");
              }
              con.close();
         }
    catch(Exception e)
    {
        pw1.println(e);
         
    }
}
}

