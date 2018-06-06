<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sahil
  Date: 13/5/18
  Time: 1:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src = "/resources/js/angular.min.js"></script>
    <script src = "/resources/js/angular-route.js"></script>

    <script src="/resources/MainApp.js"></script>
    <script src="/user/StudentController.js"></script>
</head>

<style>
    table, th , td {
        border: 1px solid grey;
        border-collapse: collapse;
        padding: 5px;
    }

    table tr:nth-child(odd) {
        background-color: #f2f2f2;
    }

    table tr:nth-child(even) {
        background-color: #ffffff;
    }
</style>

</head>

<body>
<h2>AngularJS Sample Application</h2>



    <c:url var="loginUrl" value="/login" />
    <form action="${loginUrl}" method="post" class="form-horizontal">
        <c:if test="${param.error != null}">
        <div class="alert alert-danger">
            <p>Invalid username and password.</p>
        </div>
        </c:if>
        <c:if test="${param.logout != null}">
        <div class="alert alert-success">
            <p>You have been logged out successfully.</p>
        </div>
        </c:if>
        username : <input type="text" name="username"><br/>
        password : <input type="password" name="password"><br/>
        <input type="submit" value="login">
    </form>

</div>


</body>
</html>
