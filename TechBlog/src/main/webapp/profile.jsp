<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@page import="com.vo.User" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<link  rel="stylesheet" href="library/externalDependency/bootstrap/css/bootstrap.min.css" >
<script type="text/javascript" src="library/externalDependency/jQuery/jquery-3.6.3.min.js"></script>
<script type="text/javascript" src="library/externalDependency/bootstrap/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script type="text/javascript" src="library/externalDependency/sweetalert/sweetalert.min.js"></script>


<body>

<jsp:include page="menu.jsp"></jsp:include>


<%
User user= (User) session.getAttribute("USER");


%>
 
 Name ::  <%= user.getUserName() %>



</body>
</html>