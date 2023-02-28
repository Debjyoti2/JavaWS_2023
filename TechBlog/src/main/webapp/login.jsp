<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="com.helper.Message" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link  rel="stylesheet" href="library/externalDependency/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="library/externalDependency/jQuery/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="library/externalDependency/bootstrap/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="library/externalDependency/sweetalert/sweetalert.min.js"></script>

<link rel="stylesheet" href="css/login.css">


<title>Insert title here</title>
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>


<div class="form-signin w-100 m-auto" >
  <form action="loginUser" method="POST" id="login-form">
  
    <img class="mb-4" src="images/ethereum-eth.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">Please Log In</h1>
    
     <%
     Message m = (Message) session.getAttribute("MSG");
     if(m!=null){
    	 
     %>
     
     <div class="alert <%=m.getCssClass()%>" role="alert">
		 <%=m.getContent() %>
	 </div> 
    	 
    <%	 
    
     session.removeAttribute("MSG");
    	 
     }
     
     %>
    
    
       

    <div class="form-floating">
      <input type="email" class="form-control" id="floatingInput" name="email" placeholder="name@example.com">
      <label for="floatingInput">Email address</label>
    </div>
    <div class="form-floating">
      <input type="password" class="form-control" id="floatingPassword" name="password" placeholder="Password">
      <label for="floatingPassword">Password</label>
    </div>

    <button class="w-100 btn btn-lg btn-primary" type="submit">Log In</button>
  </form>
</div>
</body>
</html>