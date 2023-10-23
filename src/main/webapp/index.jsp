
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
 <%@page import="java.util.*" %>
 <%@include file="header.jsp" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: green">
<h1>Hello world</h1>
<!-- <h1>Declaration Tag</h1>

<%!int a=10;String name="BeCoder"; %>
<h1>Expression tag: <%= a %> <%=name %>(for print on browser)</h1>

<h1>Scriptlet tag</h1>
<%

int sum=20+30;
//out.println("sum=" +sum);
	
int sub=sum-20;
//out.println("sum=" +sum);
%>

<h1>Sum:<%=sum %></h1>
<h1>Sub:<%=sub %></h1> -->

<h1>Time:<%=new Date().toString() %></h1>
</body>
</html>




