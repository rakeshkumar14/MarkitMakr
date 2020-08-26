package net.serenity.bdd.junit.cucumber.steps;
import net.serenity.bdd.junit.cucumber.pages.ClientHomePage;
import net.serenity.bdd.junit.cucumber.pages.CommanAppObject;
import net.serenity.bdd.junit.cucumber.pages.LoginPage;
import net.serenity.bdd.junit.cucumber.pages.ViewEventListingPage;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ViewEventListingSteps extends ScenarioSteps{
	
	String editPackageName, editboothID,viewBoothID,viewPackageName, eddisplayName,fbURLAct, fblinkURL,linkURLActual;
	ViewEventListingPage vieweventListingpage;
	LoginPage loginpage;
	ClientHomePage clienthomepage;
	CommanAppObject commanAppobj;
	@Step("Input the value {0} in {1} text field")
	@Screenshots(onlyOnFailures=true)
	public void input_In_text_field(String txtSearch,String webObject) {		
		vieweventListingpage.EnterTheTextInEditField(txtSearch, webObject);		
	}	
	@Step ("Click the {} button")
	public void pressButton(String objName) {
		vieweventListingpage.ClickTheButton(objName);
	}
	@Step("Click the {} link")
	public void clickLinkObj(String linkObjName) {
		vieweventListingpage.clickWebLinkElement(linkObjName);
	}
	@Step("value retrieved from {} field as")
	public String retrieveVisibleText(String fldName) {
		eddisplayName = vieweventListingpage.getTheValue(fldName);
		return eddisplayName;
	}
	
	@Step("value retrieved from {} field as")
	public String getDropDownvalue(String dropdownObj) {
		viewPackageName = vieweventListingpage.getSelectedOption(dropdownObj);
		return viewPackageName;
	}
	
	/*@Step("Get the Display Nameme on Event Listing Edit Page 'Display Name:'{} ")
	public String retrieveDisplayNameonEditPage() {
		eddisplayName = vieweventListingpage.getDisplayNamee();
		return eddisplayName;
	}*/
	
	@Step ("Click the Search button")
	public void dropdownOptionSelection(String strVal, String webElement) {
		vieweventListingpage.selectAValuefromdropdown(strVal, webElement);
	}
	@Step ("Open the Event Listing ")
	public void ClickFirstEVentListing() {
		vieweventListingpage.OpenEventListing();
	}	
	@Step("Click the Edit Event listing Link on Event Listing View page")
	public void ClickEditEVentListingLink() {
		vieweventListingpage.ClickEditEventListing();
	}	
	@Step("Get the Selected Package Name on Event Listing Edit Page")
	public String RetrievePackageNameonEditPage() {
		editPackageName = vieweventListingpage.getSelectedPackageName();
		return editPackageName;
	}
	
	
	@Step("Get the Package Name on Event Listing view Page as {}")
	public String RetrievePackageNameonViewPage() {
		viewPackageName = vieweventListingpage.getEventListingPackageName();
		return viewPackageName;
	}
	@Step("Get the Booth id on Event Listing Edit Page")
	public String RetrieveBoothIDOnEditPage() {
		editboothID = vieweventListingpage.getBoothid();
		return editboothID;
	}
	//@Step("Input the Facebook Social medial URL on Edit Page")
	/*public String InputFacebookURLOnEditPage() {
		
		return fblinkURL;
	}*/
	@Step("Get the Booth id on Event Listing View Page")
	public String RetrieveBoothIDOnViewPage() {
		viewBoothID = vieweventListingpage.getBoothNumber();
		return viewBoothID;
	}
	@Step
	public void SaveContentDetails() {
	//	commanAppobj.ClickSavebutton();
		vieweventListingpage.clickSaveButton();
	}
	@Step("Verify package name is same on view and edit eventlisting page expacted package {0} actual package is {1}")
	public void verifyPackage(String exPpackage, String actPackage) {
		 vieweventListingpage.checkPackageName(exPpackage,actPackage);
		/* Actor QA = Actor.named("QA");
		 try {
			 QA.attemptsTo(
					 Ensure.that(exPpackage).isEqualTo("Test")); 
		 }catch (Exception e){
			 
		 }*/
	}
	
	@Step("Open client site environment")
	public void AccessClientSite() {
		loginpage.loginClientsite();		
	}
	
	@Step("Input text in Search exhibitor field on Exhibitors Catalogue page")
	public void inputExhibitor(String textToSearch) {
		clienthomepage.InputsearchExhibitorsText(textToSearch);	
	}
	
	@Step("click Search buttton Exhibitors Catalogue page")
	public void pressSearchButton() {
		clienthomepage.clickSearchbutton();	
	}
	@Step("Open the first exhibitor link on Exhibitors Catalogue page")
	public void openFirstExhibitorLink() {
		clienthomepage.clickFirstExhibitorsLink();	
	}
	
	@Step("Retrieve the facebook link URL on Contact info section")
	public String getFacebookURL() {
		 fbURLAct = clienthomepage.getFacebookIconURL();
		 return fbURLAct;
	}
	
	@Step("Link URL retrieved as {0}")
	public String retrieveLinkURL(String lnkObjName) {
		 linkURLActual = clienthomepage.getLinkURL(lnkObjName);
		 return linkURLActual;
	}
	
	@Step("Verify link URL is same on MMCC and client site expacted URL: {1}")

	public void verifyFBSocialURL (String lnkName, String expfbURL) {
		clienthomepage.checkLinkURL(lnkName,expfbURL);		
	}
	
	@Step("Verify field label is same on MMCC and client site expacted Label: {1}")
	@Screenshots(onlyOnFailures=true)
	public void verifyLabelTextOnPage (String labelName, String expectedLabel) {
		clienthomepage.checkLabeltext(labelName,expectedLabel);		
	}
	
	@Step("Verify page is displayed expected is {0}")
	public void checkPage(String pageTitleExp) {
		 vieweventListingpage.verifyPageTitle(pageTitleExp);		
	}

}
