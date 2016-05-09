<%-- 
    Document   : read
    Created on : May 7, 2016, 8:20:55 PM
    Author     : sjpod
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customers</title>
    </head>
    <% String table = (String) request.getAttribute("table"); %>
    
    <body>
        <h1>Customers Database</h1>
        <%= table%>
        
         <br><br>
        
        <a href ="add">Add A New Customer</a>
        
    </body>
</html>
