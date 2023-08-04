<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<!DOCTYPE html>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
  </head>
  <style>
    .box
    {
        width: 50%;
    
        border-radius: 60px;
        padding:30px;
        margin-left:25%;
        margin-top: 70px;
        background-color: rgba(245, 245, 163, 0.984);
        
    }
    .box.row input
    {
      
    }
    body{
        background-color: rgba(255, 255, 255, 0.881);
    }
  </style>
  <body>
      
    <div class="box">
        <h1><center>Add Flight</center></h1>
        <form method="post" action="inse">
    <div class="row">
        <div class="col">
          <input type="text" class="form-control" placeholder="ID" name="n" >
        </div>
        <div class="col">
          <input type="text" class="form-control" placeholder="Flight name" name="n1">
        </div>
        </div>
        <br>
      <div class="row">
        <div class="col">
          <input type="text" class="form-control" placeholder="Arrival" name="n2" >
        </div>
        <div class="col">
          <input type="text" class="form-control" placeholder="Departure" name="n3">
        </div>
        </div>
        <br>
      <div class="row">
        <div class="col">
          <input type="text" class="form-control" placeholder="Boarding" name="n4">
        </div>
        <div class="col">
          <input type="text" class="form-control" placeholder="Destination" name="n5" >
        </div>
        <br><br>
        <div class="row">
        <input type="Submit" value="submit">
      </div>
      </div>
        </form>
    </div>
    <br><br>
    <h2><center>Delete Flights</center></h2>
    <table class="table">
        <thead>
          <tr>
            <th scope="col">ID</th>
            <th scope="col">Flight Name</th>
            <th scope="col">Arrival</th>
            <th scope="col">Departure</th>
            <th scope="col">Boarding</th>
            <th scope="col">Destination</th>
            <th scope="col">Delete</th>
          </tr>
        </thead>
        <tbody>
        <%
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

            %>
            
                <tr>
                    <th scope="row"><%= rs.getString("ID") %></th>
                    <th scope="row"><%= rs.getString("Flight_name") %></th>
                    <th scope="row"><%= rs.getString("ARRIVAL") %></th>
                    <th scope="row"><%= rs.getString("DEPARTURE") %></th>
                    <th scope="row"><%= rs.getString("BOARDING") %></th>
                    <th scope="row"><%= rs.getString("DESTINATION") %></th>
                    <th scope="row"><a href="delete.jsp?id=<%= rs.getString("ID")%>">Delete</a>
                </tr>
                <% } %>
            </tbody>
    </table>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
  </body>
</html>