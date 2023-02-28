<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<%@page import="com.vo.User" %>
<head>
<link  rel="stylesheet" href="library/externalDependency/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="library/externalDependency/jQuery/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="library/externalDependency/bootstrap/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="library/externalDependency/sweetalert/sweetalert.min.js"></script>

<script type="text/javascript" src="js/menu.js"></script>
<link rel="stylesheet" href="css/menu.css">
</head>
<nav class="navbar navbar-expand-lg bg-body-tertiary navbar-light menubgClass">
  <div class="container-fluid">
    <a class="navbar-brand whiteText" href="#"><span class="fa fa-asterisk"></span>&nbspTech Blog</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a href="index.jsp" class="nav-link active whiteText" aria-current="page" href="#"><span class="fa fa-bell-o"></span>&nbspHome</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle whiteText" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            <span class="fa fa-book">&nbspCategories</span>
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="#">Programming Language</a></li>
            <li><a class="dropdown-item" href="#">Project Implementation</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item"  href="#">Data Structure</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link whiteText"><span class="fa fa-commenting-o">&nbspContact</span></a>
        </li>
      </ul>
      <form class="d-flex" role="search">
		
	<% User user =(User) session.getAttribute("USER");
	
	 if(user!=null){
		 
		 %>
		
   
   	
	<span class="fa fa-user-circle-o text-white"  data-bs-toggle="modal" data-bs-target="#profileModal">&nbsp&nbsp<%=user.getUserName() %></span>
	&nbsp&nbsp&nbsp&nbsp&nbsp
	<a href="logoutServlet" class="fa fa-sign-out text-white" ></a>
	
	
	<div class="modal fade" id="profileModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header bg-primary text-white">
        <h1 class="modal-title fs-5" id="exampleModalLabel">Hi <%=user.getUserName() %></h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
        <div class="container">
         
         <img style="height: 120px;width: 120px;border-radius: 140px;MARGIN-LEFT: 35%;"  
              alt="default.png" src="images/<%= user.getProfilePhoto()%>">
        
         <div>User Name : <%=user.getUserName() %></div>
         <div>User Id : <%=user.getUserId() %></div>
          <div>User Email : <%=user.getEmail() %></div>
          <div>User Gender : <%=user.getGender() %></div>
           <div>Reg Date : <%=user.getRegDate() %></div>
        
        </div>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
        <a href="editProfile.jsp" type="button" class="btn btn-primary">Edit Details</a>
      </div>
    </div>
  </div>
</div>


		 
	<%	 
		 
	 }
	  
	 %>	
	 


      </form>
    </div>
  </div>
</nav>

