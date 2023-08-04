/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Rishav
 */

public class flibo extends HttpServlet 
{
    int i;
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    
    public void doGet(HttpServletRequest req,
          HttpServletResponse res)throws IOException,ServletException
  {
     
     
     
      try
         {
             i++;
             res.setContentType("text/html");
             PrintWriter out=res.getWriter();
            String airlinename =req.getParameter("combo");
            
             Class.forName("oracle.jdbc.driver.OracleDriver");
             
              con =DriverManager.getConnection
                 ("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
           
              pst=con.prepareStatement("select* from flight3 where Flight_name=?");
              pst.setString(1,airlinename);  
              rs=pst.executeQuery();
              out.println("<!doctype html>\n" +
"<html lang=\"en\">\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"    <title>Bootstrap demo</title>\n" +
"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n" +
"  </head>\n" +
"  <body>\n" +
"    \n" +
"    <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark\">\n" +
"\n" +
"        <div class=\"container-fluid\">\n" +
"    \n" +
"          <a class=\"navbar-brand\" href=\"#\">Flight Booking</a>\n" +
"          <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\n" +
"            aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"            <span class=\"navbar-toggler-icon\"></span>\n" +
"          </button>\n" +
"          <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
"            <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
"              <li class=\"nav-item\">\n" +
"                <a class=\"nav-link\" href=\"#\">Home</a>\n" +
"              </li>\n" +
"              <li class=\"nav-item\">\n" +
"                <a class=\"nav-link\" href=\"#\">About us</a>\n" +
"              </li>\n" +
"              <li class=\"nav-item\">\n" +
"                <a class=\"nav-link\" href=\"Admin.html\">Admin</a>\n" +
"              </li>\n" +
"            </ul>\n" +
"          </div>\n" +
"        </div>\n" +
"      </nav>\n" +
"      <a><center><h3>Avilable Flight</h3></center></a>\n" +
"      <br>\n" +
"      <table class=\"table\">\n" +
"        <thead>\n" +
"          <tr>\n" +
"            <th scope=\"col\">ID</th>\n" +
"            <th scope=\"col\"> FLIGHT_NAME</th>\n" +
"            <th scope=\"col\">ARRIVAL</th>\n" +
"            <th scope=\"col\">DEPARTURE</th>\n" +
"            <th scope=\"col\">BOARDING</th>\n" +
"            <th scope=\"col\">DESTINATION</th>\n" +
             "<th scope=\"col\">Book</th>\n" +
"          </tr>");
              
                while(rs.next())
                {
                      
                      out.println("<tr>");
                       out.println("<td>"+rs.getString("Id")+"</td>");
                        out.println("<td>"+rs.getString("Flight_name")+"</td>");
                        out.println("<td>"+rs.getString("Arrival")+"</td>");
                        out.println("<td>"+rs.getString("Departure")+"</td>");
                        out.println("<td>"+rs.getString("Boarding")+"</td>");
                        out.println("<td>"+rs.getString("Destination")+"</td>");
                       out.println("<td>"+"<a href=Booking.jsp?id="+rs.getString("Id")+">Book</a>"+"</td>");
                        out.println("<tr>");
                }
                out.println(" </tr>\n" +
"        </thead>\n" +
"      </table>\n" +
"     \n" +
"    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\n" +
"  </body>\n" +
"</html>");
         }
      catch(ClassNotFoundException ex){
             
         
      }catch(Exception e)
    {
        throw new ServletException("Login failed,e");}
         
    }
}

