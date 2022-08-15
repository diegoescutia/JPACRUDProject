<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Storm Details</title>
	<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>
<jsp:include page="navbar.jsp"/>
<h1>Hurricane Details</h1>

<div>
  <h2>Name: ${hurricane.name}</h2>
  <h2>Category: ${hurricane.category}</h2>
  <h2>Year: ${hurricane.year}</h2>
  <h2>State Affected: ${hurricane.state}</h2>
  <h2>Maximum Sustained Wind: ${hurricane.maxWind}</h2>
  <h2>Cost of Damages: ${hurricane.cost}</h2>
  <h2>Number of Fatalities: ${hurricane.fatalities}</h2>
  
</div>
<div>
<h4>Edit Storm Details</h4>
<form action="updateHurricane.do" method="POST">
			<label for="id">Id: ${hurricane.id} </label> <input type="text" name="id" hidden="true" value="${hurricane.id}"><br>
		    <label for="name">Name: </label> <input type="text" name="name" value="${hurricane.name}"><br>
            <label for="category">Category:</label> <input type="text" name="category" value="${hurricane.category}"><br>
            <label for=year>Year:</label> <input type="number" name="year" value="${hurricane.year}"><br>
            <label for="state">State:</label> <input type="text" name="state" value="${hurricane.state}"><br>
            <label for="maxWind">Maximum Sustained Wind:</label> <input type="number" name="maxWind" value="${hurricane.maxWind}"><br>
            <label for="cost">Damage Cost:</label> <input type="text" name="cost" value="${hurricane.cost}"><br>
            <label for="fatalities">Fatalities:</label> <input type="number" name="fatalities" value="${hurricane.fatalities}"><br>
			<input type="submit" value="Submit" class="btn btn-primary">
</form>
</div>

<div>
<form action="deleteHurricane.do" method="POST">
	<label for="id">Do you want to delete Hurricane ${hurricane.name}?</label> 	
    <input type="text" name="id" hidden="true" value="${hurricane.id}">
	<input type="submit" value="Yes, Delete" class="btn btn-primary">
</form>
</div>
<jsp:include page="bootstrapFoot.jsp"/>
</body>
</html>



