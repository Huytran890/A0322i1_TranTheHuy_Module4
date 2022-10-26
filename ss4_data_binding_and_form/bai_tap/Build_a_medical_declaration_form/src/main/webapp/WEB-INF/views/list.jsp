<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/25/2022
  Time: 4:47 AM
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
    <c:forEach var="form" items="${medicalList}">

    <div style="margin: 50px 5% 0px 5%">
        <div>

            <label for="inputName">Họ và tên(Ghi chữ HOA) <span style="color: red">(*)</span></label>
            <input  type="text"  id="inputName" value="${form.name}" />
        </div>
        <div>
            <label for="inputDateOfBirth">Năm sinh <span style="color: red">(*)</span></label>
            <input  type="date" id="inputDateOfBirth" value="${form.yearOfBirth}"/>
        </div>
        <div>
            <label for="inputGender" >Giới tính <span style="color: red">(*)</span></label>
            <input type="text"  id="inputGender" value="${form.gender}"/>
        </div>
        <div>
            <label for="inputTraditional" >Quốc tịch<span style="color: red">(*)</span></label>
            <input type="password"  id="inputTraditional" value="${form.nationality}"/>
        </div>
        <div>
            <label for="inputCMND" >Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp lệ khác <span style="color: red">(*)</span></label>
            <input type="text"  id="inputCMND" value="${form.idCard}"/>
        </div>
        <div>
            <h5>Thông tin đi lại <span style="color: red">(*)</span></h5>
        </div>
        <div>
            <label for="idCard" >Thông tin phương tiện <span style="color: red">(*)</span></label>
            <input type="text"  id="idCard" value="${form.idCard}"/>
        </div>
        <div>
            <label for="inputvehicleNumber" >Số hiệu phương tiện <span style="color: red">(*)</span></label>
            <input type="text" id="inputvehicleNumber" value="${form.vehicleNumber}" />
        </div>
        <div>
            <label for="inputVehicleSeat" >Số ghế <span style="color: red">(*)</span></label>
            <input type="text"  id="inputVehicleSeat" value="${form.vehicleSeat}"/>
        </div>
        <div>
            <label for="inputStartDate" >Ngày khởi hành <span style="color: red">(*)</span></label>
            <input type="date"  id="inputStartDate" value="${form.startDate}"/>
        </div>
        <div>
            <label for="inputEndtDate" >Ngày kết thúc <span style="color: red">(*)</span></label>
            <input type="date"  id="inputEndtDate" value="${form.endDate}"/>
        </div>
        <div>
            <label for="keKhai" >Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố nào? <span style="color: red">(*)</span></label>
            <input type="text" id="keKhai" value="${form.location14Day}"/>
        </div>
        <div>
            <h5>Địa chỉ liên lạc</h5>
        </div>
        <div>
            <label for="inputCity" >Tỉnh / thành <span style="color: red">(*)</span></label>
            <input type="text"  id="inputCity" value="${form.city}"/>
        </div>
        <div>
            <button type="submit" >Back</button>
        </div>
        </c:forEach>
</table>
</body>
</html>
