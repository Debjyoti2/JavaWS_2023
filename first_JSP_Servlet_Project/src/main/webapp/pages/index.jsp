<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    

<%@page import="java.util.Random" %>  

<%@page errorPage="errorpage.jsp" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%--  

<%!  This is call declaration tag in JSP, we can write variable and method  %>

<%=  This is called expression tag, we can put java values which needs to be shown in browser  %>

<% This is called scriptlet tag where we can write java code %> 

--%>

<%@include 	file="header.jsp" %>

<%! 
int a =10;
int b=0;

public int doSum(){
	return a+b;
}
%> 

<h2>The Values of a is : <%=a %>. <br> The values of b is : <%=b %> <br> Sum Is : <%= doSum() %></h2>


<h2>Random Number is :: 

<%  Random r = new Random();
	int n = r.nextInt();

%>	
<%=n %>
</h2>


<%! int a1=10;
int b1 =2;
int c1=0;  %>
 
<% c1=a1/b1; %>

<h2>The division is ::: <%=c1 %></h2>

<%-- <%
response.sendRedirect("https://www.google.com");
%>
 --%>
</body>
</html>