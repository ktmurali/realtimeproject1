<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="kt" %>
    
    <kt:choose>
    <kt:when test="${!empty list}">
    <table border="1">
    <tr>
       <th>Uid</th>
       <th>UomType</th>
       <th>UomModel</th>
       <th>UomDesc</th>
       <th colspan="3">Opreation</th>
    </tr>
    <kt:forEach items="${list}" var="ob">
      <tr>
        <td>${ob.uid}</td>
        <td>${ob.uomType}</td>
        <td>${ob.uomModel}</td>
        <td>${ob.uomDesc}</td>
        <td><a href="delete?uid=${ob.uid}">DELETE</a></td>
        <td><a href="edit?uid=${ob.uid}">UPDATE</a></td>
        <td><a href="view?uid=${ob.uid}">VIEW</a></td>
       </tr>
    </kt:forEach>
    </table>
     ${msg}
    </kt:when>
    <kt:otherwise>
    <h1 style="color: red;text-align: center;">Data Not Found</h1>
    </kt:otherwise>
    
    </kt:choose>