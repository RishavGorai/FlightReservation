

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>

<html>
    <title>
        Delete Data
    </title>
    <body>
        <div class="box">
            <h1><center>UPDATE</center></h1><br>
            <%
                 String id=request.getParameter("id");
         try
         {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             
             Connection con =DriverManager.getConnection
                 ("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
              Statement stmt=con.createStatement();
              String q1="delete from flight3 where ID='"+id+"'";
              stmt.executeUpdate(q1);
              out.println("<h1><center>Succesfully Deleted</center></h1>");
              con.close();
         }
    catch(Exception e)
    {
        System.out.println(e);
         
    }
         %>
        </div>
    </body>
</html>