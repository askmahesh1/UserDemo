angular.module('myApp', []).controller('UserDetailCtrl', function($scope,$http) {
	$http({
		  method: 'GET',
		  url: '/users'
		}).then(function successCallback(response) {
	        $scope.users = response.data;
		  }, function errorCallback(response) {
		    // called asynchronously if an error occurs
		    // or server returns response with an error status.
	});
});