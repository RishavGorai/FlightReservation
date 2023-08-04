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
import java.sql.Statement;
import javax.servlet.*;
import javax.servlet.http.*;



public class bookingdone extends HttpServlet 
{
  public void doGet(HttpServletRequest req,
          HttpServletResponse res)throws IOException,ServletException
  {
      res.setContentType("text/html");
      PrintWriter pw1=res.getWriter();
      String n1=req.getParameter("n");
      String n2=req.getParameter("n1");
      String n3=req.getParameter("n2");
      String n4=req.getParameter("n3");
      String n5=req.getParameter("n4");
      String n6=req.getParameter("n5"); 
      String n7=req.getParameter("n6");
      String n8=req.getParameter("n7");
      String n9=req.getParameter("n8");
      String n10=req.getParameter("n9");
      String n11=req.getParameter("n10");
   
    
     
     
       try
         {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             
             Connection con =DriverManager.getConnection
                 ("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
              Statement stmt=con.createStatement();
              String q1="insert into bookingf values('"+n1+"','"+n2+"','"+n3+"','"+n4+"','"+n5+"','"+n6+"','"+n7+"','"+n8+"','"+n9+"','"+n10+"','"+n11+"')";
              
              int rs=stmt.executeUpdate(q1);
              if(rs>0)
              {
                  pw1.println("<!DOCTYPE html>\n" +
"<html>\n" +
"<head>\n" +
"  <head>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"    <title>Bootstrap demo</title>\n" +
"    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n" +
"      integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\n" +
"      <meta charset=\"UTF-8\">\n" +
"      <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"      <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"      <title>Responsive Footer - Sagar Developer</title>\n" +
"      <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\n" +
"      <link href=\"http://fonts.googleapis.com/css?family=Cookie\" rel=\"stylesheet\" type=\"text/css\">\n" +
"      <link rel=\"stylesheet\" href=\"style.css\">\n" +
"  </head>\n" +
"</head>\n" +
"    <title>Flight Ticket Generator</title>\n" +
"    <style>\n" +
"        body {\n" +
"            font-family: Arial, sans-serif;\n" +
"        }\n" +
"\n" +
"        .ticket {\n" +
"            margin: 100px auto;\n" +
"            width: 400px;\n" +
"            border: 1px solid #ccc;\n" +
"            padding: 20px;\n" +
"            border-radius: 10px;\n" +
"        }\n" +
"\n" +
"        h2 {\n" +
"            text-align: center;\n" +
"        }\n" +
"\n" +
"        .ticket-info {\n" +
"            margin-bottom: 20px;\n" +
"        }\n" +
"\n" +
"        .ticket-info label {\n" +
"            font-weight: bold;\n" +
"        }\n" +
"    </style>\n" +
"\n" +
"<body>\n" +
"  <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark\">\n" +
"\n" +
"    <div class=\"container-fluid\">\n" +
"\n" +
"      <a class=\"navbar-brand\" href=\"#\">Flight Booking</a>\n" +
"      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\"\n" +
"        aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n" +
"        <span class=\"navbar-toggler-icon\"></span>\n" +
"      </button>\n" +
"      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n" +
"        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n" +
"          <li class=\"nav-item\">\n" +
"            <a class=\"nav-link\" href=\"#\">Home</a>\n" +
"          </li>\n" +
"          <li class=\"nav-item\">\n" +
"            <a class=\"nav-link\" href=\"#\">About us</a>\n" +
"          </li>\n" +
"          <li class=\"nav-item\">\n" +
"            <a class=\"nav-link\" href=\"Admin.html\">Admin</a>\n" +
"          </li>\n" +
"        </ul>\n" +
"\n" +
"      </div>\n" +
"    </div>\n" +
"  </nav>\n" +
"    <div class=\"ticket\">\n" +
"        <h2>Flight Ticket</h2>\n" +
"        <div class=\"ticket-info\">\n" +
"            <label>Passenger Name:&nbsp;&nbsp;&nbsp;&nbsp"+n7+"</label>\n" +
"            <span ></span>\n" +
"        </div>\n" +
"        <div class=\"ticket-info\">\n" +
"            <label>Flight Number:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+n1+"</label>\n" +
"            <span ></span>\n" +
"        </div>\n" +
"        <div class=\"ticket-info\">\n" +
"          <label>Flight Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+n2+"</label>\n" +
"          <span ></span>\n" +
"      </div>\n" +
"\n" +
"        <div class=\"ticket-info\">\n" +
"            <label>Arrival:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+n3+"</label>\n" +
"            <span ></span>\n" +
"        </div>\n" +
"        <div class=\"ticket-info\">\n" +
"            <label>Departure:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+n4+"</label>\n" +
"            <span ></span>\n" +
"        </div>\n" +
"        <div class=\"ticket-info\">\n" +
"            <label>Boarding:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+n5+"</label>\n" +
"            <span ></span>\n" +
"        </div>\n" +
"        <div class=\"ticket-info\">\n" +
"            <label>Destination:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp"+n6+"</label>\n" +
"            <span ></span>\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    \n" +
"</body>\n" +
"</html>");

              }
              else
              {
                  pw1.println("Insert unsuccess");
              }
              con.close();
         }
    catch(Exception e)
    {
        pw1.println(e);



     // pw1.println("<html><body bgcolor=red><center><Email ID "+na+"<br> Name="+nm+"<br>Address="+nc+"<br>Gender="+nd+"<br>Hobbies="+nj+"<br></center> </body></html>");//response from servlet
      
  }
}
}