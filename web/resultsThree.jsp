<%-- 
    Document   : resultsThree
    Created on : Feb 2, 2014, 7:47:20 PM
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
       
        <h2>Pythagorean Theorem</h2>
        <%
            
            out.print("The length of Side C is " + request.getAttribute("resultsThree"));
                        
        %>
    </body>
</html>
