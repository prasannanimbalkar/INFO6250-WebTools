<%-- 
    Document   : addMovie
    Created on : Mar 5, 2022, 5:05:47 PM
    Author     : prasannanimbalkar
--%>

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Add Movie Page</title>
    
</head>
<body>

<form action="add.htm" method="post" >
    <label>Title:</label>
    <input type="text" name="title"><br>
    <label>Actor:</label>
    <input type="text" name="actor"><br>
    <label>Actress:</label>
    <input type="text" name="actress"><br>
    <label>Genre:</label>
    <input type="text" name="genre"><br>
    <label>Year:</label>
    <input type="text" name="year"><br/>
    <input type='hidden' name='option' value='add'>
    <input align ="center" type="submit" value="Submit" >
</form>
</body>
</html>
