<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yaelBrown
  Date: 10/22/19
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <c: forEach var="ad" items="${ads}">
            <div class="ad" style="margin-top: 1em;">
                <h3>${ad.id} ${ad.UserId} ${ad.Title}</h3>
                <p>${ad.description}</p>
            </div>
        </c:>

    </body>
</html>