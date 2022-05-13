<%-- 
    Document   : home
    Created on : Mar 5, 2022, 8:18:07 PM
    Author     : prasannanimbalkar
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
 <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Shopping</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    </head>
    <body>
        <div style="width: 100%; text-align: center;" class="form-group">
            <h2> SHOP</h2>
            <div style="float: left; width: 25%; height:1000px; margin: 100px; text-align: center ">
                <h2>Choose From the menu</h2>
                <form method="get" action="home.htm">
                    <h2><input class="btn btn-default" type="submit" value="Books" name="choice"/></h2><br>
                    <h2><input class="btn btn-default" type="submit" value="Music" name="choice"/></h2><br>
                    <h2><input class="btn btn-default" type="submit" value="Computer" name="choice"/></h2><br>
                </form>
            </div>
            <div style="float: right; width: 50%; height: 1000px; margin-right: 158px ">
                <form method="get" action="home.htm">
                    <div style="float: right">
                        <input type="submit" name="cartClicked" value="View Cart" /><br>
                    </div>
                    <c:forEach var="mov" items="${sessionScope.visibleArray}">
                        <input type="radio" name="check" value="${mov}">
                        <c:out value="${mov}" /><br>
                    </c:forEach>
                    <c:if test = "${sessionScope.visibleArray.size() < 1}">
                        <h2> Please add items to your cart from Home Page.</h2>
                    </c:if>
                    <div style="text-align: center">
                        <c:if test = "${sessionScope.visibleArray.size() > 0}">
                            <input class="btn btn-default" type="submit" value="ADD TO CART">
                        </c:if>

                        </form>
                    </div>
            </div>
    </body>
</html>
