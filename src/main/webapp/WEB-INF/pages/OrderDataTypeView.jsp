<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<table border="1">
<tr>

<th>OrderId</th><td>${order.oid}</td><br>
</tr>
<tr>
<th>OrderMode</th><td>${order.orderMode}</td><br>
</tr>
<tr>
<th>OrderCode</th><td>${order.orderCode}</td><br>
</tr>
<%-- <tr>
<th>OrderMethod</th><td>${order.orderMethod}</td><br>
</tr> --%>
<tr>
<th>OrderAccept</th><td>${order.orderAccept}</td><br>
</tr>
<tr>
<th>OrderDesc</th><td>${order.orderDesc}</td><br>
</tr>

</table>