<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Registration</title>
</head>
<body>


<a href="<c:url value="/index.jsp" />">
    Login
</a><br/>

<h2>Registration</h2>
<form:form modelAttribute="user" method="POST">

    <table>
        <tr>
            <td><form:label path="username">
                Name
            </form:label></td>
            <td><form:input path="username"/></td>
            <td><form:errors path="username" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="mail">
                Mail
            </form:label></td>
            <td><form:input path="mail"/></td>
            <td><form:errors path="mail" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="location">
                Location
            </form:label></td>
            <td><form:input path="location"/></td>
            <td><form:errors path="location" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="password">
                Password
            </form:label></td>
            <td><form:input path="password" type="password"/></td>
            <td><form:errors path="password" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="password">
                Confirm password
            </form:label></td>
            <td><form:input path="matchingPassword" type="password"/></td>
            <td><form:errors cssClass="error"/></td>
        </tr>


        <tr>
            <td colspan="2"><input name="registration" type="submit" value="Add user"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
