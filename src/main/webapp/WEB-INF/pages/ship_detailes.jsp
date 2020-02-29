<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@taglib prefix="kt" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <kt:choose>
    <kt:when test="${!empty list}">
    <h1 style="color: red;text-align: center;">ShipmentDetailes</h1>
    <table border="1">
  <tr>
    
    <th>shipId</th>
    <th>shipCode</th>
    <th>shipMode</th>
    <th>shipEnable</th>
    <th>shipGrade</th>
    <th>shipDesc</th>
    <th>Operation</th>
  </tr>
  <kt:forEach items="${list}" var="ob">
  <tr>
    <td>${ob.shipId}</td>
    <td>${ob.shipCode}</td>
    <td>${ob.shipMode}</td>
    <td>${ob.shipEnable}</td>
    <td>${ob.shipGrade}</td>
    <td>${ob.shipDesc}</td>
    <td><a href="delete?sid=${ob.shipId}">DELETE</a></td>
  </tr>
  </kt:forEach>
</table>
<h1 style="color: red;text-align: center;">${msg}</h1>
</kt:when>
<kt:otherwise>
<h2 style="color: red;text-align: center;">Data Not Found</h2>
</kt:otherwise>
</kt:choose><br><br>

