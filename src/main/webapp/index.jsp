<%--JSP Directive--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int counter = 0; %>
<% counter += 1; %>

<html>
    <head>
        <title>Title</title>
    </head>
    <body>
        <h1>The current count is <%= counter %>.</h1>

        View the page source!

        <%-- this is a JSP comment, you will *not* see this in the html --%>

        <!-- this is an HTML comment, you *will* see this in the html -->
        <br>
        <a href="/login.jsp">Goto login.jsp</a>
        <br>
        <a href="/profile.jsp">Goto profile.jsp</a>
        <br>
        <a href="/age.jsp">Goto age.jsp</a>

    </body>
</html>