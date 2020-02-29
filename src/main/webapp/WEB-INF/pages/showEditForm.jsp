<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="kt" %>
     <table border="1" style="text-align: center;">
    <kt:form action="update" method="post" modelAttribute="uomDataType">
   
    <tr>
   <th> Uom Id::</th><td><kt:input path="uid" readonly="true"/></td>
   </tr>
   <tr>
                 <th> Uom Type::</th><td><kt:select path="uomType" >
                    <kt:option value="">-Select</kt:option>
                    <kt:option value="Packing">PACKING</kt:option>
                    <kt:option value="no packing">NO PACKING</kt:option> 
                    </kt:select></td>
    </tr>
 <tr>
   <th>   Uom Model::</th><td><kt:input path="uomModel"/> </td>
 </tr>        
             
  <tr>
   <th>  Uom Description::</th><td><kt:textarea path="uomDesc"/> </td>
  </tr>
    <tr><td style="text-align: center;"><input type="submit" value="Update Uom"></td></tr> 
        
    </kt:form>
     </table>

    
   