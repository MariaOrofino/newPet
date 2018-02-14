
var myApp = angular.module('myApp',[]); 

myApp.controller('MyController', ['$scope', '$http', function($scope, $http) {
     

    $scope.getMadlib1 = function() {
        $http({
              url: '/madlib1',
              method: 'GET',
              transformResponse: [function (data) {
                    $scope.madlib1 = data;
              }]
            });
    }     

    $scope.save = function() {         

        // you will need to call each variable's scope method to pass the user input to the mad lib
        // We have given you two examples for exclamation1 and adjective1, you will need to complete for the rest of the variables you defined in the other excerices.
        // Complete Quiz 4 for additional code snippets

        var data = {  
                exclamation1: $scope.exclamation1,
                adjective1: $scope.adjective1, 
                nounOrObject: $scope.nounOrObject,
                periodOfTime1: $scope.periodOfTime1,
                adjective2: $scope.adjective2,
                periodOfTime2: $scope.periodOfTime2,
                person1: $scope.person1,
                noun1: $scope.noun1,
                noun2: $scope.noun2,
                groupOfPeople1: $scope.groupOfPeople1,
                groupOfPeople2: $scope.groupOfPeople2,
                adjective3: $scope.adjective3,
                twoPeople: $scope.twoPeople,
                noun3: $scope.noun3,
                noun4: $scope.noun4,
                typeOfCamp: $scope.typeOfCamp,
                adjective4: $scope.adjective4,
                adjective5: $scope.adjective5,
                expressionOfAffection: $scope.expressionOfAffection,
                person2: $scope.person2,
                noun5: $scope.noun5
        	};
                // End your code above this line      

        $http.post('/saveWords', data).
            success(function(response) {
                $scope.response = response;
                $scope.getMadlib1();
            });
    } 

}]);
