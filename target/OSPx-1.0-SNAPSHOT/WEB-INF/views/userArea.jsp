<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Favorite</title>
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
<br>
<a href="<c:url value="/userArea/editProfile" />">
    Edit personal data
</a><br/>
<h3>Favorite</h3>
<c:if test="${!empty hotelsList}">
    <table class="data" border="1">
        <tr>
            <th>Name</th>
            <th>Address</th>
            <th>City</th>
            <th>Number of rooms</th>
            <th>Low rate</th>
            <th>High rate</th>
            <th>Property description</th>
        </tr>
        <c:forEach items="${hotelsList}" var="HotelsEntity">
            <tr>
                <td>${HotelsEntity.name}</td>
                <td>${HotelsEntity.address}</td>
                <td>${HotelsEntity.city}</td>
                <td>${HotelsEntity.numberofrooms}</td>
                <td>${HotelsEntity.lowrate}</td>
                <td>${HotelsEntity.highrate}</td>
                <td>${HotelsEntity.propertydescription}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>