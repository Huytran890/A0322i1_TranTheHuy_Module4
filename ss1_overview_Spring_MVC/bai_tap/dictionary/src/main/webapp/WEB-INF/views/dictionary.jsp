<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/13/2022
  Time: 8:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/translate" method="post">
    <h3>Từ điển Anh - Việt</h3>
    <div>
        <input type="text" name="english">
    </div>
    <div>
        <input type="submit" name="translate" value="Convert">
    </div>
</form>
<h3> Bản dịch : ${vietnamese}</h3>

</body>
</html>
