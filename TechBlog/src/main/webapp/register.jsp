<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link  rel="stylesheet" href="library/externalDependency/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="library/externalDependency/jQuery/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="library/externalDependency/bootstrap/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<link rel="stylesheet" href="css/register.css">
<script type="text/javascript" src="js/register.js"></script>
<script type="text/javascript" src="library/externalDependency/sweetalert/sweetalert.min.js"></script>

</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>

<div class="form-signin w-40 m-auto" style="width: 30%;padding: 2%;" >
  <form action="registerUser" method="POST" id="register">
    <img class="mb-4" src="images/ethereum-eth.svg" alt="" width="72" height="57">
    <h1 class="h3 mb-3 fw-normal">Please Sign In</h1>
	
	<div class="form-floating">
      <input  type="text" class="form-control marginBottom" id="userName" name="userName" placeholder="Username"  >
      <label for="userName">User Name</label>
    </div>
    
    <div class="form-floating">
      <input type="email" class="form-control marginBottom" id="email" name="email" placeholder="name@example.com">
      <label for="email">Email address</label>
    </div>
    
    <div class="form-floating">
      <input type="password" class="form-control marginBottom" id="password" name="password" placeholder="Password">
      <label for="password">Password</label>
    </div>
    
    <div class="form-check form-check-inline marginBottom">
	  <input class="form-check-input" type="radio" name="gender" id="male" value="Male">
	  <label class="form-check-label" for="male">Male</label>
	</div>
	
	<div class="form-check form-check-inline marginBottom">
	  <input class="form-check-input" type="radio" name="gender" id="female" value="Female">
	  <label class="form-check-label" for="female">Female</label>
	</div>

    <div class="checkbox mb-3">
      <label>
        <input type="checkbox" value="rememberChecked" name="remember"> Terms and Conditions
      </label>
    </div>
    <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
  </form>
</div>







</body>
</html>