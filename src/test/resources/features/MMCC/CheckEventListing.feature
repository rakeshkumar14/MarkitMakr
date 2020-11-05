@Smoke
Feature: Event Listings provides a list of companies that participate in a particular Event Edition.
A single Event listing is a version of a company profile that is specific to that Event Edition.
The company profile provides a description of a company that participate in a particular Event.
 


@Smoke
Scenario Outline:: Edit the event listing detials
  Check the details are updated on EVent listing View page in MMCC
  Check the event listing details on Client sites.
#Given EventListing tab is avialble on left menu 
#When input "<eventListing>" text in "Search EventListing" field
#And I Click the "Search Button" field
#And I open first event listing
#And Click the "<eventListing>" link
#And I click Edit Event Listing link
#And Get the selected option from "Package Name" drop-down on edit page
#And Get the value from "Booth id" field
#And Get the Package Name on edit page
#And Get the Booth id on edit Page
#And I Input "https://www.facebook.com/IdemiaGroup/" in "Facebook Social" text field
#And I Input "https://www.instagram.com/idemiagroup/" in "Instagram Social" text field
#And I Input "https://www.linkedin.com/company/idemiagroup/" in "Linkedin Social" text field
#And I Input "https://twitter.com/IdemiaGroup" in "Twitter Social" text field
#And I Input "https://www.youtube.com/IDEMIA" in "Youtube Social" text field
#And Select an option "<county>" from "Country" drop-down
#And I Input "<city>" in "City" text field
#And I Input "Street Address Example" in "Street Address1" text field
#And I Input "700156" in "Zip Code" text field
#And I Input "+919899877654" in "Phone" text field
#And I Input "+987654321" in "Fax" text field
#And I Input "rakesh.kumar.in@informa.com" in "Email" text field
#And I Input "https://www.idemia.com/" in "Website" text field
#And Get the value from "Display Name" field
#And Get the Display Name on edit page
#And I Click the "Save Button" field
#And Click the Save button
#And Get the Package Name on view Page
#And Get the Booth id on view Page
#Then PackageName must be same
And Open the client site
Then Catelouge Page is display
And Input the exhibitor to search
#And Click Search button
#And Click the first exhibitor link 
#And Get the facebook link URL
#And Get the "Client Facebook social" URL
#And Get the "Client Instagram social" URL
#And verify "Client Telephone" is correct expected is "<Phone>"
#And verify "Client Country" is correct expected is "<Country>"
#And verify "Client Fax" is correct expected is "<Fax>"
#And verify "Client Email" is correct expected is "<Email>"
#And verify "Client StreetAddress1" is correct expected is "<StreetAddress1>"
#And verify "Client City" is correct expected is "<City>"
#And verify "Client ZipCode" is correct expected is "<ZipCode>"
#And verify "Client SalesPackage" is correct expected is "<Country>"
#Then verify "Client Website" URL is correct expected is "<Website>"
#Then verify "Client Instagram social" URL is correct expected is "<InstaLink>"
#Then verify "Client Facebook social" URL is correct expected is "<FBLink>"
#Then verify "Client Linkedin social" URL is correct expected is "<LinkedLink>"
#Then verify "Client Twiter social" URL is correct expected is "<TwiterLink>"
#Then verify "Client Youtube social" URL is correct expected is "<YoutubLink>



Examples:
|eventListing|Country|City|StreetAddress1|ZipCode|Phone|Fax|Email|Website|FBLink|InstaLink|LinkedLink|TwiterLink|YoutubLink|
|Idemia|India|Kolkata|Street Address Example|700156|+919899877654|+987654321|rakesh.kumar.in@informa.com|https://www.idemia.com/|https://www.facebook.com/IdemiaGroup/|https://www.instagram.com/idemiagroup/|https://www.linkedin.com/company/idemiagroup/|https://twitter.com/IdemiaGroup|https://www.youtube.com/IDEMIA|