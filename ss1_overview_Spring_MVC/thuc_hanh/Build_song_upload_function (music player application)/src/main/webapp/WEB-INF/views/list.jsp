<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/25/2022
  Time: 4:31 AM
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
    <c:forEach var="music" items="${musicList}">
        <tr>
            <td>Tên bài hát: ${music.name}</td>
        </tr>
        <tr>
            <td>Nghệ sĩ thể hiện : ${music.artist}</td>
        </tr>
        <tr>
            <td>Thể loại nhạc: ${music.kindOfMusic}</td>
        </tr>
        <tr>
            <td><a href="${music.file}">${music.file}</a></td>

        </tr>
    </c:forEach>
</table>
</body>
</html>
