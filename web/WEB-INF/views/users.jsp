<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>Users</title>
</head>
<body>
<br>
<a href="<c:url value="/logout" />">
	Logout
</a><br/>
<br>
<a href="<c:url value="/index" />">
	Hotels
</a><br/>


<form:form method="post" action="add" commandName="users">

	<table>
		<tr>
			<td><form:label path="username">
				Name
			</form:label></td>
			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td><form:label path="mail">
				Mail
			</form:label></td>
			<td><form:input path="mail" /></td>
		</tr>
		<tr>
			<td><form:label path="location">
				Location
			</form:label></td>
			<td><form:input path="location" /></td>
		</tr>
		<tr>
			<td><form:label path="password">
				Password
			</form:label></td>
			<td><form:input path="password" /></td>
		</tr>

		
		<tr>
			<td colspan="2"><input type="submit"
				value="Add User"/></td>
		</tr>
	</table>
</form:form>

<h3>Users</h3>
<c:if test="${!empty usersList}">
	<table class="data">
		<tr>
			<th>Name</th>
			<th>Mail</th>
			<th>Date of Birth</th>
			<th>Location</th>
			<th>Description</th>
			<th>Call Number</th>
			<th>Role</th>
			<th>&nbsp;</th>
		</tr>
		<c:forEach items="${usersList}" var="UsersEntity">
			<tr>
				<td>${UsersEntity.username}</td>
				<td>${UsersEntity.mail}</td>
				<td>${UsersEntity.dateOfBirth}</td>
				<td>${UsersEntity.location}</td>
				<td>${UsersEntity.discription}</td>
				<td>${UsersEntity.callNumber}</td>
				<td>${UsersEntity.rolename}</td>
				<td><a href="delete/${UsersEntity.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>

</body>
</html>