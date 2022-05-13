<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Browse Movie</title>
</head>
<body>
<h1> Searching User</h1><br>
<form action= "ServletPart6"  method= "post">
    <label> Keyword </label>
    <input type="text" name= "searchtext"><br /><br/>
    <input type="radio" name= "searchoption" value ="title">Search By Title <br><br/>
    <input type="radio" name= "searchoption" value ="actor">Search By Actor <br><br/>
    <input type="radio" name= "searchoption" value ="actress">Search By Actress <br><br/>

    <input type='hidden' name='option' value='browse'>
    <input align ="center" type= "submit" value= "Search Movies" >
</form>
</body>
</html>