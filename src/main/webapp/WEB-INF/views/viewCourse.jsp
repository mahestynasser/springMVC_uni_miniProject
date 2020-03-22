 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Teachers List</h1>  


<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Description</th><th>Teacher Id</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="course" items="${list}">   
   <tr>  
   <td>${course.courseId}</td>  
   <td>${course.name}</td>  
   <td>${course.description}</td> 
   <td>${course.teacherId}</td>  
   <td> <form method="post" action = "editCourse/${course.courseId}"> <input type="submit" value=Edit /></form></td>  
   <td><form method="post" action = "deleteCourse/${course.courseId}"> <input type="submit" value="Delete" /></form></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   
   <a href="<c:url value="/courseForm"/>"> Add New Course</a>  
   <br/>
   <a href="<c:url value="/"/>"> Home</a>
   