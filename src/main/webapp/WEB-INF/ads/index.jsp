<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>
    <button>Click For More Details</button>
    <c:forEach var="ad" items="${ads}">
        <div class="col-md-6">
            <h2>${ad.park_name}</h2>
            <p>${ad.description}</p>
            <form action="/ads" method="get">
                <button>Click For More Details</button>
            </form>
        </div>
    </c:forEach>
</div>
</body>
</html>
