<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Sandwich Condiments</h1>
<form action="/save" method="get">
    <input type="checkbox" name="condiment" value="Lettuce">
    Lettuce
    <input type="checkbox" name="condiment" value="Tomato">
    Tomato
    <input type="checkbox" name="condiment" value="Mustard">
    Mustard
    <input type="checkbox" name="condiment" value="Sprouts">
    Sprouts
    <br><br>
    <input type="submit" id="submit" value="Save"/>
    <h2>Result: </h2>
    <c:forEach var="condiment" items="${condiment}">
        <h4>${condiment}</h4>
    </c:forEach>
</form>

</body>
</html>
