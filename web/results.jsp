<%-- 
    Document   : results
    Created on : Jan 27, 2014, 1:22:11 PM
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
        <h2>Rectangle</h2>
        <%
                
            out.print("The area of your rectangle is " + request.getAttribute("results"));
        
        %>
        
    </body>
</html>
