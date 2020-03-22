 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Teachers List</h1>  


<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Email</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="teacher" items="${list}">   
   <tr>  
   <td>${teacher.teacherId}</td>  
   <td>${teacher.name}</td>  
   <td>${teacher.email}</td>  
   <td> <form method="post" action = "editTeacher/${teacher.teacherId}"> <input type="submit" value=Edit /></form></td>  
   <td><form method="post" action = "deleteTeacher/${teacher.teacherId}"> <input type="submit" value="Delete" /></form></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   
   <a href="<c:url value="/teacherForm"/>"> Add New Teacher</a>  
   <br/>
   <a href="<c:url value="/"/>"> Home</a>
   