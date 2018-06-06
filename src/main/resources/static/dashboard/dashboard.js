
mainApp.controller("dashboardcontroller",function ($scope,$http,$location,$window) {

   $http.get("/getadmin").success(function (response) {

$scope.data=response;
   });

});