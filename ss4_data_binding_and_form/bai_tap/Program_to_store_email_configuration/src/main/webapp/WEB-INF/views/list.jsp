<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/25/2022
  Time: 4:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${message}</h3>
<table border="1">
    <c:forEach var="mail" items="${mailList}">
        <tr>
            <td>Language: ${mail.language}</td>
        </tr>
        <tr>
            <td>Page Size: ${mail.pageSize}</td>
        </tr>
        <tr>
            <td>Spam: ${mail.spamFillter}</td>
        </tr>
        <tr>
            <td>Signature: ${mail.signatuure}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
