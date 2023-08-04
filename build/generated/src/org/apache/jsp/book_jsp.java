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

public final class book_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Booking</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("         body{\n");
      out.write("            background-image: url('pexels-christian-heitz-842711.jpg');\n");
      out.write("            background-size: cover;\n");
      out.write("         }\n");
      out.write("        .register{\n");
      out.write("            border:2px solid black;\n");
      out.write("            width:30%;\n");
      out.write("            height:40%;\n");
      out.write("            margin-left: 35%;\n");
      out.write("            margin-top: 12%;\n");
      out.write("            background-color: rgba(0, 0,0, 0.5);\n");
      out.write("            border-radius: 10px;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        h2{\n");
      out.write("            text-align: center;\n");
      out.write("            color: rgb(255, 255, 255);\n");
      out.write("        }\n");
      out.write("        label{\n");
      out.write("            padding-left: 20px;\n");
      out.write("            color: rgb(237, 239, 242);\n");
      out.write("            font-weight:600;\n");
      out.write("            font-family: sans-serif;\n");
      out.write("            font-style: italic;\n");
      out.write("        }\n");
      out.write("        input{\n");
      out.write("            margin-left: 10%;\n");
      out.write("        }\n");
      out.write("        select{\n");
      out.write("            margin-left:10% ;\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("          <div class=\"main\">\n");
      out.write("           <div class=\"register\">\n");
      out.write("             <h1>Booking </h1>\n");
      out.write("          <form  method=\"POST\" action=\"\">\n");
      out.write("              ");

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
      out.write("              <label>Id:</label>\n");
      out.write("              <input type=\"Text\" value=\"");
      out.print( rs.getString("ID") );
      out.write("\" name=\"n\" >\n");
      out.write("              <br><br>\n");
      out.write("              <label>FlightName:</label>\n");
      out.write("              <input type=\"Text\"  value=\"");
      out.print( rs.getString("Flight_name") );
      out.write("\" name=\"n1\">\n");
      out.write("              <br><br>\n");
      out.write("            <label>Check In:</label>\n");
      out.write("            <input type=\"text\" value=\"");
      out.print( rs.getString("ARRIVAL") );
      out.write("\" name=\"n2\">\n");
      out.write("            <br><br>\n");
      out.write("             <label>Check Out:</label>\n");
      out.write("             <input type=\"text\" value=\"");
      out.print( rs.getString("DEPARTURE") );
      out.write("\" name=\"n3\">\n");
      out.write("             <br><br>\n");
      out.write("             <label>boarding:</label>\n");
      out.write("             <input type=\"text\" value=\"");
      out.print( rs.getString("BOARDING") );
      out.write("\" name=\"n4\">\n");
      out.write("             <br><br>\n");
      out.write("             <label>destination:</label>\n");
      out.write("             <input type=\"text\" value=\"");
      out.print( rs.getString("DESTINATION") );
      out.write("\" name=\"n5\">\n");
      out.write("             <br><br>\n");
      out.write("             ");
 } 
      out.write("\n");
      out.write("            \n");
      out.write("   <br><br>\n");
      out.write("             \n");
      out.write("             <input type=\"Submit\" value=\"submit\">\n");
      out.write("          </form>\n");
      out.write("           </div>\n");
      out.write("          </div>\n");
      out.write("    </body>\n");
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
