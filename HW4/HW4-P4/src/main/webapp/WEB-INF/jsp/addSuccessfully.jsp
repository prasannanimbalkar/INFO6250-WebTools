<%-- 
    Document   : addSuccessfully
    Created on : Mar 5, 2022, 5:05:47 PM
    Author     : prasannanimbalkar
--%>

<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Movie Added</title>
    
</head>
<body>
<h1> 1 Movie added successfully </h1><br><br/>

<table border = "1" width="60%">
    <thead>
    <th>Title</th>
    <th>Actor</th>
    <th>Actress</th>
    <th>Genre</th>
    <th>Year</th>
    </thead>
    <tbody>
    <%--    <c:set var="movie" value="${requestScope.movieInstance}"></c:set>--%>
    <%--    <c:out value="${movie}"></c:out>--%>
    <tr>
        <td>${Movie.title}</td>
        <td>${Movie.actor}</td>
        <td>${Movie.actress}</td>
        <td>${Movie.genre}</td>
        <td>${Movie.year}</td>
    </tr>
    </tbody>
</table>
<br><br/>
<a href="/HW4-P4/"> Click here to go to the main page </a>

</body>
</html>
