<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Delete">
  Employee id to be deleted <input type="text" value="<%= request.getParameter("eid")%>" name="eid" readonly>
  <input type="submit" value="Confirm">
  </form>
</body>
</html>