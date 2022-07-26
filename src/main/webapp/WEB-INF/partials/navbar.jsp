<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" style="font-family: 'Roboto Light'" href="/home">Texas Parks</a>
        </div>
        <ul class="nav navbar-nav navbar-right">

            <c:choose>
                <c:when test="${sessionScope['user'] != null}">
                <li><a href="${pageContext.request.contextPath}/ads">ADS</a></li>
                <li><a href="${pageContext.request.contextPath}/ads/create">Create Ads</a></li>
                <li><a href="${pageContext.request.contextPath}/profile">Profile</a></li>
                <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>

                </c:when>
                <c:otherwise>
                    <li><a href="${pageContext.request.contextPath}/ads">ADS</a></li>
                    <li><a href="${pageContext.request.contextPath}/login">Login</a></li>
                    <li><a href="${pageContext.request.contextPath}/register">Register</a></li>
                </c:otherwise>

            </c:choose>
        </ul>

    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>
