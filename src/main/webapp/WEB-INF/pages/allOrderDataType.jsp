<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="kt"%>

<kt:choose>
	<kt:when test="${!empty list}">
		<table border="1">
			<tr>

				<th>OrderId</th>
				<th>OrderMode</th>
				<th>OrderCode</th>
				<!-- <th>OrderMethod</th> -->
				<th>OrderAccept</th><
				<th>OrderDesc</th>
				<th colspan="3">Opreation</th>
			</tr>
			<kt:forEach items="${list}" var="order">
				<tr>
					<td>${order.oid}</td>
					<td>${order.orderMode}</td>
					<td>${order.orderCode}</td>
					<%-- <td>${order.ordMethod}</td> --%>
					<td>${order.orderAccept}</td>
					<td>${order.orderDesc}</td> <
					<td><a href="delete?oid=${order.oid}">DELETE</a></td>
					<td><a href="edit?oid=${order.oid}">UPDATE</a></td>
					<td><a href="view?oid=${order.oid}">VIEW</a></td>
				</tr>
			</kt:forEach>
		</table>
     ${msg}
    </kt:when>
    
	<kt:otherwise>
		<h1 style="color: red; text-align: center;">Data Not Found</h1>
	</kt:otherwise>

</kt:choose>
<br><br>
<h1 style="color: red;text-align: center;"><a href="excel">ExcelExport</a></h1>
<h2 style="color: red;text-align: center;"><a href="pdf">PDFExport</a></h2>