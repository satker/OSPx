<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Hotels</title>
</head>
<body>
<br>
<a href="<c:url value="/logout" />">
    Logout
</a><br/>
<br>
<a href="<c:url value="/userArea" />">
    Personal Area
</a><br/>
<br>
<a href="<c:url value="/indexR" />">
    User Management Center(for admins)
</a><br/>
<br>
<a href="<c:url value="/addhotel" />">
    Become the owner
</a><br/>
<br>
<a href="<c:url value="/indexbook" />">
    Book List (for admins)
</a><br/>


<h3>Hotels</h3>
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
            <th>&nbsp;</th>
            <th>&nbsp;</th>
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
                <td>
                    <c:choose>
                        <c:when test="${added.hotelidint != HotelsEntity.hotelidint}">
                            <form:form modelAttribute="hotel" method="POST" enctype="utf8">
                                <form:hidden path="hotelidint" value="${HotelsEntity.hotelidint}"/>
                                <input name="favorite" type="submit" value="I wonna be your guest"/>
                            </form:form>
                        </c:when>
                        <c:otherwise>
                            Already was added to favorites!
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${booked.hotelidint != HotelsEntity.hotelidint}">
                            <form:form modelAttribute="hotel" method="POST" enctype="utf8">
                                <form:hidden path="hotelidint" value="${HotelsEntity.hotelidint}"/>
                                <input name="book" type="submit" value="Book a room"/>
                            </form:form>
                        </c:when>
                        <c:otherwise>
                            Already was booked!
                        </c:otherwise>
                    </c:choose>
                </td>
                <td><a href="deleteH/${HotelsEntity.hotelidint}">Delete(for admins)</a></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

</body>
</html>