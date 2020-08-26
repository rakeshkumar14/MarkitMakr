$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/MMCC/CheckEventListing.feature");
formatter.feature({
  "name": "Event Listings provides a list of companies that participate in a particular Event Edition.",
  "description": "A single Event listing is a version of a company profile that is specific to that Event Edition.\nThe company profile provides a description of a company that participate in a particular Event.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": ": Edit the event listing detials",
  "description": "  Check the details are updated on EVent listing View page in MMCC\n  Check the event listing details on Client sites.",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "Open the client site",
  "keyword": "And "
});
formatter.step({
  "name": "Catelouge Page is display",
  "keyword": "Then "
});
formatter.step({
  "name": "Input the exhibitor to search",
  "keyword": "And "
});
formatter.step({
  "name": "Click Search button",
  "keyword": "And "
});
formatter.step({
  "name": "Click the first exhibitor link",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"Client Telephone\" is correct expected is \"\u003cPhone\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"Client Country\" is correct expected is \"\u003cCountry\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"Client Fax\" is correct expected is \"\u003cFax\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"Client Email\" is correct expected is \"\u003cEmail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"Client StreetAddress1\" is correct expected is \"\u003cStreetAddress1\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "eventListing",
        "Country",
        "City",
        "StreetAddress1",
        "ZipCode",
        "Phone",
        "Fax",
        "Email",
        "Website",
        "FBLink",
        "InstaLink",
        "LinkedLink",
        "TwiterLink",
        "YoutubLink"
      ]
    },
    {
      "cells": [
        "Idemia",
        "India",
        "Kolkata",
        "Street Address Example",
        "700156",
        "+919899877654",
        "+987654321",
        "rakesh.kumar.in@informa.com",
        "https://www.idemia.com/",
        "https://www.facebook.com/IdemiaGroup/",
        "https://www.instagram.com/idemiagroup/",
        "https://www.linkedin.com/company/idemiagroup/",
        "https://twitter.com/IdemiaGroup",
        "https://www.youtube.com/IDEMIA"
      ]
    }
  ]
});
formatter.scenario({
  "name": ": Edit the event listing detials",
  "description": "  Check the details are updated on EVent listing View page in MMCC\n  Check the event listing details on Client sites.",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Open the client site",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.open_Clientsite()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Catelouge Page is display",
  "keyword": "Then "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.page_is_Displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Input the exhibitor to search",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.input_Exhibitor_To_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Search button",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.I_Press_Search_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the first exhibitor link",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.openfirstExhibitor()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Client Telephone\" is correct expected is \"+919899877654\"",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.verify_Label_Text_At_clientsite(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Client Country\" is correct expected is \"India\"",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.verify_Label_Text_At_clientsite(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Client Fax\" is correct expected is \"+987654321\"",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.verify_Label_Text_At_clientsite(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Client Email\" is correct expected is \"rakesh.kumar.in@informa.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.verify_Label_Text_At_clientsite(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Client StreetAddress1\" is correct expected is \"Street Address Example\"",
  "keyword": "And "
});
formatter.match({
  "location": "net.serenity.bdd.junit.cucumber.stepDef.CheckEventListingStepDef.verify_Label_Text_At_clientsite(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});