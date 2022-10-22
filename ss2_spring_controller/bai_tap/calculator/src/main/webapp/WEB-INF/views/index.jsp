<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 10/19/2022
  Time: 2:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <div class="calculator">
    <input placeholder="0" id="input" class="calculator__display" value="">
    <div class="calculator__keys">
      <button class="key--operator" value='+' onclick="set_number(this.value)">+</button>
      <button class="key--operator" value='-' onclick="set_number(this.value)">-</button>
      <button class="key--operator" value='*' onclick="set_number(this.value)">*</button>
      <button class="key--operator" value='/' onclick="set_number(this.value)">÷</button>
      <button value='7' onclick="set_number(this.value)">7</button>
      <button value='8' onclick="set_number(this.value)">8</button>
      <button value='9' onclick="set_number(this.value)">9</button>
      <button value='=' class="key--equal" onclick="result()">=</button>
      <button value='5' onclick="set_number(this.value)">5</button>
      <button value='6' onclick="set_number(this.value)">6</button>
      <button value='4' onclick="set_number(this.value)">4</button>
      <button value='1' onclick="set_number(this.value)">1</button>
      <button value='2' onclick="set_number(this.value)">2</button>
      <button value='3' onclick="set_number(this.value)">3</button>
      <button value='0' onclick="set_number(this.value)">0</button>
      <button value='.' onclick="decimal();">.</button>
      <button value='clear' onclick="remove()">AC</button>
    </div>
  </div>
  <script src="mayTinh.js"></script>
  </body>
</html>
