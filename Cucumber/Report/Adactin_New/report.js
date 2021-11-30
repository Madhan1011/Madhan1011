$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 2,
      "value": "#Scenario: Login Module"
    }
  ],
  "line": 4,
  "name": "Login Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-module",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When User Enter The \"Madhan1020\" In Username Field"
    },
    {
      "line": 7,
      "value": "#And User Enter The \"Madhan@1020\" In Password Field"
    }
  ],
  "line": 8,
  "name": "User Enter The \"\u003cusername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"\u003cpassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-module;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;login-module;;1"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;login-module;;2"
    },
    {
      "cells": [
        "abcde",
        "12345"
      ],
      "line": 15,
      "id": "hotel-booking-in-adactin-application;login-module;;3"
    },
    {
      "cells": [
        "Madhan1020",
        "Madhan@1020"
      ],
      "line": 16,
      "id": "hotel-booking-in-adactin-application;login-module;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Login Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-module;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When User Enter The \"Madhan1020\" In Username Field"
    },
    {
      "line": 7,
      "value": "#And User Enter The \"Madhan@1020\" In Password Field"
    }
  ],
  "line": 8,
  "name": "User Enter The \"abc\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 4550748700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 534040200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 289367800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3739309200,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Login Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-module;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When User Enter The \"Madhan1020\" In Username Field"
    },
    {
      "line": 7,
      "value": "#And User Enter The \"Madhan@1020\" In Password Field"
    }
  ],
  "line": 8,
  "name": "User Enter The \"abcde\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"12345\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 588945100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcde",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 325916000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 240367700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4203211700,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;login-module;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "comments": [
    {
      "line": 6,
      "value": "#When User Enter The \"Madhan1020\" In Username Field"
    },
    {
      "line": 7,
      "value": "#And User Enter The \"Madhan@1020\" In Password Field"
    }
  ],
  "line": 8,
  "name": "User Enter The \"Madhan1020\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User Enter The \"Madhan@1020\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User Click On The Login Button And It Navigate To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 497968500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Madhan1020",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 332345300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Madhan@1020",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 251257500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigate_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 7606475000,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Search Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;search-module",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User Select The Location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "User Select The Hotel In Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User Select The Room Type In Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "User Select The Number Of Room In Number Of Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "User Enter The In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "User Enter The Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "User Select The Adult Per Room In Adult Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "User Select The Children Per Room In Children Per Room",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "User Click On the Search Button And It Navigate To Continue Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_In_Location_Field()"
});
formatter.result({
  "duration": 509469200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_In_Hotel_Field()"
});
formatter.result({
  "duration": 361605300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_In_Room_Type_Field()"
});
formatter.result({
  "duration": 346537300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Room_In_Number_Of_Room_Field()"
});
formatter.result({
  "duration": 654299100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 270086200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 268407300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adult_Per_Room_In_Adult_Per_Room()"
});
formatter.result({
  "duration": 627861200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room_In_Children_Per_Room()"
});
formatter.result({
  "duration": 538205300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_the_Search_Button_And_It_Navigate_To_Continue_Page()"
});
formatter.result({
  "duration": 9144595100,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "Continue Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;continue-module",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 28,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 30,
  "name": "User Click on The Select In Select Field",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "User Click On The Continue Button and It Navigate To Book Now Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_on_The_Select_In_Select_Field()"
});
formatter.result({
  "duration": 227245000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_and_It_Navigate_To_Book_Now_Page()"
});
formatter.result({
  "duration": 1304956400,
  "status": "passed"
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 33,
      "value": "# Scenario: Book Now Module"
    }
  ],
  "line": 35,
  "name": "Book Now Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-now-module",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Enter The Firstname In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Enter The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Enter The \"\u003ccreditcardno\u003e\" In Credit Card No Field",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "# And User Enter The Credit Card No In Credit Card No Field"
    }
  ],
  "line": 41,
  "name": "User Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User Select The Month In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "USer Select The Year In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User Click On The Book Now Button And It Navigate to Logout Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 46,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-now-module;",
  "rows": [
    {
      "cells": [
        "creditcardno"
      ],
      "line": 47,
      "id": "hotel-booking-in-adactin-application;book-now-module;;1"
    },
    {
      "cells": [
        "123456789"
      ],
      "line": 48,
      "id": "hotel-booking-in-adactin-application;book-now-module;;2"
    },
    {
      "cells": [
        "abcgdhsjsjsj"
      ],
      "line": 49,
      "id": "hotel-booking-in-adactin-application;book-now-module;;3"
    },
    {
      "cells": [
        "1234567891234567"
      ],
      "line": 50,
      "id": "hotel-booking-in-adactin-application;book-now-module;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 48,
  "name": "Book Now Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-now-module;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Enter The Firstname In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Enter The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Enter The \"123456789\" In Credit Card No Field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "# And User Enter The Credit Card No In Credit Card No Field"
    }
  ],
  "line": 41,
  "name": "User Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User Select The Month In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "USer Select The Year In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User Click On The Book Now Button And It Navigate to Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Firstname_In_Firstname_Field()"
});
formatter.result({
  "duration": 443331200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 263529500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 348998100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456789",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Credit_Card_No_Field(String)"
});
formatter.result({
  "duration": 279722000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 564812100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 729218400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Year_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 329034200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 261103900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_It_Navigate_to_Logout_Page()"
});
formatter.result({
  "duration": 2281510100,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Book Now Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-now-module;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Enter The Firstname In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Enter The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Enter The \"abcgdhsjsjsj\" In Credit Card No Field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "# And User Enter The Credit Card No In Credit Card No Field"
    }
  ],
  "line": 41,
  "name": "User Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User Select The Month In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "USer Select The Year In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User Click On The Book Now Button And It Navigate to Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Firstname_In_Firstname_Field()"
});
formatter.result({
  "duration": 250611500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 195791500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 405216900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abcgdhsjsjsj",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Credit_Card_No_Field(String)"
});
formatter.result({
  "duration": 167851900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 348467800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 528036700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Year_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 165694100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 195663600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_It_Navigate_to_Logout_Page()"
});
formatter.result({
  "duration": 2254281800,
  "status": "passed"
});
formatter.scenario({
  "line": 50,
  "name": "Book Now Module",
  "description": "",
  "id": "hotel-booking-in-adactin-application;book-now-module;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 34,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "User Enter The Firstname In Firstname Field",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "User Enter The Lastname In Lastname Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User Enter The Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User Enter The \"1234567891234567\" In Credit Card No Field",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 40,
      "value": "# And User Enter The Credit Card No In Credit Card No Field"
    }
  ],
  "line": 41,
  "name": "User Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User Select The Month In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "USer Select The Year In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "User Enter The CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "User Click On The Book Now Button And It Navigate to Logout Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Firstname_In_Firstname_Field()"
});
formatter.result({
  "duration": 320562700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Lastname_In_Lastname_Field()"
});
formatter.result({
  "duration": 199218200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 285500500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567891234567",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Credit_Card_No_Field(String)"
});
formatter.result({
  "duration": 203891100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 353290700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 475981300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Year_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 162570400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 166565000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_It_Navigate_to_Logout_Page()"
});
formatter.result({
  "duration": 2280977500,
  "status": "passed"
});
});