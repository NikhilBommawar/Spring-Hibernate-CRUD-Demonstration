<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="com.example.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<Employee> list=(List<Employee>)request.getAttribute("list");
%>

<table border="1"> 
<tr><th>Employee id</th><th>Employee name</th><th>Employee email</th><th>Edit</th><th>Delete</th></tr>
<%for(Employee e:list){ %>
<tr><td><%=e.getEid() %></td><td><%=e.getEname() %></td><td><%=e.getEmail() %></td><td><a href="edit.jsp?eid=<%=e.getEid()%>" >Edit</a></td><td><a href="delete.jsp?eid=<%=e.getEid()%>">Delete</a></td></tr>
<%}%>
</table>
</body>
</html>


