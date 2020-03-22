<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student</title>
</head>

<body>
	<h2>New Student</h2>
	<form action="addStudent" method="post" modelAttribute="command">
		Name: <input type="text" name="name" size="25"> <br /> <br/> Email:
		<input type="email" name="email" size="25"> <br /> <br /> <br/> <input
			type="submit" value="Add Student" />
	</form>
</body>
</html>

<br />

<a href="/register"> Home</a>
