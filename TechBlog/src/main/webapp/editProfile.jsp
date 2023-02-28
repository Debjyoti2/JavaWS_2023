<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.vo.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link  rel="stylesheet" href="library/externalDependency/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="library/externalDependency/jQuery/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="library/externalDependency/bootstrap/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<script type="text/javascript" src="library/externalDependency/sweetalert/sweetalert.min.js"></script>
<style>
.marginBottom{
	margin-bottom: 5%;
}
</style>

</head>
<body>

<% 


User user= (User) session.getAttribute("USER");


%>
<div class="form-signin w-40 m-auto" style="width: 30%;padding: 2%;" >

  <form action="editProfileServlet" method="POST" id="register" enctype="multipart/form-data">
    <img class="mb-4" src="images/ethereum-eth.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">Edit Profile Details:</h1>
	
	<div class="form-floating" style="display:none;" >
      <input  type="text" class="form-control marginBottom" id="userId" name="userId" placeholder="Userid" value="<%=user.getUserId()%>" >
      <label for="userid">User Id</label>
    </div>
	
	<div class="form-floating">
      <input  type="text" class="form-control marginBottom" id="userName" name="userName" placeholder="Username" value="<%=user.getUserName() %>" >
      <label for="userName">User Name</label>
    </div>
    
    <div class="form-floating">
      <input type="email" class="form-control marginBottom" id="email" name="email" placeholder="name@example.com" value=" <%=user.getEmail()%> ">
      <label for="email">Email address</label>
    </div>
    
    <div class="form-floating">
      <input type="password" class="form-control marginBottom" id="password" name="password" placeholder="Password" value="<%=user.getPassword()%>">
      <label for="password">Password</label>
    </div>
    
     <div class="mb-3">
	     <label for="formFile" class="form-label">Upload/Change Profile Pics</label>
	     <input class="form-control" type="file" id="formFile" name="profilePic">
	  </div>
    
    <button class="w-100 btn btn-lg btn-primary" type="submit">Save</button>
  </form>
</div>



</body>
</html>