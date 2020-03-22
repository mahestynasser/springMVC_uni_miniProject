<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Course</h1>
<form:form action="edit" method="post" modelAttribute="command">
	<table>
		<tr>
			<td>Id :</td>
			<td><form:input type="number" path="courseId" value="${course.courseId}"
					disabled="disabled" /></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><form:input path="name" value="${course.name}" /></td>
		</tr>
		<tr>
			<td>Description :</td>
			<td><form:input path="description" value="${course.description}" /></td>
		</tr>
		<tr>
			<td>Teacher Id :</td>
			<td><form:input type="number" path="teacherId" value="${course.teacherId}" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Edit Course" /></td>
		</tr>
	</table>
</form:form>

<br />

<a href="<c:url value="/"/>"> Home</a>
