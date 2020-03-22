 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Assignments List</h1>  


<table border="2" width="70%" cellpadding="2">  
<tr><th>Student Id</th><th>Course Id</th><th>Delete</th></tr>  
   <c:forEach var="studentCourse" items="${list}">   
   <tr>  
   <td>${studentCourse.studentId}</td>  
   <td>${studentCourse.courseId}</td>  
   <td><form method="post" action = "deleteStudentCourse/${studentCourse.studentId}/${studentCourse.courseId}"> <input type="submit" value="Delete" /></form></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   
   <a href="<c:url value="/studentCourseForm"/>">Assign student to course</a>  
   <br/>
   <a href="<c:url value="/"/>"> Home</a>
   