<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>asdasdas<p>
<%
int a= 10;
if(a==10){
	out.print("Printing....."+a);
	out.print("Printing....."+new Date().toString());
	
}
%>
<%!  
int cube(int n){  
return n*n*n;  
}  
%>
 <p>New para<p>

</body>
</html>