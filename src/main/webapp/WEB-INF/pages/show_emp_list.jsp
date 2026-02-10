<%@ page %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


  <h1 style="text-align:center;color:Green">Employees List</h1>
  
  <c:choose>
  <c:when test="${!empty emplist}">

    <table align="center"  border="1" style="background-color:lightblue">
        <tr><th>Employee ID</th><th>Employee Name</th><th>Employee job</th><th>Employee address</th><th>Employee salary</th></tr>
        <c:forEach var="emp" items="${emplist}">
       
            <tr>
                <td>${emp.eid}</td>
                <td>${emp.ename}</td>
                <td>${emp.ejob}</td>
                <td>${emp.eaddr}</td>
                <td>${emp.esal}</td>
                <td><a href="emp_edit?no=${emp.eid}"><img src="images/empedit.png" width="30px" height="30px"></a></td>
                <td><a href="emp_del?no=${emp.eid}" onclick="retrun confirm('Are you sure to delete')"><img src="images/empdel.png" width="30px" height="30px"></a></td> 
            </tr>
            
            
        </c:forEach>
    </table>
    
    <h1 style="text-align:center;color:Green">${msg}</h1>
    <h1 style="text-align:center;color:Green">${resultMsg}</h1>
    <h1 style="text-align:center;color:Red">${delmsg}</h1>
</c:when>

<c:otherwise>

<h1 style="text-align:center;color:red">Employees not found </h1>

</c:otherwise>
 
 </c:choose>
 
 <br> <br>
 
  <h3 style="text-align:center;color:green"><a href="emp_add">Add Employee</a></h3>
  <h1 style=text-align:center> <a href="emp_add"><img src="images/empadd.png" width="60px" height="60px"></a></h1>

   <br> <br>
   <br> <br>
   <h1 style=text-align:center>Go Home</h1>
   <h1 style=text-align:center> <a href="./"><img src="images/homepage.png" width="100px" height="100px"></a></h1>
