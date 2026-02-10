<%@ page %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>


<h1 style="text-align:center;color:Green">Update Employee</h1>

<frm:form modelAttribute="emp">
<table align="center" border="1" style="background-color:lightblue">
 
 <tr>
 <td>Employee id</td>
 <td><frm:input path="eid" readonly="true"/></td>
 </tr>
 <tr>
 <td>Employee Name</td>
 <td><frm:input path="ename"/></td>
 </tr>
  <tr>
 <td>Employee job</td>
 <td><frm:input path="ejob"/></td>
 </tr>
  <tr>
 <td>Employee Address</td>
 <td><frm:input path="eaddr"/></td>
 </tr>
  <tr>
 <td>Employee salary</td>
 <td><frm:input path="esal"/></td>
 </tr>
 
 <tr>
 <td><input type="submit" value="update"></td>
  <td><input type="reset" value="reset"></td>
 
 </tr>


</table>

<h1 style="text-align:center;color:yellow"><a href="showlist">Go To Employee List</a></h1>
</frm:form>
