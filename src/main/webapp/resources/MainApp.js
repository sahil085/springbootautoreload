var mainApp = angular.module("MainApp", ['ngRoute']);

mainApp.config(
    ['$routeProvider', '$locationProvider',function ($routeProvider, $locationProvider) {

        $routeProvider.when('/user', {
            tittle:'user',
            templateUrl: 'user/user.jsp',
            contoller :'studentcontroller'
        });

        $locationProvider.hashPrefix('!');
    }]);

mainApp.controller("mainController",function ($scope,$http) {


        $http.get('/getdetail').success( function(response) {
            $scope.details = response;
        });




});


mainApp.controller("dashboardcontroller",function ($scope,$http,$location,$window) {
$scope.data={};
    $http({
        method: 'GET',
        url: '/getadmin'
    }).then(function (response){
        $scope.data=response.data;
console.log($scope.data);

    },function (error){

    });

    $scope.getdata = function () {

        $http({
            method: 'GET',
            url: '/getdata'
        }).then(function (response){
            $scope.data=response.data;
            console.log($scope.data);

        },function (error){

        });
    };

    $scope.sendrequest = function (id) {

        $http({
            method: 'POST',
            url: '/sendfrndrqst',
            data: id,
            dataType: "json"
        }).then(function (response){

            console.log(response);
            $scope.data=response.data;
            console.log($scope.data);

        },function (error){

        });
    };

});