<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
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

    <script src= "https://code.jquery.com/jquery-3.2.1.min.js"> </script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <script src= "https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"> </script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-route.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-resource.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular-cookies.js"></script>

    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" > </script>
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
<sec:authorize access="isAuthenticated()">



</sec:authorize>

<body>
<div ng-app="MainApp" ng-controller="dashboardcontroller">

    Send request to user b
     <button type="button" ng-click="sendrequest(3)">Send Request</button>
<%--<div ng-view>--%>

<%--</div>--%>
    <div ng-repeat="(key,value) in data">
    {{ key }}  {{ value }}
</div>

    <button type="button" ng-click="getdata()">get</button>
</div>






<%--<sec:authorize access="isAuthenticated()">--%>
<%--<div  ng-controller="dashboardcontroller"></div>--%>

    <button><a href="/logout" >logout</a></button>
<%--</sec:authorize>--%>
<%--<sec:authorize access="hasAuthority('ADMIN')">--%>
    <%--<h1> Radhe krishna admin</h1>--%>

<%--</sec:authorize>--%>
<%--<sec:authorize access="hasAuthority('USER')">--%>
    <%--<h1>Hare Krishna</h1>--%>
<%--</sec:authorize>--%>




</body>

</html>
