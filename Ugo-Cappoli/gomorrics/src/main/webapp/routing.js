var pagePath = "./app/pages";

app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
      templateUrl : pagePath +"/home/home.html",
      controller : 'home.controller'
    });
  });