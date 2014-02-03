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
        <h1>The area of your rectangle is</h1>
        <%
                
            out.print(request.getAttribute("results"));
        
        %>
        <h1>The area of your circle is</h1>
        <%
                
            out.print(request.getAttribute("\nresultsTwo"));
        
        %>
        <h1>Side C of your triangle is</h1>
        <%
 
            out.print(request.getAttribute("\nresultsThree"));
        
        %>
    </body>
</html>
