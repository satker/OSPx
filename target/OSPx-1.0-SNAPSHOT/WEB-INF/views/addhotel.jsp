<%@ page language="java" contentType="text/html; charset=utf8"
         pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf8">
  <title>My hotel</title>
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

<h2>Add My Hotel</h2>
<form:form method="post" action="addhotelc" commandName="addhotel">

  <table>
    <tr>
      <td><form:label path="name">
        Name my hotel
      </form:label></td>
      <td><form:input path="name" /></td>
    </tr>
    <tr>
      <td><form:label path="address">
        Address
      </form:label></td>
      <td><form:input path="address" /></td>
    </tr>
    <tr>
      <td><form:label path="city">
        City
      </form:label></td>
      <td><form:input path="city" /></td>
    </tr>
    <tr>
      <td><form:label path="country">
        Country
      </form:label></td>
      <td><form:input path="country" /></td>
    </tr>
    <tr>
      <td><form:label path="lowrate">
        Low rate
      </form:label></td>
      <td><form:input path="lowrate" /></td>
    </tr>
    <tr>
      <td><form:label path="highrate">
        High rate
      </form:label></td>
      <td><form:input path="highrate" /></td>
    </tr>
    <tr>
      <td><form:label path="propertytype">
        Property type
      </form:label></td>
      <td><form:input path="propertytype" /></td>
    </tr>
    <tr>
      <td><form:label path="numberofrooms">
        Number of rooms
      </form:label></td>
      <td><form:input path="numberofrooms" /></td>
    </tr>
    <tr>
      <td><form:label path="propertydescription">
        Property description
      </form:label></td>
      <td><form:input path="propertydescription" /></td>
    </tr>


    <tr>
      <td colspan="2"><input type="submit"
                             value="Add My Hotel"/></td>
    </tr>
  </table>
</form:form>

</body>
</html>