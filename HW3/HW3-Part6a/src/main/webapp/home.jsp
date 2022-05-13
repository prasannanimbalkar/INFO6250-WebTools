<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Page Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    
</head>
<body>
<h1>Welcome</h1>
<h3>Please make your selection below</h3>
<form action="ServletPart6" method="GET">
    <select name="option">
        <option value="Browse">Check Movie Details</option>
        <option value="Add">Add New Movie</option>
    </select><br/><br/>
    <input type="submit" value="Submit" >
</form>
</body>
</html>


