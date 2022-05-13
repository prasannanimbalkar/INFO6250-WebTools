<%-- 
    Document   : cart
    Created on : Mar 6, 2022, 3:08:25 PM
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

        <div class="form-group" height: 1000px; margin-left: 100px; margin-right: 100px">
            <h2 style="text-align: center">Following items are </h2>    
            <form method="get" action="home.htm">
                <div style="height: 500px; text-align: center;">
                    <c:forEach var="mov" items="${sessionScope.cartArray}">
                        <input  type="radio" name="checkDel" value="${mov}" />
                        <c:out value="${mov}" /><br>
                    </c:forEach>

                    <c:if test = "${sessionScope.cartArray.size() < 1 || sessionScope.cartArray == null}">
                        <h3> Please add items to your cart from Home Page.</h3>
                    </c:if>
                </div>
                <div style="text-align: center">
                    <c:if test = "${sessionScope.cartArray.size() > 0}">
                        <input class="btn btn-default" type="submit" value="Delete Item" name="deleteClicked">
                    </c:if>
                </div>
            </form>
            <div style="text-align: center">
                <h2><a href="home.htm">Go back to home page</a><br></h2>
            </div>

        </div>
    </body>
</html>
