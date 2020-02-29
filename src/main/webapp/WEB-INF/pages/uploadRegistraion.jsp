<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    
    <form action="upload" method="post" enctype="multipart/form-data">
    FileId::<input type="text" name="fileId" />
    Doument:<input type="file" name="fileData" />
    <input type="submit" value="UPLOAD" />
    </form>
    ${msg}
