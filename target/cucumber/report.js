$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "As a user I want to be able to log in",
  "description": "",
  "id": "login;as-a-user-i-want-to-be-able-to-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SignIn"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on the Landing Page of http://automationpractice.com/index.php",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the \"signIn\" button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter my emailAddress and Password",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on Sign in Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should be signed in  and a logout button should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.i_am_on_the_Landing_Page_of_http_automationpractice_com_index_php()"
});
formatter.result({
  "duration": 5588022100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "signIn",
      "offset": 16
    }
  ],
  "location": "LogInSteps.i_click_on_the_button(String)"
});
formatter.result({
  "duration": 1969676800,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.i_enter_my_emailAddress_and_Password()"
});
formatter.result({
  "duration": 215218500,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.i_click_on_Sign_in_Button()"
});
formatter.result({
  "duration": 1956474600,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.i_should_be_signed_in_and_a_logout_button_should_be_visible()"
});
formatter.result({
  "duration": 5073353400,
  "status": "passed"
});
});