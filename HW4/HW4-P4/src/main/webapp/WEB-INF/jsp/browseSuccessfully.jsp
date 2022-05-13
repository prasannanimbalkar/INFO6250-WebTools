<%-- 
    Document   : browseSuccessfully
    Created on : Mar 5, 2022, 5:05:47 PM
    Author     : prasannanimbalkar
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Browse</title>
</head>
<body>
<h1> Found Following movies with Search Criteria </h1><br><br/>

<table border = "1" width="60%">
    <thead>
    <th>Title</th>
    <th>Actor</th>
    <th>Actress</th>
    <th>Genre</th>
    <th>Year</th>
    </thead>
    <tbody>
    <c:forEach var="movie" items="${list}">
        <tr>
            <td><c:out value="${movie.getTitle()}" /></td>
            <td><c:out value="${movie.getActor()}" /></td>
            <td><c:out value="${movie.getActress()}" /></td>
            <td><c:out value="${movie.getGenre()}" /></td>
            <td><c:out value="${movie.getYear()}" /></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br/>
<a href="/HW4-P4/"> Click here to go to the main page </a>

</body>
</html>
