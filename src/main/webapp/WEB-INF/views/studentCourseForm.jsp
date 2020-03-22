<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assign Student to Course</title>
</head>

<body>
	<h2>Assign Student to Course</h2>
	<form action="addStudentCourse" method="post" modelAttribute="command">
		Student Id: <input type="number" name="studentId" size="10"> <br /> <br/>
		Course Id: <input type="number" name="courseId" size="10"> <br /> <br /> <br/> 
		<input type="submit" value="Add" />
	</form>
</body>
</html>

<br />

<a href="/register"> Home</a>
