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



public class inse extends HttpServlet 
{
  public void doPost(HttpServletRequest req,
          HttpServletResponse res)throws IOException,ServletException
  {
      res.setContentType("text/html");
      PrintWriter pw1=res.getWriter();
      String mn=req.getParameter("n");

      String nm=req.getParameter("n1");
      String na=req.getParameter("n2");
      String nb=req.getParameter("n3");
      String nc=req.getParameter("n4");
      String nd=req.getParameter("n5");      
    
     
     
       try
         {
             Class.forName("oracle.jdbc.driver.OracleDriver");
             
             Connection con =DriverManager.getConnection
                 ("jdbc:oracle:thin:@localhost:1521:XE","System","Rishav");
              Statement stmt=con.createStatement();
              String q1="insert into flight3 values('"+mn+"','"+nm+"','"+na+"','"+nb+"','"+nc+"','"+nd+"')" ;
         
              int x=stmt.executeUpdate(q1);
              if(x>0)
              {
                  pw1.println("insert succes");

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