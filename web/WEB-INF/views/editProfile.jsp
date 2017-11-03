<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Edit profile</title>
</head>
<body>
<br>
<a href="<c:url value="/index" />">
    Hotels
</a><br/>

<h2>Edit profile</h2>
<form:form modelAttribute="user" method="POST">

    <table>
        <tr>
            <td><form:label path="username">
                Name
            </form:label></td>
            <td><form:input path="username" /></td>
            <td><form:errors path="username" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="mail">
                Mail
            </form:label></td>
            <td><form:input path="mail" /></td>
            <td><form:errors path="mail" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="location">
                Location
            </form:label></td>
            <td><form:input path="location" /></td>
            <td><form:errors path="location" cssClass="error"/></td>
        </tr>

        <tr>
        <td><form:label path="discription">
            About me
        </form:label></td>
        <td><form:input path="discription" /></td>
        <td><form:errors path="discription" cssClass="error"/></td>
    </tr>
        <tr>
            <td><form:label path="callNumber">
                call Number
            </form:label></td>
            <td><form:input path="callNumber" /></td>
            <td><form:errors path="callNumber" cssClass="error"/></td>
        </tr>
        <tr>
            <td><form:label path="password">
                Password
            </form:label></td>
            <td><form:input path="password"  type="password"/></td>
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
            <td colspan="2"><input name="edit" type="submit" value="Update user"/></td>
        </tr>
    </table>
</form:form>

</body>
</html>
