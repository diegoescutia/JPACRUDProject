<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Add Storm</title>
	<jsp:include page="bootstrapHead.jsp"/>
	<link rel="stylesheet" href="CSS/Styling.css">
	
</head>
<body class="addStorm">
<jsp:include page="navbar.jsp"/>

<div class="container">
 <h3>Add new Hurricane:</h3>
        <form action="addHurricanes.do" method="get">
            <label for="name">Name: </label> <input type="text" name="name"><br>
            <label for="category">Category:</label> <input type="text" name="category"><br>
            <label for=year>Year:</label> <input type="number" name="year"><br>
            <label for="state">State:</label> <input type="text" name="state"><br>
            <label for="maxWind">Maximum Sustained Wind:</label> <input type="number" name="maxWind"><br>
            <label for="cost">Damage Cost:</label> <input type="text" name="cost"><br>
            <label for="fatalities">Fatalities:</label> <input type="number" name="fatalities"><br>
            <input type="submit" value="Add Hurricane" class="btn btn-primary">
        </form>

</div>

<img alt="" src="https://www.weather.gov/images/mob/events/michael/1010_Sat_Michael_745a.gif">
<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>