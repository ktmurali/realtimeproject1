<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    
    <h1 style="color: red;text-align: center;">Employee Registration Detailes</h1><br><br>
    
    
    <form action="save" method="post">
   OrderMode::<input type="radio" name="orderMode" value="SALE">Sale<input type="radio" name="orderMode" value="Purchase">Purchase<br>
   Order Code::<input type="text" name="orderCode"><br>
   OrderMethod::<select  name="ordMethod" >
              <option  value="">--Select--</option>
              <option  value="FIFO">FIFO</option>
              <option value="LIFO">LIFO</option>
              <option value="FCFO">FCFO</option>
              <option value="FEFO">FEFO</option>
              </select><br>
  OrderAccept::<input type="checkbox" name="orderAccept" value="MULTI MODAL">MultiModel<br>
               <input type="checkbox" name="orderAccept" value="ACCEPT RETURN">Accept Return<br>            
   DESCRIPTION:<textarea name="orderDesc"></textarea><br>
    <input type="submit" value="Register">
    </form>
    
    ${msg}