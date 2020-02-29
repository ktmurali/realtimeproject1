<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

  
    
    <h1 style="color: red;text-align: center">Uom Registration Form</h1>
    
    
    <form action="save" method="post"  >
    Uom Type::<select  name="uomType">
                  <option >-Select-</option>
                  <option >PACKING</option>
                  <option >No PACKING</option>
                </select><br>
    Uom Model::<input  type="text" name="uomModel"/><br>
    Uom Description::<input type="text" name="uomDesc"/><br>
    <input type="submit" value="Create Uom">
    </form>
    
    ${msg}