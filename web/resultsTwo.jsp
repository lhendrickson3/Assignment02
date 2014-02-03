<%-- 
    Document   : resultsTwo
    Created on : Feb 2, 2014, 7:46:47 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Results</title>
    </head>
    <body>
        <h1>Results</h1>
        
        <h2>Circle</h2>
        <%
            out.print("The area of your circle is " + request.getAttribute("resultsTwo"));

        %>
        
    </body>
</html>
