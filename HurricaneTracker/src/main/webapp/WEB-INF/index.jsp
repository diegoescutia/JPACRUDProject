<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hurricane tracker</title>
<jsp:include page="bootstrapHead.jsp" />
<link rel="stylesheet" href="CSS/Styling.css">
</head>
<body class="index">

<div class="bar">
<h1>Hurricane Tracker</h1>


	<form 	action="getStorm.do" method="POST">
			Hurricane ID: <input type="text" name="id" /> <input type="submit"
			value="Get Storm" class="btn btn-primary" />
	</form>

<a href= "getAllStorms.do"> List of all Hurricanes Since 2010</a><br>
<a href= "addHurricane.do"> Add a Hurricane to the database</a>

</div>
<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>