<%@ page %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<h1 style="text-align:center;color:red">Employee Search List</h1>


<div class="search-container">
  <form action="/emp_search" method="get">
    <input type="text" name="Keyword" placeholder="Search employees..." value="${Keyword}" required>
    <button type="submit">Search</button>
</form>
</div>



<table align="center" color:blue>

<thead>
<tr>
<th>Employee id</th>
<th>Employee name</th>
<th>Employee job</th>
<th>Employee address</th>
<th>Employee salary</th>
</tr>
</thead>

<c:forEach  var="emp" items="${searchlist}" >
<tr>
<td>${emp.eid}</td>
<td>${emp.ename}</td>
<td>${emp.ejob}</td>
<td>${emp.eaddr}</td>
<td>${emp.esal}</td>
 
</tr>

</c:forEach>

</table>