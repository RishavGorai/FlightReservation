package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <title>\n");
      out.write("        Flight\n");
      out.write("    </title>\n");
      out.write("    <style>\n");
      out.write("        .banner\n");
      out.write("        {\n");
      out.write("            margin-left:35%;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <div class =\"container\">\n");
      out.write("        <div class=\"banner\">\n");
      out.write("           <h1>Flight Book</h1>\n");
      out.write("        </div>\n");
      out.write("            <br>\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <form method=\"Get\" action=\"flibo\">\n");
      out.write("                <div class=\"banner\">\n");
      out.write("                    <h3>Select The Flight<h3>\n");
      out.write("                            \n");
      out.write(" ");

     Connection con;
     PreparedStatement pst;
     ResultSet rs;
     try
     {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
         pst=con.prepareStatement("Select distinct FLIGHT_NAME  from flight3 ");
         rs=pst.executeQuery();
         
         if(rs.next())
         {
             out.println("<tr>");
             out.println("<td>choose Airline</td>");
               out.println("<td>");
             out.println("<select name='combo'>");
         
         do
         {
             String airlinename=rs.getString("FLIGHT_NAME");
             out.println("<option value='"+ airlinename +"'>" +  airlinename +  "</option>");
         }
         while(rs.next());
         out.println("</select>");
         rs.close();
         out.println("</td></tr>");
         out.println("<tr><td colspan=2 align=center><input type=submit value=submit></td></tr>");
         }
     else
     {
       out.println("Sorry table empty");      
      }
    
     out.println("</form>");
    }
catch(Exception e)
{
  e.printStackTrace();
}

 
      out.write("\n");
      out.write(" </div>\n");
      out.write("            </form>  \n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    \n");
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
