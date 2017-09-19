$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/TestScenarios/Sprint3.feature");
formatter.feature({
  "line": 3,
  "name": "JIRA Story 3",
  "description": "",
  "id": "jira-story-3",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@Sprint3"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login Demo Application with multiple times",
  "description": "",
  "id": "jira-story-3;login-demo-application-with-multiple-times",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario1"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open Demo website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter Login Details \"\u003cusername\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify Home page and verify title",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "jira-story-3;login-demo-application-with-multiple-times;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 14,
      "id": "jira-story-3;login-demo-application-with-multiple-times;;1"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 15,
      "id": "jira-story-3;login-demo-application-with-multiple-times;;2"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 16,
      "id": "jira-story-3;login-demo-application-with-multiple-times;;3"
    },
    {
      "cells": [
        "mercury",
        "mercury"
      ],
      "line": 17,
      "id": "jira-story-3;login-demo-application-with-multiple-times;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3445986410,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Demo Application with multiple times",
  "description": "",
  "id": "jira-story-3;login-demo-application-with-multiple-times;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario1"
    },
    {
      "line": 2,
      "name": "@Sprint3"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open Demo website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter Login Details \"mercury\" \"mercury\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify Home page and verify title",
  "keyword": "Then "
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Open_Demo_website()"
});
formatter.result({
  "duration": 98093867,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 21
    },
    {
      "val": "mercury",
      "offset": 31
    }
  ],
  "location": "TC02_LoginFlow_StepDef2.Enter_Login_Details(String,String)"
});
formatter.result({
  "duration": 2596330978,
  "status": "passed"
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Click_submit_button()"
});
formatter.result({
  "duration": 78654260,
  "status": "passed"
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Verify_Home_page_and_verify_title()"
});
formatter.result({
  "duration": 19158468,
  "status": "passed"
});
formatter.after({
  "duration": 781850478,
  "status": "passed"
});
formatter.before({
  "duration": 2040092105,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login Demo Application with multiple times",
  "description": "",
  "id": "jira-story-3;login-demo-application-with-multiple-times;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario1"
    },
    {
      "line": 2,
      "name": "@Sprint3"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open Demo website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter Login Details \"mercury\" \"mercury\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify Home page and verify title",
  "keyword": "Then "
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Open_Demo_website()"
});
formatter.result({
  "duration": 490068,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 21
    },
    {
      "val": "mercury",
      "offset": 31
    }
  ],
  "location": "TC02_LoginFlow_StepDef2.Enter_Login_Details(String,String)"
});
formatter.result({
  "duration": 2617621261,
  "status": "passed"
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Click_submit_button()"
});
formatter.result({
  "duration": 69296417,
  "status": "passed"
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Verify_Home_page_and_verify_title()"
});
formatter.result({
  "duration": 17465040,
  "status": "passed"
});
formatter.after({
  "duration": 700884065,
  "status": "passed"
});
formatter.before({
  "duration": 1990773380,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Login Demo Application with multiple times",
  "description": "",
  "id": "jira-story-3;login-demo-application-with-multiple-times;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@Scenario1"
    },
    {
      "line": 2,
      "name": "@Sprint3"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "Open Demo website",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Enter Login Details \"mercury\" \"mercury\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Click submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Verify Home page and verify title",
  "keyword": "Then "
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Open_Demo_website()"
});
formatter.result({
  "duration": 994431,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mercury",
      "offset": 21
    },
    {
      "val": "mercury",
      "offset": 31
    }
  ],
  "location": "TC02_LoginFlow_StepDef2.Enter_Login_Details(String,String)"
});
formatter.result({
  "duration": 2598471222,
  "status": "passed"
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Click_submit_button()"
});
formatter.result({
  "duration": 63001408,
  "status": "passed"
});
formatter.match({
  "location": "TC02_LoginFlow_StepDef2.Verify_Home_page_and_verify_title()"
});
formatter.result({
  "duration": 19520613,
  "status": "passed"
});
formatter.after({
  "duration": 700044315,
  "status": "passed"
});
});