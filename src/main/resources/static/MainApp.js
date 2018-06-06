var mainApp = angular.module("MainApp", ['ngRoute']);


mainApp.config(['$routeProvider', function($routeProvider) {
    alert("route");
    $routeProvider.

    when('/user', {
        templateUrl: 'user.jsp'
    }).

    when('/viewStudents', {
        templateUrl: 'viewStudents.htm', controller: 'ViewStudentsController'
    }).

    otherwise({
        redirectTo: '/addStudent'
    });

}]);

mainApp.controller("mainController",function ($scope,$http) {


        $http.get('/getdetail').success( function(response) {
            $scope.details = response;
        });


});