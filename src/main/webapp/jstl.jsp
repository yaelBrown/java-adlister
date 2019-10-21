<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: yaelBrown
  Date: 10/21/19
  Time: 12:24
  To change this template use File | Settings | File Templates.

  List of more JSTL tags:
  https://www.tutorialspoint.com/jsp/jsp_standard_tag_library.htm
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
//    Creates an List of Strings with different foods
    List<String> favFoods = Arrays.asList("Pizza", "Pho", "Fried Pies");

//    Sets the attribute to favorite foods
    request.setAttribute("favFoods", favFoods);
%>
<html>
<head>
    <title>JSTL Sandbox</title>
</head>
<body>

<%--Will create a unordered list--%>
<ol>
<%--    Iterate over the set attribute of favFoods and print each food.--%>
<%--    Normal Java forEach loop.--%>
    <c:forEach var="favFood" items="${favFoods}">
        <li>${favFood}</li>
    </c:forEach>
</ol>

</body>
</html>
