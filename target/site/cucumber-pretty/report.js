$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("StoreRegistration.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary :"
    },
    {
      "line": 3,
      "value": "#Feature: List of scenarios."
    },
    {
      "line": 4,
      "value": "#Scenario: Business rule through list of steps with arguments."
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 18,
      "value": "#Sample Feature Definition Template"
    },
    {
      "line": 19,
      "value": "#@tag"
    },
    {
      "line": 20,
      "value": "#Feature: Title of your feature"
    },
    {
      "line": 21,
      "value": "#  I want to use this template for my feature file"
    },
    {
      "line": 22,
      "value": "#"
    },
    {
      "line": 23,
      "value": "#  @tag1"
    },
    {
      "line": 24,
      "value": "#  Scenario: Title of your scenario"
    },
    {
      "line": 25,
      "value": "#    Given I want to write a step with precondition"
    },
    {
      "line": 26,
      "value": "#    And some other precondition"
    },
    {
      "line": 27,
      "value": "#    When I complete action"
    },
    {
      "line": 28,
      "value": "#    And some other action"
    },
    {
      "line": 29,
      "value": "#    And yet another action"
    },
    {
      "line": 30,
      "value": "#    Then I validate the outcomes"
    },
    {
      "line": 31,
      "value": "#    And check more outcomes"
    },
    {
      "line": 32,
      "value": "#"
    },
    {
      "line": 33,
      "value": "#  @tag2"
    },
    {
      "line": 34,
      "value": "#  Scenario Outline: Title of your scenario outline"
    },
    {
      "line": 35,
      "value": "#    Given I want to write a step with \u003cname\u003e"
    },
    {
      "line": 36,
      "value": "#    When I check for the \u003cvalue\u003e in step"
    },
    {
      "line": 37,
      "value": "#    Then I verify the \u003cstatus\u003e in step"
    },
    {
      "line": 38,
      "value": "#"
    },
    {
      "line": 39,
      "value": "#    Examples:"
    },
    {
      "line": 40,
      "value": "#      | name  | value | status  |"
    },
    {
      "line": 41,
      "value": "#      | name1 |     5 | success |"
    },
    {
      "line": 42,
      "value": "#      | name2 |     7 | Fail    |"
    }
  ],
  "line": 45,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 44,
      "name": "@RegistrationTesting"
    }
  ]
});
formatter.scenario({
  "line": 47,
  "name": "Create a successful user",
  "description": "",
  "id": "login-action;create-a-successful-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 48,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User Navigates to LogIn Page",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User Navigates to Register Page",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "User enters Email and Password and Repeat Password and Security Question",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User is displayed Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 11319450461,
  "status": "passed"
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_Navigates_to_LogIn_Page()"
});
formatter.result({
  "duration": 3042944862,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.testautomation.PageObjects.StoreSearchPage.navigateToLogin(StoreSearchPage.java:31)\r\n\tat com.testautomation.StepDef.StoreRegistrationStepDef.user_Navigates_to_LogIn_Page(StoreRegistrationStepDef.java:39)\r\n\tat ✽.And User Navigates to LogIn Page(StoreRegistration.feature:49)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_Navigates_to_Register_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_enters_Email_and_Password_and_Repeat_Password_and_Security_Question()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_is_displayed_Login_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 54,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 55,
      "value": "#Given User is on Home Page"
    }
  ],
  "line": 56,
  "name": "User Navigates to LogIn Page",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_Navigates_to_LogIn_Page()"
});
formatter.result({
  "duration": 3000603280,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.click(Unknown Source)\r\n\tat com.testautomation.PageObjects.StoreSearchPage.navigateToLogin(StoreSearchPage.java:31)\r\n\tat com.testautomation.StepDef.StoreRegistrationStepDef.user_Navigates_to_LogIn_Page(StoreRegistrationStepDef.java:39)\r\n\tat ✽.Given User Navigates to LogIn Page(StoreRegistration.feature:56)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_enters_UserName_and_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StoreRegistrationStepDef.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 61,
  "name": "Successful LogOut",
  "description": "",
  "id": "login-action;successful-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 62,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreRegistrationStepDef.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 425241,
  "error_message": "java.lang.NullPointerException\r\n\tat com.testautomation.StepDef.StoreRegistrationStepDef.user_LogOut_from_the_Application(StoreRegistrationStepDef.java:76)\r\n\tat ✽.When User LogOut from the Application(StoreRegistration.feature:62)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StoreRegistrationStepDef.message_displayed_LogOut_Successfully()"
});
formatter.result({
  "status": "skipped"
});
});