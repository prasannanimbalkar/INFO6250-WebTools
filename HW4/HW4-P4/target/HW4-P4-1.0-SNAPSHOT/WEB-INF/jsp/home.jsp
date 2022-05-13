<%-- 
    Document   : home
    Created on : Mar 5, 2022, 5:05:47 PM
    Author     : prasannanimbalkar
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
</head>
<body>
<h1>Welcome</h1>
<h3>Please make your selection below</h3>
<form action="select.htm" method="POST">
    <select name="option">
        <option value="Browse">Check Movie Details</option>
        <option value="Add">Add New Movie</option>
    </select><br/><br/>
    <input type="submit" value="Submit" >
</form>

</body>
</html>
