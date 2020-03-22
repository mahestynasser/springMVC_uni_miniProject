<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Course</title>
</head>

<body>
	<h2>New Course</h2>
	<form action="addCourse" method="post" modelAttribute="command">
		Name: <input type="text" name="name" size="40"> 
		<br/> <br/>
		Description: <input type="text" name="description" size="85"> 
		<br/> <br/>
		Teacher Id: <input type="number" name="teacherId" size="10"> 
		<br/> <br/> <br/>
		<input type="submit" value="Add Course" />
	</form>
</body>
</html>

<br />

<a href="/register"> Home</a>
