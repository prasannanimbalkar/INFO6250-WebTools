<%-- 
    Document   : browserMovie
    Created on : Mar 5, 2022, 5:05:47 PM
    Author     : prasannanimbalkar
--%>
<%@ page contentType="text/html;charset=UTF-8"  isELIgnored="false" language="java" %>
<html>
<head>
    <title>Browse Movie</title>
    
</head>
<body>
<h1> Search Movie</h1>
<form action="browse.htm" method="post">
    <label>Keyword: </label>
    <input type="text" name="keyword"><br/>
    <input type="radio" name="search" value="title">Search By Title<br/>
    <input type="radio" name="search" value="actor">Search By Actor<br/>
    <input type="radio" name="search" value="actress">Search By Actress<br/>
    <%--        <input type="submit" name="submit" value="Search Movies">--%>
    <%--    <input type='hidden' name='option' value='browse'>--%>
    <input align ="center" type= "submit" value= "Search User" >
</form>
</body>
</html>
