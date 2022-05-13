<%-- 
    Document   : newjsp
    Created on : 25 Feb, 2022, 6:41:15 AM
    Author     : prasannanimbalkar
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Books List</title>
</head>
<body>
<%
String amount = request.getParameter("amount");
int count = Integer.valueOf(amount);
%>
<form action="ServletPart7" method="post">
    <table border="0.5">
        <tr/><th/>ISBN<th/>Book Title<th/>Authors<th/>Price
        <%for (int i = 0; i < count; i++) {%>
        <tr/>
        <td/><input type="text" name="isbn<%=String.valueOf(i)%>"/>
        <td/><input type="text" name="title<%=String.valueOf(i)%>"/>
        <td/><input type="text" name="authors<%=String.valueOf(i)%>"/>
        <td/><input type="text" name="price<%=String.valueOf(i)%>"/>
        <%}%>
        <tr/><td/>
        <input type="submit" name="submit" value="Add Books">
        <input type="hidden" name="amount" value="<%=amount%>">
    </table>
</form>

</body>
</html>
