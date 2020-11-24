$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/qa/features/freecrm.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM application Test",
  "description": "",
  "id": "free-crm-application-test",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Free CRM home page test",
  "description": "",
  "id": "free-crm-application-test;validate-free-crm-home-page-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@BDDPOM"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user open browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "validate homepage title",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.user_open_browser()"
});
formatter.result({
  "duration": 13246222400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_is_on_login_page()"
});
formatter.result({
  "duration": 91132200,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 8876924400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_homepage_title()"
});
formatter.result({
  "duration": 6036939800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.validate_logged_in_username()"
});
formatter.result({
  "duration": 72156000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_close_the_browser()"
});
formatter.result({
  "duration": 926542200,
  "status": "passed"
});
});