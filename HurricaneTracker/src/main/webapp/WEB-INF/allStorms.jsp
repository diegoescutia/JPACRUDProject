<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Storm List</title>
<jsp:include page="bootstrapHead.jsp" />
</head>
<body>
	<jsp:include page="navbar.jsp" />
	<h1>List of All Hurricanes Since 2010</h1>

	<table class="table table-dark table-striped">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Category</th>
				<th>Year</th>
				<th>State Affected</th>
				<th>Max Wind (mph)</th>
				<th>Cost of Damages</th>
				<th>Number of Fatalities</th>
				
			</tr>
		</thead>

		<tbody>
			<c:forEach var="storms" items="${hurricanes}">

				<tr>
					<td> ${storms.id} </td>
					<td> <a href="getStorm.do?id=${storms.id}"> ${storms.name} </a></td>
					<td> ${storms.category} </td>
					<td> ${storms.year}</td>
					<td> ${storms.state}</td>
					<td> ${storms.maxWind}</td>
					<td> ${storms.cost}</td>
					<td> ${storms.fatalities}</td>
					
				

				</tr>
			</c:forEach>
		</tbody>
	</table>




	<jsp:include page="bootstrapFoot.jsp" />
</body>
</html>