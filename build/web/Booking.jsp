<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
  </head>
  <style>
    body
    {
        background-color: #9fa8a3;
        background-size: cover;
    }
    .bigbox
    {
        border: 2px solid black;
        width: 40%;
        height: 25%;
        position: absolute;
        left: 30%;
        top: 20%;
        background-color: rgba(0, 0,0, 0.5);
        
    }
    .innerbox
    {
        
        font-family: serif;
      
        background-color: #fae596;
        
    }
   label
   {
     margin-top: 10px;
     margin-left: 1%;
     color: rgb(239, 235, 9);
   }
   input
   {
    background-color: rgb(186, 210, 196);
   }
   .id
   {
    margin-left: 6%;
   }
   .Outerbox
   {
    border: 2px solid rgb(6, 17, 134);
    position: absolute;
    top:50%;
    left:30%;
    width:40%;
    background-color: rgba(0, 0,0, 0.5);
    height: 48%;
    
   }
   .innerbox1
   {
    
    background-color: #fae596;
   }
   .card
   {
    border-radius: 10px;
    width:85%;
    margin-left: 20px;
   }
   .cv
   {
    margin-left: 5%;
   }
   .sel
   {
    margin-left:5%;
   }
   .sub{
    margin-left: 5%;
    margin-top: 5%;
   background-color: rgb(16, 245, 16);
   width:90%
   }
  </style>
  <body>
       <nav class="navbar navbar-expand-lg bg-dark navbar-dark">

    <div class="container-fluid">

      <a class="navbar-brand" href="#">Flight Booking</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link" href="#">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About us</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Admin.html">Admin</a>
          </li>
        </ul>

      </div>
    </div>
  </nav>
     <h1 style="color:#100328"><center>Flight Ticket Booking</center></h1>
     <form  method="Get" action="bookingdone">
     <div class="bigbox">
        <div class="innerbox">
            <center><h3>Your Booking</h3></center>
        </div>
          <%
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

            %>
        <div class="inse">
          <label class="id">ID:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="text" value="<%= rs.getString("ID") %>" name="n">
          <label>Flight Name:</label>&nbsp;&nbsp;
          <input type="text" value="<%= rs.getString("Flight_name") %>" name="n1">
          <br>
          <label>Arrival:</label>&nbsp;&nbsp;&nbsp;&nbsp;
          <label><input type="text" value="<%= rs.getString("ARRIVAL") %>" name="n2"></label>
          <label>Departure:</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <input type="text" value="<%= rs.getString("DEPARTURE") %>" name="n3">
          <label>Boarding:</label>
          <label><input type="text" value="<%= rs.getString("BOARDING") %>" name="n4"></label>
          <label>Destination:</label>&nbsp;&nbsp;&nbsp;
          <input type="text" value="<%= rs.getString("DESTINATION") %>" name="n5">
        </div>
        <% } %>
     </div>
     <div class="Outerbox">
          <div class="innerbox1">
            Credit & Debit card
          </div>
          <label class="cari">Cardholder Name</label><br>
          <input class="card" type="text" value="" name="n6">
          <label class="cari">Card Number</label><br>
          <input class="card" type="text" value="" name="n7">
          <label class="cari">End Date</label><br>
          
          <select class="sel" name="n8" id="">
            <option selected>mm</option>
            <option value="1">january</option>
            <option value="2">February</option>
            <option value="3">March</option>
          </select>
          <select name="n9" id="">
            <option selected>yyy</option>
            <option value="1">2032</option>
            <option value="2">2034</option>
            <option value="3">2035</option>
          </select><br>
          <label class="cari">CVV</label><br>
          <input class="cv" type="text" value="" name="n10"><br>
          <input class="sub" type="Submit" value="PAY">
          
          
     </div>
     </form>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
  </body>
</html>