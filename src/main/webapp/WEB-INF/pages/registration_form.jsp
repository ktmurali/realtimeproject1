<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    
    <h1 style="color: red;text-align: center;">Employee Registration Detailes</h1><br><br>
    
    
    <form action="save" method="post">
   SHIPCODE::<input type="text" name="shipCode"><br>
   SHIPMODE::<select  name="shipMode">
              <option>--Select--</option>
              <option>Air</option>
              <option>Ship</option>
              <option>Trunc</option>
             </select><br>
   SHIPENABLE::<select  name="shipEnable">
              <option>--Select--</option>
              <option>Yes</option>
              <option>No</option>
               </select><br>
   SHIPGRADE::<input type="radio" name="shipGrade">A
              <input type="radio" name="shipGrade">B
              <input type="radio" name="shipGrade">C<br>
   DESCRIPTION:<textarea name="shipDesc"></textarea><br>
    <input type="submit" value="Register">
    </form>

    
    