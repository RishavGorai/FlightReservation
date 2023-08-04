<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>

<!doctype html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Bootstrap demo</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Responsive Footer - Sagar Developer</title>
    <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">
    <link href="http://fonts.googleapis.com/css?family=Cookie" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="style.css">
</head>
<style>
  .c-item {
    height: 400px;


  }

  .c-img {
    height: 100%;
  }

  .hi {
    border: 2px solid black;
    width: 20%;
    margin-left: 40%;
    margin-top: 20px;
    padding: 10px;
    border-radius: 20px;
    background-color: rgb(176, 196, 22);
  }

  input {
    background-color: rgb(63, 37, 212);
    color: aliceblue;
  }

  .partner {
    width: 20%;
    margin-left: 45%;
    margin-top: 20px;
    padding: 10px;
  }

  div.gallery {
    
    margin-left: 15%;
    border: 1px solid #ccc;
    float: left;
    width: 180px;
    
  }

  div.gallery:hover {
    border: 1px solid #777;
  }

  div.gallery img {
    width: 100%;
    height: auto;
  }

  div.desc {
    padding: 15px;
    text-align: center;
  }
  @import url('http://fonts.googleapis.com/css?family=Open+Sans:400,700');
* {
    padding: 0;
    margin: 0;
}

body {
    font-family: 'Poppins', sans-serif;
}

html {
    background-color: #eaf0f2;
}

header {
    text-align: center;
    padding-top: 100px;
    margin-bottom: 300px;
    font-size: 35px;
}

header h2 {
    color: #f0525f;
}

header span {
    color: #eaa03f;
}

/* The footer is fixed to the bottom of the page */

footer {
    position: fixed;
    bottom: 0;
}

@media (max-height:800px) {
    footer {
        position: static;
    }
    header {
        padding-top: 1px;
    }
}

.footer-distributed {
    background-color: #2d2a30;
    box-sizing: border-box;
    width: 100%;
    text-align: left;
    font: bold 16px sans-serif;
    padding: 50px 50px 60px 50px;
    margin-top: 80px;
}

.footer-distributed .footer-left, .footer-distributed .footer-center, .footer-distributed .footer-right {
    display: inline-block;
    vertical-align: top;
}

/* Footer left */

.footer-distributed .footer-left {
    width: 30%;
}

.footer-distributed h3 {
    color: #ffffff;
    font: normal 36px 'Cookie', cursive;
    margin: 0;
}


.footer-distributed h3 span {
    color: #e0ac1c;
}

/* Footer links */

.footer-distributed .footer-links {
    color: #ffffff;
    margin: 20px 0 12px;
}

.footer-distributed .footer-links a {
    display: inline-block;
    line-height: 1.8;
    text-decoration: none;
    color: inherit;
}

.footer-distributed .footer-company-name {
    color: #8f9296;
    font-size: 14px;
    font-weight: normal;
    margin: 0;
}

/* Footer Center */

.footer-distributed .footer-center {
    width: 35%;
}

.footer-distributed .footer-center i {
    background-color: #33383b;
    color: #ffffff;
    font-size: 25px;
    width: 38px;
    height: 38px;
    border-radius: 50%;
    text-align: center;
    line-height: 42px;
    margin: 10px 15px;
    vertical-align: middle;
}

.footer-distributed .footer-center i.fa-envelope {
    font-size: 17px;
    line-height: 38px;
}

.footer-distributed .footer-center p {
    display: inline-block;
    color: #ffffff;
    vertical-align: middle;
    margin: 0;
}

.footer-distributed .footer-center p span {
    display: block;
    font-weight: normal;
    font-size: 14px;
    line-height: 2;
}

.footer-distributed .footer-center p a {
    color: #e0ac1c;
    text-decoration: none;
    ;
}

/* Footer Right */

.footer-distributed .footer-right {
    width: 30%;
}

.footer-distributed .footer-company-about {
    line-height: 20px;
    color: #92999f;
    font-size: 13px;
    font-weight: normal;
    margin: 0;
}

.footer-distributed .footer-company-about span {
    display: block;
    color: #ffffff;
    font-size: 18px;
    font-weight: bold;
    margin-bottom: 20px;
}

.footer-distributed .footer-icons {
    margin-top: 25px;
}

.footer-distributed .footer-icons a {
    display: inline-block;
    width: 35px;
    height: 35px;
    cursor: pointer;
    background-color: #33383b;
    border-radius: 2px;
    font-size: 20px;
    color: #ffffff;
    text-align: center;
    line-height: 35px;
    margin-right: 3px;
    margin-bottom: 5px;
}

.footer-distributed .footer-icons a:hover {
    background-color: #3F71EA;
}

.footer-links a:hover {
    color: #3F71EA;
}

@media (max-width: 880px) {
    .footer-distributed .footer-left, .footer-distributed .footer-center, .footer-distributed .footer-right {
        display: block;
        width: 100%;
        margin-bottom: 40px;
        text-align: center;
    }
    .footer-distributed .footer-center i {
        margin-left: 0;
    }
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
  <div id="carouselExample" class="carousel slide">
    <div class="carousel-inner">
      <div class="carousel-item active c-item">
        <img src="pexels-ahmed-muntasir-912050.jpg" class="d-block w-100 c-img" alt="...">
      </div>
      <div class="carousel-item c-item">
        <img src="pexels-pixabay-163792.jpg" class="d-block w-100 c-img" alt="...">
      </div>
      <div class="carousel-item c-item">
        <img src="pexels-pascal-borener-1089306.jpg" class="d-block w-100 c-img" alt="...">
      </div>
      <div class="carousel-item c-item">
        <img src="pexels-sheila-731217.jpg" class="d-block w-100 c-img" alt="...">
      </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExample" data-bs-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExample" data-bs-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="visually-hidden">Next</span>
    </button>
  </div>
  
  <div class="hi">
    <div class="banner">
      <form method="Get" action="flibo">
        <div class="banner">
          <h3>Select The Flight</h3>
          <%
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

 %></div>
            </form>  
        </div>
        </div>
  <div class="partner">
    <h5> Partner Airlines</h5>
  </div>
  <div class="gallery">
   
      <img src="Air-India-Emblem.png" alt="Cinque Terre" width="600" height="400">
   
   
  </div>

  <div class="gallery">
    
      <img src="Emirates-Logo-700x394.png" alt="Forest" width="600" height="400">
    
  
  </div>

  <div class="gallery">
    
      <img src="IndiGo-Logo-768x483.png" alt="Northern Lights" width="600" height="400">
  </div>
  <br><br>
<footer class="footer-distributed">

    <div class="footer-left">
        <h3>RG<span>Developer</span></h3>

        <p class="footer-links">
            <a href="#">Home</a>
            |
            <a href="#">About</a>
            |
            <a href="#">Contact</a>
            |
            <a href="#">Blog</a>
        </p>

        <p class="footer-company-name">Copyright © 2021 <strong>RGDeveloper</strong> All rights reserved</p>
    </div>

    <div class="footer-center">
        <div>
            <i class="fa fa-map-marker"></i>
            <p><span>Asansol</span>
                West Bengal</p>
        </div>

        <div>
            <i class="fa fa-phone"></i>
            <p>+8116847894</p>
        </div>
        <div>
            <i class="fa fa-envelope"></i>
            <p><a href="mailto:sagar00001.co@gmail.com">reesav111@gmail.com</a></p>
        </div>
    </div>
    <div class="footer-right">
        <p class="footer-company-about">
            <span>About the company</span>
            <strong>RG Developer</strong> is a group of 2 members who design Responsive website with html and css
            and
           Designed several  Web projects
        </p>
        <div class="footer-icons">
            <a href="#"><i class="fa fa-facebook"></i></a>
            <a href="#"><i class="fa fa-instagram"></i></a>
            <a href="#"><i class="fa fa-linkedin"></i></a>
            <a href="#"><i class="fa fa-twitter"></i></a>
            <a href="#"><i class="fa fa-youtube"></i></a>
        </div>
    </div>
</footer>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
    crossorigin="anonymous"></script>
</body>

</html>