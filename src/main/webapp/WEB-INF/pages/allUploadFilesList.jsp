<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="kt" %>
    
    <h1 style="color: red;text-align: center;">File Upload List</h1><br><br>
    
    <kt:choose>
    <kt:when test="${!empty list}">
    <table border="1">
    <tr>
    <th>FileId</th>
    <th>FileName</th>
    <th>Link</th>
    </tr>
    <kt:forEach items="${list}" var="ob">
    <tr>
    <td>${ob[0]}</td>
    <td>${ob[1]}</td>
    <td><a href="download?fileId=${ob[0]}">Download</a></td>
    </tr>
    </kt:forEach> 
    </table>   
    </kt:when>
      <kt:otherwise>
      <h1 style="color: red;text-align: center;">Data Not Found</h1><br><br>
      </kt:otherwise>  
    </kt:choose>
    

    