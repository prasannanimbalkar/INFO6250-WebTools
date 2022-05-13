
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HW3-Part3</title>
    </head>
    <body>
        <h1>JSTL Tags</h1>

        <h2>Core Tags</h2>

        <h3>core c: forEach example</h3>
        <c:forEach var="j" begin="1" end="3">  
            Item <c:out value="${j}"/><p>  
            </c:forEach>  

        <h3>core c:if example</h3>
        <c:set var="age" value="24"/>
        <c:if test="${age >= 18}">
            <c:out value="You can vote!"/>
        </c:if>
        <c:if test="${age < 18}">
            <c:out value="You cannot vote!"/>
        </c:if>

        <h3>core c:when c:choose example</h3>
        <c:set var="Number1" value="${10}"/>
        <c:set var="Number2" value="${30}"/>
        <c:set var="Number3" value="${40}"/>
        <c:choose>
            <c:when test="${number1 < number2}">
                ${"number1 is less than number2"}
            </c:when>
            <c:when test="${number1 <= number3}">
                ${"number1 is less than equal to number2"}
            </c:when>
            <c:otherwise>
                ${"number1 is largest number!"}
            </c:otherwise>
        </c:choose>

        <h2>Function Tags</h2>


        <h3> fn:join example</h3>
        <%
            String arr[] = {"Rakesh", "Vipul", "Naman"};
            session.setAttribute("names", arr);
        %>
        ${fn:join(names, " & ")}

        <h3>fn:length example</h3>
        <c:set var="string1" value="Welcome"/>
        <c:set var="string2" value="Hi"/>
        Length of String1 is: ${fn:length(string1)}<br>
        Length of String2 is: ${fn:length(string2)}<br>

        <h3>fn:containsIgnoreCase example</h3>
        <c:set var="string1" value="Welcome to Web Tools"/>
        <c:set var="string2" value="Web" />
        <c:if test="${fn:containsIgnoreCase(string1, string2)}">
            <c:out value="Case Insensitive Check: String1 contains String2"/>
        </c:if>


        <h2>Formatting Tags</h2>
        <h3>fmt:parseNumber fmt:formatNumber fmt:parseDate example</h3>

        <c:set var="Salary" value="100000.00" />  

        <fmt:parseNumber var="j" type="number" value="${Salary}" />  
        <p> Salary: <c:out value="${j}" /></p>

        <c:set var="Number" value="20000.23" />
        <p> Number:  
            <fmt:formatNumber value="${Number}" type="currency" /></p>   

        <c:set var="date" value="12-01-2022" />  

        <fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
        <p > Date:<c:out value="${parsedDate}" /></p>


        <h2> XML tags</h2>
        <h3>Using Parse tag out tag and set tag</h3>  
        <c:set var="result">  
        <result>  
            <result>  
                <name>Naman</name>  
                <marks>99</marks>  
            </result>  
            <result>  
                <name>Rakesh</name>  
                <marks>99</marks>  
            </result>  
            <result>  
                <name>Vipul</name>  
                <marks>100</marks>  
            </result>  
        </result>  
    </c:set>  
    <x:parse xml="${result}" var="output"/>  
    <b>Student</b>:  
    <x:out select="$output/result/result[1]/name" /><br>  
    <b>Marks</b>:  
    <x:out select="$output/result/result[1]/marks" />  

    <h2>SQL Tags</h2>
    <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
                       url="jdbc:mysql://localhost/moviedb"  
                       user="root"  password="Prasanna@1996"/>  

    <sql:query dataSource="${db}" var="rs">  
        SELECT * from movies;  
    </sql:query> 
    <table border="2" width="100%">  
        <tr>  
            <th>Movie</th>  
            <th>Actor</th>  
            <th>Actress</th>  
            <th>Genre</th> 
            <th>Year</th>
        </tr>  
        <c:forEach var="table" items="${rs.rows}">  
            <tr>  
                <td><c:out value="${table.Title}"/></td>  
                <td><c:out value="${table.Actor}"/></td>  
                <td><c:out value="${table.Actress}"/></td>  
                <td><c:out value="${table.Genre}"/></td>  
                <td><c:out value="${table.Year}"/></td>
            </tr>  
        </c:forEach>  

    </table>  


</body>
</html>