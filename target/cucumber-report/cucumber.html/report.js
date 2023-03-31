$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/HomePage.feature");
formatter.feature({
  "line": 2,
  "name": "Test the functionality of viabledata",
  "description": "\r\nAs a user I should navigate to Careers Page",
  "id": "test-the-functionality-of-viabledata",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13332041400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User to navigate to Careers Page",
  "description": "",
  "id": "test-the-functionality-of-viabledata;user-to-navigate-to-careers-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User is on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User to click on main tab",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User to click on any of the lists",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User to verify \"CAREERS\" page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 517517700,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdefs.userToClickOnMainTab()"
});
formatter.result({
  "duration": 553680500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepdefs.userToClickOnAnyOfTheLists()"
});
formatter.result({
  "duration": 1511819700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "CAREERS",
      "offset": 16
    }
  ],
  "location": "HomePageStepdefs.userToVerifyPage(String)"
});
formatter.result({
  "duration": 125412400,
  "status": "passed"
});
formatter.after({
  "duration": 1759913300,
  "status": "passed"
});
});