<%@ page import="usersBD.Database" %>
<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><%--
  Created by IntelliJ IDEA.
  User: Artem
  Date: 10.12.2016
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>Book</title>
</head>
<br>
<a href="<c:url value="/index" />">
    Hotels
</a><br/>
<body>
<h3>Book</h3>
<c:if test="${!empty BookList}">
    <table class="data" border="1">
        <tr>
            <th>Hotel ID</th>
            <th>User ID</th>
            <th>&nbsp;</th>
        </tr>
        <c:forEach items="${BookList}" var="UserHotelBookEntity">
            <tr>
                <td>${UserHotelBookEntity.hotelidint}</td>
                <td>${UserHotelBookEntity.id}</td>
                <td><a href="deleteH/${UserHotelBookEntity.id}">Delete(for admins)</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>
<h3>Users</h3>
<%=Database.getData()%>
</body>
</html>
