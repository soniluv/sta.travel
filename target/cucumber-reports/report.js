$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Tour.feature");
formatter.feature({
  "line": 1,
  "name": "Tour",
  "description": "\r\nAs an end user\r\nI want to select the travel options\r\nSo That I can see all the results displayed",
  "id": "tour",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 10,
  "name": "User can successfully see all the tour results displayed",
  "description": "",
  "id": "tour;user-can-successfully-see-all-the-tour-results-displayed",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user selects destination \"\u003ccountry\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"Find a Tour\" button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user could see the tour options displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user change the sort order on the search results to “Price (Low-High)\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on \"View More\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user could see more and all the results displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "tour;user-can-successfully-see-all-the-tour-results-displayed;",
  "rows": [
    {
      "cells": [
        "country"
      ],
      "line": 18,
      "id": "tour;user-can-successfully-see-all-the-tour-results-displayed;;1"
    },
    {
      "cells": [
        "India"
      ],
      "line": 19,
      "id": "tour;user-can-successfully-see-all-the-tour-results-displayed;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9520113585,
  "status": "passed"
});
formatter.background({
  "line": 7,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 8,
  "name": "user is on the tours page",
  "keyword": "Given "
});
formatter.match({
  "location": "TourStepDefs.user_is_on_the_tours_page()"
});
formatter.result({
  "duration": 294196536,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "User can successfully see all the tour results displayed",
  "description": "",
  "id": "tour;user-can-successfully-see-all-the-tour-results-displayed;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 11,
  "name": "user selects destination \"India\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on \"Find a Tour\" button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user could see the tour options displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user change the sort order on the search results to “Price (Low-High)\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on \"View More\" button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user could see more and all the results displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "India",
      "offset": 26
    }
  ],
  "location": "TourStepDefs.user_selects_destination(String)"
});
formatter.result({
  "duration": 8573424794,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Find a Tour",
      "offset": 10
    }
  ],
  "location": "TourStepDefs.click_on_button(String)"
});
formatter.result({
  "duration": 2853689682,
  "status": "passed"
});
formatter.match({
  "location": "TourStepDefs.user_could_see_the_tour_options_displayed()"
});
formatter.result({
  "duration": 34642022,
  "status": "passed"
});
formatter.match({
  "location": "TourStepDefs.user_change_the_sort_order_on_the_search_results_to_Price_Low_High()"
});
formatter.result({
  "duration": 3193703239,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "View More",
      "offset": 10
    }
  ],
  "location": "TourStepDefs.click_on_button(String)"
});
formatter.result({
  "duration": 249105243,
  "status": "passed"
});
formatter.match({
  "location": "TourStepDefs.user_could_see_more_and_all_the_results_displayed()"
});
formatter.result({
  "duration": 81077856,
  "status": "passed"
});
formatter.write("Closing Scenario");
formatter.after({
  "duration": 2695246424,
  "status": "passed"
});
});