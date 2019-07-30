<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Wines</title>

<!--  Reference css -->
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/skeleton.css">
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/normalize.css">

</head>
<body>

	<div id="wrapper">
		<div id="header">
			<h2>Cellar Tracker</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">


			<!--  put new btn: Add Wine -->
			<input type="button" value="Add Wine"
				onclick="window.location.href='showFormForAdd'" class="add-btn">

			<!--  add a search box -->
			<form:form action="search" method="GET">
                Search wine: <input type="text" name="searchName" />

				<input type="submit" value="Search" class="add-button" />
			</form:form>

			<!-- - add html table here -->

			<table>

				<tr>
					<th>Wine Producer</th>
					<th>Vintage</th>
					<th>Wine Name</th>
					<th>Consumed on</th>
					<th>Actions</th>
				</tr>

				<c:forEach var="tempWine" items="${wines}">

					<c:url var="updateLink" value="/wine/showFormForUpdate">
						<c:param name="wineId" value="${tempWine.id}" />
					</c:url>
					<c:url var="deleteLink" value="/wine/delete">
						<c:param name="wineId" value="${tempWine.id}" />
					</c:url>

					<tr>
						<td>${tempWine.wineVintage}</td>
						<td>${tempWine.wineProducer}</td>
						<td>${tempWine.wineName}</td>
						<td>${tempWine.bottleOpenDate}</td>
						<td><a href="${updateLink}">Update</a> | <a
							href="${deleteLink}"
							onclick="if (!(confirm('Are you sure you want to delete this wine?'))) return false">Delete</a>
						</td>
					</tr>
				</c:forEach>

			</table>

		</div>
	</div>

</body>
</html>