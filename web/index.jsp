<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 12.11.2016
  Time: 22:34
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf8">
  <title>Contact Manager</title>
</head>
<body>

<a href="<c:url value="/logout" />">
  Logout
</a>

<h2>Contact Manager</h2>

<form:form method="post" action="add" commandName="contact" command="add">

  <table>
    <tr>
      <td><form:label path="name">
        Name
      </form:label></td>
      <td><form:input path="Name" /></td>
    </tr>
    <tr>
      <td><form:label path="@mail">
        @mail
      </form:label></td>
      <td><form:input path="mail" /></td>
    </tr>
    <tr>
      <td><form:label path="dateOfBirth">
        dateOfBirth
      </form:label></td>
      <td><form:input path="date" /></td>
    </tr>
    <tr>
      <td><form:label path="callNumber">
        callNumber
      </form:label></td>
      <td><form:input path="call" /></td>
    </tr>
    <tr>
      <td colspan="2"><input type="submit"
       value="/add" /></td>
    </tr>
  </table>
</form:form>

<h3>Contacts</h3>
<c:if test="${!empty usersList}">
  <table class="data">
    <tr>
      <th>Name</th>
      <th>@mail</th>
      <th>Call Number</th>
      <th>&nbsp;</th>
    </tr>
    <c:forEach items="${usersList}" var="contact">
      <tr>
        <td>${UsersEntity.name}</td>
        <td>${UsersEntity.mail}</td>
        <td>${UsersEntity.callNumber}</td>
        <td><a href="/delete/${UsersEntity.id}">Delete</a></td>
      </tr>
    </c:forEach>
  </table>
</c:if>

</body>
</html>