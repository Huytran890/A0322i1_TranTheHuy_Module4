<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/25/2022
  Time: 4:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
    <style>
        input[type=text] {
            width: 50%;
            padding: 4px 10px;
            margin: 8px 0;
            box-sizing: border-box;
            border: 3px solid #e9d8f4;
            -webkit-transition: 0.5s;
            transition: 0.5s;
            outline: none;
        }
        input[type=text]:focus {
            border: 3px solid #58257b;
        }
    </style>
</head>
<body>
<div style="text-align: center">
    <h2>Tờ khai y tế</h2>
    <h2><b>Đây là tài liệu quan trọng,thông tin của anh,chị  sẽ giúp cơ quan ý tế liên lạc khi cần thiết đề phòng dịch bệnh truyền nhiễm</b></h2>
    <h3 style="color: red">Khuyến cáo : Khai báo thông tin sai là vi phạm pháp luật Việt Nam và có thể xử lí hình sự</h3>
</div>
<form:form style="margin: 50px 5% 0px 5%" modelAttribute="form" method="post" action="/send">
    <div>
        <form:label path="name" for="inputName">Họ và tên(Ghi chữ HOA) <span style="color: red">(*)</span></form:label>
        <form:input path="name" type="text" id="inputName"/>
    </div>

    <div>
        <form:label path="yearOfBirth" for="inputDateOfBirth">Năm sinh <span style="color: red">(*)</span></form:label>
        <form:input path="yearOfBirth" type="date" id="inputDateOfBirth"/>
    </div>
    <div>
        <form:label path="gender" for="inputGender">Giới tính <span style="color: red">(*)</span></form:label>
        <form:input path="gender" type="text" id="inputGender"/>
    </div>

    <div>
        <form:label path="nationality" for="inputTraditional">Quốc tịch<span style="color: red">(*)</span></form:label>
        <form:input path="nationality" type="password" id="inputTraditional"/>
    </div>
    <div>
        <form:label path="idCard" for="inputCMND">Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp lệ khác <span
                style="color: red">(*)</span></form:label>
        <form:input path="idCard" type="text" id="inputCMND"/>
    </div>
    <div><h5>Thông tin đi lại <span style="color: red">(*)</span></h5></div>
    <div>
        <div>
            <form:radiobutton path="vehicle" name="inlineRadioOptions" id="inlineRadio1" value="Tàu bay"/>
            <label for="inlineRadio1">Tàu bay</label>
        </div>

        <div>
            <form:radiobutton path="vehicle" name="inlineRadioOptions" id="inlineRadio2" value="Tàu thuyền"/>

            <label for="inlineRadio2">Tàu thuyền</label>
        </div>


        <div>
            <form:radiobutton path="vehicle" name="inlineRadioOptions" id="inlineRadio3" value="Ô tô"/>

                <%--            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio3" value="Ô tô">--%>
            <label for="inlineRadio3">Ô tô</label>
        </div>

        <div>
            <form:radiobutton path="vehicle" name="inlineRadioOptions" id="inlineRadio4" value="Khác (Ghi rõ)"/>

                <%--            <input class="form-check-input" type="radio" name="inlineRadioOptions" id="inlineRadio4" value="Khác (Ghi rõ)">--%>
            <label for="inlineRadio4">Khác (Ghi rõ)</label>
        </div>

    </div>
    <div>
        <form:label path="vehicleNumber" for="inputvehicleNumber">Số hiệu phương tiện <span
                style="color: red">(*)</span></form:label>
        <form:input path="vehicleNumber" type="text" id="inputvehicleNumber"/>
    </div>

    <div>
        <form:label path="vehicleSeat" for="inputVehicleSeat">Số ghế <span style="color: red">(*)</span></form:label>
        <form:input path="vehicleSeat" type="text" id="inputVehicleSeat"/>
    </div>

    <div>
        <form:label path="startDate" for="inputStartDate">Ngày khởi hành <span
                style="color: red">(*)</span></form:label>
        <form:input path="startDate" type="date" id="inputStartDate"/>
    </div>
    <div>
        <form:label path="endDate" for="inputEndtDate">Ngày kết thúc <span style="color: red">(*)</span></form:label>
        <form:input path="endDate" type="date" id="inputEndtDate"/>
    </div>
    <div>
        <form:label path="location14Day" for="keKhai">Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh thành phố nào? <span
                style="color: red">(*)</span></form:label>
        <form:input path="location14Day" type="text" id="keKhai"/>
    </div>
    <div><h5>Địa chỉ liên lạc</h5></div>

    <div>
        <form:label path="city" for="inputCity">Tỉnh / thành <span style="color: red">(*)</span></form:label>
        <form:input path="city" type="text" id="inputCity"/>
    </div>
    <div>
        <button type="submit">GỬI TỜ KHAI</button>
    </div>
</form:form>
</body>
</html>
