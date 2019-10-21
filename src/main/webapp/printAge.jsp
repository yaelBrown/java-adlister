<%--
  Created by IntelliJ IDEA.
  User: yaelBrown
  Date: 10/21/19
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Print the age</title>
    <style>
        h1 {
            color: green;
        }
    </style>
</head>
<body>
    <%-- Prints whatever is passed as the parameter of age from the form in age.jsp  --%>
    <h1>Age entered was <%= request.getParameter("age") %></h1>
</body>
</html>
