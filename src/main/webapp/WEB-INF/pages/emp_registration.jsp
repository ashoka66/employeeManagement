<%@ page %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>

<h1 style="text-align:center;color:blue">Employee registration Form</h1>

<frm:form modelAttribute="emp">
<table align="center" bgcolor:cyan>


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
<td> <input type="submit" value="submit"/></td>
<td><input type="reset"   value="cancel"/></td>
</tr>
</table>

</frm:form>
