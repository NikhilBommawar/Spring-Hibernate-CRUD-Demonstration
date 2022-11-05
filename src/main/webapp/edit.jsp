<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<input type="text" value="<%=request.getParameter("eid") %>" name="eid"  readonly><br>
Employee new name <input type="text" name="ename"><br>
Employee new email<input type="text" name="email"><br>
<input type="submit">
</form>

</body>
</html>