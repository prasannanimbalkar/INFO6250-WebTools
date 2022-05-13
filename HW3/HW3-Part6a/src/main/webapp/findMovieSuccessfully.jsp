<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" isELIgnored="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Movie Added</title>
    
</head>
<body>
<h1> Found Following user with Search Criteria </h1><br><br/>

<table border = "1" width="60%">
    <thead>
    <th>Movie Title</th>
    <th>Lead Actor</th>
    <th>Lead Actress</th>
    <th>Genre</th>
    <th>Year</th>

    </thead>
    <tbody>
    <c:forEach var="user" items="${requestScope.serachedMovie}">
        <tr>
            <td><c:out value="${user.getTitle()}" /></td>
            <td><c:out value="${user.getActor()}" /></td>
            <td><c:out value="${user.getActress()}" /></td>
            <td><c:out value="${user.getGenre()}" /></td>
            <td><c:out value="${user.getYear()}" /></td>

        </tr>
    </c:forEach>
    </tbody>
</table>
<br><br/>
<a href="home.jsp"> Click here to go to the main page </a>
</body>
</html>
