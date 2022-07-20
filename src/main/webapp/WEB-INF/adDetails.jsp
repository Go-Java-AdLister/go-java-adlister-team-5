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
    <title>Ad Details</title>
</head>
<body>
<h1>Ad Details</h1>
<%--<ul>--%>
<%--    <c:forEach items="${ads}" var="">--%>
<%--        <li><c:out value="${ads.}" /></li>--%>
<%--    </c:forEach>--%>
<%--</ul>--%>
<form method="post">
    <label for="title">Title</label>
    <input id="title" type="text" placeholder="enter title">
    <label for="park_name">Park Name</label>
    <input id="park_name" type="text" placeholder="enter park name">
    <label for="description">Description</label>
    <input id="description" type="text" placeholder="enter description">
    <label for="elevation">Elevation</label>
    <input id="elevation" type="text" placeholder="enter elevation">
    <label for="hike_distance">Hike Distance</label>
    <input id="hike_distance" type="text" placeholder="enter hike distance">
    <label for="max_occupancy">Max Occupancy</label>
    <input id="max_occupancy" type="text" placeholder="enter max occupancy">
    <button>Add</button>
</form>

</body>
</html>
