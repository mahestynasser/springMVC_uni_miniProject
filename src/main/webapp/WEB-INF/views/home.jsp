<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>

<title>Home</title>
</head>
<body>
	<h2>Add</h2>
	<ul>
  <li>
	<a href="<c:url value="/studentForm"/>"> Add Student</a></li> <br/>
  <li>
	<a href="<c:url value="/teacherForm"/>"> Add Teacher</a></li> <br/>
  <li>
	<a href="<c:url value="/courseForm"/>"> Add Course</a></li> <br/>
	<li>
	<a href="<c:url value="/studentCourseForm"/>"> Assign Student to Course</a>
	</li>
</ul>
	
	
	
	
	<br/>
	
	<h2>View</h2>
	<ul>
	<li> <a href="<c:url value="/viewStudent"/>"> View Students</a> </li> <br>
	<li> <a href="<c:url value="/viewTeacher"/>"> View Teachers</a> </li> <br>
	<li> <a href="<c:url value="/viewCourse"/>"> View Courses</a> </li> <br>
	<li> <a href="<c:url value="/viewStudentCourse"/>"> View Students Assigned to Courses</a> </li> <br>
	</ul>

	
</body>
</html>
