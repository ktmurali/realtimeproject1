<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="kt" %>
     <table border="1" style="text-align: center;">
    <kt:form action="update" method="post" modelAttribute="orderDataType">
    OrderId::<kt:input path="oid" readonly="true"/>
   OrderMode::<kt:radiobutton path="orderMode" value="Sale" />Sale<kt:radiobutton value="Purchase"  path="orderMode" />Purchase<br>
   Order Code::<kt:input path="orderCode" /><br>
  <%--  OrderMethod::<kt:select  path="orderMethod">
              <kt:option value="">--Select--</kt:option>
              <kt:option value="FIFO">FIFO</kt:option>
              <kt:option value="LIFO">LIFO</kt:option>
              <kt:option value="FCFO">FCFO</kt:option>
              <kt:option value="FEFO">FEFO</kt:option>
              </kt:select><br> --%>
  OrderAccept::<kt:checkbox path="orderAccept" value="MULTI MODAL" />MultiModel<br>
               <kt:checkbox path="orderAccept" value="ACCEPT RETURN" />Accept Return<br>            
   DESCRIPTION:<kt:textarea path="orderDesc" /><br>
    <input type="submit" value="Register">
    </kt:form>
    
     </table>

