<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
    
<!DOCTYPE html>
<html>
<head>  
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>This is index page</h1>

 <!-- JSTL core Tags -->

<c:set var="i" value="23" scope="application"></c:set>

<c:out value="${i}"></c:out> 

<hr>

<c:if test="${i==23}">Yes true i=23</c:if>


<c:forEach var="j" begin="0" end="10">
<h4> Hi Hello <c:out value="${j} "></c:out> </h4 >
</c:forEach>

<!-- JSTL core Tags -->



<!-- JSTL function tags -->

<c:set var="str" value="techsoft"></c:set>
length of str ::  <c:out value="${fn:length(str)}"></c:out>

<h2>if name var contains soft :: <c:out value="${fn:contains(str,'tech')} "></c:out></h2>



<!-- JSTL function tags -->

<!-- Jstl SQL Tags -->

<sql:setDataSource driver="oracle.jdbc.driver.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:orcl" user="sys as sysdba" password="oracle" var="ds"/>

<sql:query dataSource="${ds}" var="rs">select * from t_employee_master</sql:query>

<table>
<tr>
<td>Employee Id</td>
<td>Employee Name</td>
</tr>

<c:forEach items="${rs.rows}" var="row">
<tr>
<td><c:out value="${row.employee_id}"></c:out></td>
<td><c:out value="${row.employee_name}"></c:out></td>
</tr>
</c:forEach>
</table>

<!-- Jstl SQL Tags -->


</body>
</html>