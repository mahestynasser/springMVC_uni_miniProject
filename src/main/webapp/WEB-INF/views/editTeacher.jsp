<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Edit Teacher</h1>
<form:form action="edit" method="post" modelAttribute="command">
	<table>
		<tr>
			<td>Id :</td>
			<td><form:input type="number" path="teacherId" value="${teacher.teacherId}"
					disabled="disabled" /></td>
		</tr>
		<tr>
			<td>Name :</td>
			<td><form:input path="name" value="${teacher.name}" /></td>
		</tr>
		<tr>
			<td>Email :</td>
			<td><form:input type="email" path="email" value="${teacher.email}" /></td>
		</tr>

		<tr>
			<td></td>
			<td><input type="submit" value="Edit Teacher" /></td>
		</tr>
	</table>
</form:form>

<br />

<a href="<c:url value="/"/>"> Home</a>
