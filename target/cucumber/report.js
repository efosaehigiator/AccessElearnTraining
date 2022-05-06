$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("LogIn.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I want to be able to log in",
  "description": "",
  "id": "login;as-a-user-i-want-to-be-able-to-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SignIn"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "I am on the Landing Page of http://automationpractice.com/index.php",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the \"signIn\" button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter my emailAddress and Password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign in Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should be signed in  and a logout button should be visible",
  "keyword": "Then "
});
formatter.match({
  "location": "LogInSteps.i_am_on_the_Landing_Page_of_http_automationpractice_com_index_php()"
});
formatter.result({
  "duration": 3984475600,
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
  "duration": 2225355400,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.i_enter_my_emailAddress_and_Password()"
});
formatter.result({
  "duration": 305303400,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.i_click_on_Sign_in_Button()"
});
formatter.result({
  "duration": 1561122300,
  "status": "passed"
});
formatter.match({
  "location": "LogInSteps.i_should_be_signed_in_and_a_logout_button_should_be_visible()"
});
formatter.result({
  "duration": 138863200,
  "error_message": "org.openqa.selenium.InvalidSelectorException: Given xpath expression \"//*[@id\u003d\"header\"]/div[2]/div/div/nav/div[2]/\" is invalid: SyntaxError: Document.evaluate: The expression is not a legal expression\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-M3B29I87\u0027, ip: \u0027192.168.1.137\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities {acceptInsecureCerts: true, browserName: firefox, browserVersion: 100.0, capabilities: {desiredCapabilities: {acceptInsecureCerts: true, browserName: firefox}}, javascriptEnabled: true, moz:accessibilityChecks: false, moz:buildID: 20220428192727, moz:headless: false, moz:processID: 28288, moz:profile: C:\\Users\\efost\\AppData\\Loca..., moz:shutdownTimeout: 60000, moz:useNonSpecCompliantPointerOrigin: false, moz:webdriverClick: true, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, platformVersion: 10.0, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 12a98ac7-a55a-4359-9e60-3bbef9b4c5be\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"header\"]/div[2]/div/div/nav/div[2]/}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.LogInPage.ValidateSignOutButton(LogInPage.java:40)\r\n\tat steps.LogInSteps.i_should_be_signed_in_and_a_logout_button_should_be_visible(LogInSteps.java:39)\r\n\tat ✽.Then I should be signed in  and a logout button should be visible(LogIn.feature:8)\r\n",
  "status": "failed"
});
});