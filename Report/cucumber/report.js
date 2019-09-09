$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/HandsOn/Workspace/CUCUTEST/src/test/FEATURES/CUCU.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "i am on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTEST.i_am_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter username as \"Admin\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTEST.i_enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password as \"Password456\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTEST.i_enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "i click on login",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTEST.i_click_on_login()"
});
formatter.result({
  "status": "passed"
});
});