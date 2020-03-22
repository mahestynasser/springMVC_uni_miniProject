
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Students List</h1>


<table border="2" width="70%" cellpadding="2">
	<tr>
		<th>Id</th>
		<th>Name</th>
		<th>Email</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
	<c:forEach var="student" items="${list}">
		<tr>
			<td>${student.studentId}</td>
			<td>${student.name}</td>
			<td>${student.email}</td>
			<td>
				<form method="post" action="editStudent/${student.studentId}">
					<input type="submit" value=Edit />
				</form>
			</td>
			<td><form method="post"
					action="deleteStudent/${student.studentId}">
					<input type="submit" value="Delete" />
				</form></td>
		</tr>
	</c:forEach>
</table>
<br />

<a href="<c:url value="/studentForm"/>"> Add New Student</a>
<br/>
<a href="<c:url value="/"/>"> Home</a>
