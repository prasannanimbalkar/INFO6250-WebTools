<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Add Movie Page</title>
</head>
<body>
<h1> Please Enter the details below: </h1><br>
<form action= "ServletPart6" method= "post">
    <label> Movie Title </label>
    <input type="text" name= "title"><br/><br/>
    <label> Lead Actor </label>
    <input type="text" name= "actor"><br/><br/>
    <label> Lead Actress  </label>
    <input type="text" name= "actress"><br/><br/>
    <label> Genre  </label>
    <input type="text" name= "genre"><br/><br/>
    <label> Year  </label>
    <input type="text" name= "year"><br/><br/>
    <input type='hidden' name='option' value='add'>
    <input align ="center" type="submit" value="Submit" >
</form>
</body>
</html>
