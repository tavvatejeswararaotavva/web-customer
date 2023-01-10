<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
 <head>
<title> Home Page</title>
</head>
<body>
<h2>Welome To Eclipse</h2>
<hr>
success full login
<br> 
<form:form action="${pageContext.request.contextPath}/logout"
method="POST">
<input type="submit" value="Logout" />
</form:form>
</body>
</html>