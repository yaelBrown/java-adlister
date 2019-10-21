<%--
  Created by IntelliJ IDEA.
  User: yaelBrown
  Date: 10/21/19
  Time: 10:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Enter your age</title>
</head>
<body>

    <h1>What is your age?</h1>
    <form action="/printAge.jsp" method="POST">
        <label for="age">Enter number: </label>
        <input type="number" name="age" id="age">
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>

</body>
</html>