<%--
  Created by IntelliJ IDEA.
  User: lineishagibson
  Date: 7/20/22
  Time: 5:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/navbar.jsp"> </jsp:include>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Ad Details" />
    </jsp:include>
</head>
<body>
<h1>Ad Details</h1>
<%--<ul>--%>
<%--    <c:forEach items="${ads}" var="">--%>
<%--        <li><c:out value="${ads.}" /></li>--%>
<%--    </c:forEach>--%>
<%--</ul>--%>
<form method="post">

    <button>Add</button>
</form>

</body>
</html>
