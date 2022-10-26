<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/25/2022
  Time: 4:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/update" modelAttribute="mail">
    <fieldset>
        <legend><h3>Settings</h3></legend>
        <table>
            <tr>
                <td><form:label path="language"/>Language</td>
                <td><form:select path="language" items="${languages}"/></td>
            </tr>
            <tr>
                <td><form:label path="pageSize"/>Page Size:</td>
                <td>Show <form:select path="pageSize" items="${pageSize}"/> emails per page</td>
            </tr>
            <tr>
                <td><form:label path="spamFillter"/>Spams filter</td>
                <td><form:checkbox path="spamFillter" value="Enable spam filter"/> Enable spam filter</td>
            </tr>
            <tr>
                <td><form:label path="signatuure"/>Signature</td>
                <td><form:textarea path="signatuure"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Update"></td>
                <td><input type="reset" value="Cancel"></td>
            </tr>
        </table>
    </fieldset>
</form:form>
</body>
</html>

