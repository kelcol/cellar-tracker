<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Save Wine</title>

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
		<form:form action="saveWine" modelAttribute="wine" method="POST">

			<form:hidden path="id" />

			<table>

				<tr>
					<td><label>Vintage:</label></td>
					<td><form:input path="wineVintage" /></td>
				</tr>


				<tr>
					<td><label>Wine Producer:</label></td>
					<td><form:input path="wineProducer" /></td>
				</tr>

				<tr>
					<td><label>Wine Name:</label></td>
					<td><form:input path="wineName" /></td>
				</tr>

				<tr>
					<td><label>Consumed On:</label></td>
					<td><form:input path="bottleOpenDate" /></td>
				</tr>



				<tr>
					<td><label></label></td>
					<td><input type="submit" value="Save" class="save" /></td>
				</tr>

			</table>


		</form:form>

		<div style=""></div>

		<p>
			<a href="${pageContext.request.contextPath}/wine/list">Back to
				List</a>
		</p>

	</div>







</body>
</html>