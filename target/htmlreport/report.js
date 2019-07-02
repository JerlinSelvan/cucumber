$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/jerlinEg5.feature");
formatter.feature({
  "name": "search multiple item",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search for products",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user searches for products",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "travel kit"
      ]
    },
    {
      "cells": [
        "headphone"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "JerlinSample5.user_searches_for_products(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products displayed",
  "keyword": "And "
});
formatter.match({
  "location": "JerlinSample5.verify_products_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Close application",
  "keyword": "Then "
});
formatter.match({
  "location": "JerlinSample5.close_application()"
});
formatter.result({
  "status": "passed"
});
});