<%@page import="java.sql.Connection"%>
<%@page import="com.helper.ConnectionProvider"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">

<link  rel="stylesheet" href="library/externalDependency/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="library/externalDependency/jQuery/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="library/externalDependency/bootstrap/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">


<link rel="stylesheet" href="css/index.css">
<script type="text/javascript" src="js/index.js"></script>


<title>Insert title here</title>
</head>


<body>
<jsp:include page="menu.jsp"></jsp:include>

<div class="container-fluid clippath">
<div class="container">

<div class="p-2 mb-4 bg-light rounded-3">
      <div class="container-fluid py-5">
        <h3 class="display-5 fw-bold">Welcome to TechBlog !!</h3>
        <p class="col-md-12 fs-8">Computer programming is the process of performing a particular computation (or more generally, accomplishing a specific computing result), usually by designing and building an executable computer program. Programming involves tasks such as analysis, generating algorithms, profiling algorithms' accuracy and resource consumption, and the implementation of algorithms (usually in a chosen programming language, commonly referred to as coding).</p>
        <button type="button" class="btn btn-outline-primary"><span class="fa fa-user-plus"></span>&nbspStart! Its Free</button>
        <a href="login.jsp" type="button" class="btn btn-outline-primary"><span class="fa fa-user-o fa-spin"></span>&nbspLogin</a>
         <a href="register.jsp" type="button" class="btn btn-outline-primary"><span class="fa fa-user-o fa-spin"></span>&nbspRegister</a>
      </div>
</div>

</div>
</div>


<div class="container">
 <div class="row">
  <div class="col-md-4">
   <div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Card title</h5>
	    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
	    <a href="#" class="btn btn-primary">Go somewhere</a>
	  </div>
   </div>
  </div>
  
   <div class="col-md-4">
   <div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Card title</h5>
	    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
	    <a href="#" class="btn btn-primary">Go somewhere</a>
	  </div>
   </div>
  </div>
  
   <div class="col-md-4">
   <div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Card title</h5>
	    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
	    <a href="#" class="btn btn-primary">Go somewhere</a>
	  </div>
   </div>
  </div>
 </div>
 
 <br>
 
 <div class="row">
  <div class="col-md-4">
   <div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Card title</h5>
	    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
	    <a href="#" class="btn btn-primary">Go somewhere</a>
	  </div>
   </div>
  </div>
  
   <div class="col-md-4">
   <div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Card title</h5>
	    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
	    <a href="#" class="btn btn-primary">Go somewhere</a>
	  </div>
   </div>
  </div>
  
   <div class="col-md-4">
   <div class="card" style="width: 18rem;">
	  <div class="card-body">
	    <h5 class="card-title">Card title</h5>
	    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
	    <a href="#" class="btn btn-primary">Go somewhere</a>
	  </div>
   </div>
  </div>
 </div>

</div>



</body>
</html>