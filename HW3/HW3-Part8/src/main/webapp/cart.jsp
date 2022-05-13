<%-- 
    Document   : cart
    Created on : 25 Feb, 2022, 6:41:15 AM
    Author     : prasannanimbalkar
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping Cart</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>

        <div class="form-group" height: 1000px; margin-left: 200px; margin-right: 200px">
            <h2 style="text-align: center">You have added following items to your cart.</h2>    
            <form method="post" action="HomeController">
                <div style="height: 400px; text-align: center">
                    <c:forEach var="mov" items="${sessionScope.cartArray}">
                        <input  type="checkbox" name="checkDel" value="${mov}" />
                        <c:out value="${mov}" /><br>
                    </c:forEach>

                    <c:if test = "${sessionScope.cartArray.size() < 1 || sessionScope.cartArray == null}">
                        <h3> Please add items to your cart from Home Page.</h3>
                    </c:if>
                </div>
                <div style="text-align: center">
                    <c:if test = "${sessionScope.cartArray.size() > 0}">
                        <input class="btn btn-default" type="submit" value="Delete Item">
                    </c:if>
                </div>
            </form>
            <div style="text-align: center">
                <h2><a href="home">Go back to home page</a><br></h2>
            </div>

        </div>
    </body>
</html>
