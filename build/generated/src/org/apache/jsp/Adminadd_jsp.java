package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class Adminadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <title>Bootstrap demo</title>\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">\n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    .box\n");
      out.write("    {\n");
      out.write("        width: 50%;\n");
      out.write("    \n");
      out.write("        border-radius: 60px;\n");
      out.write("        padding:30px;\n");
      out.write("        margin-left:25%;\n");
      out.write("        margin-top: 70px;\n");
      out.write("        background-color: rgba(245, 245, 163, 0.984);\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    .box.row input\n");
      out.write("    {\n");
      out.write("      \n");
      out.write("    }\n");
      out.write("    body{\n");
      out.write("        background-color: rgba(255, 255, 255, 0.881);\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("      \n");
      out.write("    <div class=\"box\">\n");
      out.write("        <h1><center>Add Flight</center></h1>\n");
      out.write("        <form method=\"post\" action=\"inse\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"ID\" name=\"n\" >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Flight name\" name=\"n1\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Arrival\" name=\"n2\" >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Departure\" name=\"n3\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Boarding\" name=\"n4\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col\">\n");
      out.write("          <input type=\"text\" class=\"form-control\" placeholder=\"Destination\" name=\"n5\" >\n");
      out.write("        </div>\n");
      out.write("        <br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <input type=\"Submit\" value=\"submit\">\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <br><br>\n");
      out.write("    <h2><center>Delete Flights</center></h2>\n");
      out.write("    <table class=\"table\">\n");
      out.write("        <thead>\n");
      out.write("          <tr>\n");
      out.write("            <th scope=\"col\">ID</th>\n");
      out.write("            <th scope=\"col\">Flight Name</th>\n");
      out.write("            <th scope=\"col\">Arrival</th>\n");
      out.write("            <th scope=\"col\">Departure</th>\n");
      out.write("            <th scope=\"col\">Boarding</th>\n");
      out.write("            <th scope=\"col\">Destination</th>\n");
      out.write("            <th scope=\"col\">Delete</th>\n");
      out.write("          </tr>\n");
      out.write("        </thead>\n");
      out.write("        <tbody>\n");
      out.write("        ");

                 Connection con;
                 PreparedStatement pst;
                 ResultSet rs;
    
                 Class.forName("oracle.jdbc.driver.OracleDriver");
                 con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
                 String id=request.getParameter("id");
                 pst=con.prepareStatement("Select * from flight3");
                 
                 rs=pst.executeQuery();
                 
                
                while(rs.next())
                {

            
      out.write("\n");
      out.write("            \n");
      out.write("                <tr>\n");
      out.write("                    <th scope=\"row\">");
      out.print( rs.getString("ID") );
      out.write("</th>\n");
      out.write("                    <th scope=\"row\">");
      out.print( rs.getString("Flight_name") );
      out.write("</th>\n");
      out.write("                    <th scope=\"row\">");
      out.print( rs.getString("ARRIVAL") );
      out.write("</th>\n");
      out.write("                    <th scope=\"row\">");
      out.print( rs.getString("DEPARTURE") );
      out.write("</th>\n");
      out.write("                    <th scope=\"row\">");
      out.print( rs.getString("BOARDING") );
      out.write("</th>\n");
      out.write("                    <th scope=\"row\">");
      out.print( rs.getString("DESTINATION") );
      out.write("</th>\n");
      out.write("                    <th scope=\"row\"><a href=\"delete.jsp?id=");
      out.print( rs.getString("ID"));
      out.write("\">Delete</a>\n");
      out.write("                </tr>\n");
      out.write("                ");
 } 
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("    </table>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz\" crossorigin=\"anonymous\"></script>\n");
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
