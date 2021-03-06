Feature:  Hotel Booking In Adactin Application
#Scenario: Login Module
@smoke
Scenario Outline: Login Module
Given User Launch The Application
#When User Enter The "Madhan1020" In Username Field
#And User Enter The "Madhan@1020" In Password Field
When User Enter The "<username>" In Username Field
And User Enter The "<password>" In Password Field
Then User Click On The Login Button And It Navigate To Search Hotel Page

Examples:
|username|password|
|abc|123|
|abcde|12345|
|Madhan1020|Madhan@1020|
 @sanity
 Scenario: Search Module
 When User Select The Location In Location Field
 And  User Select The Hotel In Hotel Field
 And User Select The Room Type In Room Type Field
 And User Select The Number Of Room In Number Of Room Field
 And User Enter The In Date In Check In Date Field
 And User Enter The Out Date In Check Out Date Field
 And User Select The Adult Per Room In Adult Per Room
 And User Select The Children Per Room In Children Per Room
 Then User Click On the Search Button And It Navigate To Continue Page
 @sanity
 Scenario: Continue Module
 When User Click on The Select In Select Field
 Then User Click On The Continue Button and It Navigate To Book Now Page
 
# Scenario: Book Now Module
@sanity
 Scenario Outline: Book Now Module
 When User Enter The Firstname In Firstname Field
 And User Enter The Lastname In Lastname Field
 And User Enter The Address In Billing Address Field
 And User Enter The "<creditcardno>" In Credit Card No Field
# And User Enter The Credit Card No In Credit Card No Field
 And User Select The Credit Card Type In Credit Card Type Field
 And User Select The Month In Expiry Date Field
 And USer Select The Year In Expiry Date Field
 And User Enter The CVV Number In CVV Number Field
 Then User Click On The Book Now Button And It Navigate to Logout Page
 Examples:
 |creditcardno|
 |123456789|
 |abcgdhsjsjsj|
 |1234567891234567|
 @regression
 Scenario: Logout Module
 When User Click On The Logout Button