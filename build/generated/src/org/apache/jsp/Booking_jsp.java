package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.*;

public final class Booking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Bootstrap demo</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp\" crossorigin=\"anonymous\">\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    body\n");
      out.write("    {\n");
      out.write("        background-image: url('hd-wallpaper-g2af97d7d1_1920.jpg');\n");
      out.write("        background-size: cover;\n");
      out.write("    }\n");
      out.write("    .bigbox\n");
      out.write("    {\n");
      out.write("        border: 2px solid black;\n");
      out.write("        width: 40%;\n");
      out.write("        height: 25%;\n");
      out.write("        position: absolute;\n");
      out.write("        left: 30%;\n");
      out.write("        top: 20%;\n");
      out.write("        background-color: rgba(0, 0,0, 0.5);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .innerbox\n");
      out.write("    {\n");
      out.write("        \n");
      out.write("        font-family: serif;\n");
      out.write("        background-color: rgba(0, 0,0, 0.5);\n");
      out.write("        background-color: rgb(191, 179, 4);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("   label\n");
      out.write("   {\n");
      out.write("     margin-top: 10px;\n");
      out.write("     margin-left: 1%;\n");
      out.write("     color: rgb(239, 235, 9);\n");
      out.write("   }\n");
      out.write("   input\n");
      out.write("   {\n");
      out.write("    background-color: rgb(186, 210, 196);\n");
      out.write("   }\n");
      out.write("   .id\n");
      out.write("   {\n");
      out.write("    margin-left: 6%;\n");
      out.write("   }\n");
      out.write("   .Outerbox\n");
      out.write("   {\n");
      out.write("    border: 2px solid rgb(6, 17, 134);\n");
      out.write("    position: absolute;\n");
      out.write("    top:50%;\n");
      out.write("    left:30%;\n");
      out.write("    width:40%;\n");
      out.write("    background-color: rgba(0, 0,0, 0.5);\n");
      out.write("    height: 48%;\n");
      out.write("    \n");
      out.write("   }\n");
      out.write("   .innerbox1\n");
      out.write("   {\n");
      out.write("    \n");
      out.write("    background-color: rgb(191, 179, 4);\n");
      out.write("   }\n");
      out.write("   .card\n");
      out.write("   {\n");
      out.write("    border-radius: 10px;\n");
      out.write("    width:85%;\n");
      out.write("    margin-left: 20px;\n");
      out.write("   }\n");
      out.write("   .cv\n");
      out.write("   {\n");
      out.write("    margin-left: 5%;\n");
      out.write("   }\n");
      out.write("   .sel\n");
      out.write("   {\n");
      out.write("    margin-left:5%;\n");
      out.write("   }\n");
      out.write("   .sub{\n");
      out.write("    margin-left: 5%;\n");
      out.write("    margin-top: 5%;\n");
      out.write("   background-color: rgb(16, 245, 16);\n");
      out.write("   width:90%\n");
      out.write("   }\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("     <h1 style=\"color: aliceblue\"><center>Flight Ticket Booking</center></h1>\n");
      out.write("     <form  method=\"get\" action=\"bookingdone\">\n");
      out.write("     <div class=\"bigbox\">\n");
      out.write("        <div class=\"innerbox\">\n");
      out.write("            <center><h3>Your Booking</h3></center>\n");
      out.write("        </div>\n");
      out.write("          ");

                 Connection con;
                 PreparedStatement pst;
                 ResultSet rs;
    
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
                 String id=request.getParameter("id");
                 pst=con.prepareStatement("Select * from flight3 where ID=?");
                 pst.setString(1,id);
                 rs=pst.executeQuery();
                 
                
                while(rs.next())
                {

            
      out.write("\n");
      out.write("        <div class=\"inse\">\n");
      out.write("          <label class=\"id\">ID:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("          <input type=\"text\" value=\"");
      out.print( rs.getString("ID") );
      out.write("\" name=\"n\">\n");
      out.write("          <label>Flight Name:</label>&nbsp;&nbsp;\n");
      out.write("          <input type=\"text\" value=\"");
      out.print( rs.getString("Flight_name") );
      out.write("\" name=\"n1\">\n");
      out.write("          <br>\n");
      out.write("          <label>Arrival:</label>&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("          <label><input type=\"text\" value=\"");
      out.print( rs.getString("ARRIVAL") );
      out.write("\" name=\"n2\"></label>\n");
      out.write("          <label>Departure:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("          <input type=\"text\" value=\"");
      out.print( rs.getString("DEPARTURE") );
      out.write("\" name=\"n3\">\n");
      out.write("          <label>Boarding:</label>\n");
      out.write("          <label><input type=\"text\" value=\"");
      out.print( rs.getString("BOARDING") );
      out.write("\" name=\"n4\"></label>\n");
      out.write("          <label>Destination:</label>&nbsp;&nbsp;&nbsp;\n");
      out.write("          <input type=\"text\" value=\"");
      out.print( rs.getString("DESTINATION") );
      out.write("\" name=\"n5\">\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
      out.write("\n");
      out.write("     </div>\n");
      out.write("     <div class=\"Outerbox\">\n");
      out.write("          <div class=\"innerbox1\">\n");
      out.write("            Credit & Debit card\n");
      out.write("          </div>\n");
      out.write("          <label class=\"cari\">Cardholder Name</label><br>\n");
      out.write("          <input class=\"card\" type=\"text\" value=\"\" name=\"n6\">\n");
      out.write("          <label class=\"cari\">Card Number</label><br>\n");
      out.write("          <input class=\"card\" type=\"text\" value=\"\" name=\"n7\">\n");
      out.write("          <label class=\"cari\">End Date</label><br>\n");
      out.write("          \n");
      out.write("          <select class=\"sel\" name=\"n8\" id=\"\">\n");
      out.write("            <option selected>mm</option>\n");
      out.write("            <option value=\"1\">january</option>\n");
      out.write("            <option value=\"2\">February</option>\n");
      out.write("            <option value=\"3\">March</option>\n");
      out.write("          </select>\n");
      out.write("          <select name=\"n9\" id=\"\">\n");
      out.write("            <option selected>yyy</option>\n");
      out.write("            <option value=\"1\">2032</option>\n");
      out.write("            <option value=\"2\">2034</option>\n");
      out.write("            <option value=\"3\">2035</option>\n");
      out.write("          </select><br>\n");
      out.write("          <label class=\"cari\">CVV</label><br>\n");
      out.write("          <input class=\"cv\" type=\"text\" value=\"\" name=\"n11\"><br>\n");
      out.write("          <input class=\"sub\" type=\"Submit\" value=\"PAY\">\n");
      out.write("          \n");
      out.write("          \n");
      out.write("     </div>\n");
      out.write("     </form>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N\" crossorigin=\"anonymous\"></script>\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
