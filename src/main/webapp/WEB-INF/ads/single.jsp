<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${ad.title}</title>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Single Ads" />
    </jsp:include>
</head>
<body>

<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <div class="col-md-6 justify-content-center">
        <h1> Park Name: ${ads.park_name} </h1>
        <h3> Description: ${ads.description}</h3>
    </div>
</div>
</body>
</html>
