package net.serenity.bdd.junit.cucumber.stepDef;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenity.bdd.junit.cucumber.pages.MMCCDashboard;
import net.serenity.bdd.junit.cucumber.steps.CommanApplicationSteps;
import net.serenity.bdd.junit.cucumber.steps.ViewEventListingSteps;
import net.thucydides.core.annotations.Screenshots;
import net.thucydides.core.annotations.Steps;


public class CheckEventListingStepDef {
	String pkgNameExp, boothIdExp, pkgNameAct, boothIdAct,displayNameExp,fbURLExp, fbSocialAct;
	
	@Steps
	ViewEventListingSteps vieweventlistingsteps;
	CommanApplicationSteps commanSteps;
	MMCCDashboard mMCCDashboard;

	@Given("^EventListing tab is avialble on left menu$")
	@Screenshots(disabled=true)
	public void EventListing_Tab_available() {
	
		mMCCDashboard.clickEventListinginLeftMenu();
	}

	@When("^input \"([^\"]*)\" text in \"([^\"]*)\" field$")
	
	public void input_searchtext(String searchText, String fieldName) {
		
		vieweventlistingsteps.input_In_text_field(searchText, fieldName);
		
	}
	
	@And("^I Input \"([^\"]*)\" in \"([^\"]*)\" text field$")
	public void enter_text(String textVal, String fieldName) {		
		vieweventlistingsteps.input_In_text_field(textVal, fieldName);		
	}
	
	@And("^I Click the \"([^\"]*)\" field$")
	public void I_Press_button(String btnName) {
		vieweventlistingsteps.pressButton(btnName);
	}
	
	@And("^Click the \"([^\"]*)\" link$")
	public void I_click_link(String linkName) {
		vieweventlistingsteps.clickLinkObj(linkName);
	}
	
	@And("^Get the value from \"([^\"]*)\" field$")
	public void get_Field_Value(String fieldName) {
		vieweventlistingsteps.retrieveVisibleText(fieldName);
	}
//	Retrieve the selected option from a drop-down box on view page.
	@And("^Get the selected option from \"([^\"]*)\" drop-down on edit page$")
	public void get_Slected_option_In_DropDown(String dropdownName) {
		vieweventlistingsteps.getDropDownvalue(dropdownName);
	}
	
	@And("I open first event listing")
	public void open_first_EventListing()  {
		vieweventlistingsteps.ClickFirstEVentListing();
	}

	@And("^I click Edit Event Listing link$")
	public void press_EditEventListing_Link() {
		vieweventlistingsteps.ClickEditEVentListingLink();
	}
	@And("^Get the Package Name on edit page$")
	public void get_Selected_PackageName() {
		pkgNameExp =vieweventlistingsteps.RetrievePackageNameonEditPage();
	}
	
	/*@And("^Get the Display Name on edit page$")
	public void get_DisplayName_() {
		displayNameExp =vieweventlistingsteps.retrieveDisplayNameonEditPage();
	}*/
	
	@And("^Get the Package Name on view Page$")
	public void get_PackageName_ViewPage() {
		pkgNameAct =vieweventlistingsteps.RetrievePackageNameonViewPage();
	}
	@And("^Get the Booth id on edit Page$")
	public void get_BoothId_EditPage() {
		boothIdExp = vieweventlistingsteps.RetrieveBoothIDOnEditPage();
	}
	/*@And("^Input the Facebook link on edit page$")
	public void enter_facebookURL_AT_EditPage() {

	}*/
	@And("^Get the Booth id on view Page$")
	public void get_BoothId_ViewPage() {
		boothIdAct = vieweventlistingsteps.RetrieveBoothIDOnViewPage();
	}
	@And("^Click the Save button$")
	public void click_Save_Button() {
		vieweventlistingsteps.SaveContentDetails();
	}
	
	@Then("^PackageName must be same$")
	public void Verify_PackageName() {
		vieweventlistingsteps.verifyPackage(pkgNameExp, pkgNameAct);	
	}
	
	@And("^Open the client site$")
	@Screenshots(disabled=true)
	public void open_Clientsite() {
		vieweventlistingsteps.AccessClientSite();
	}
	
	@And("^Input the exhibitor to search$")
	@Screenshots(disabled=true)
	public void input_Exhibitor_To_Search() {
		vieweventlistingsteps.inputExhibitor("Idemia");
	}
	
	@And("^Click Search button$")
	@Screenshots(disabled=true)
	public void I_Press_Search_Button() {
		vieweventlistingsteps.pressSearchButton();
	}
	
	@And("^Click the first exhibitor link$")
	@Screenshots(disabled=true)
	public void openfirstExhibitor() {
		vieweventlistingsteps.openFirstExhibitorLink();
	}
	
	@And("^Get the facebook link URL$")
	public void Retrieve_FacebookURL() {
		fbSocialAct = vieweventlistingsteps.getFacebookURL();
		
	}
	
	@And("^Get the \"([^\"]*)\" URL$")
	public void get_the_Link_URL(String linkName) {
		fbSocialAct = vieweventlistingsteps.retrieveLinkURL(linkName);
		
	}
	
	@Then("^verify facebook URL is correct$")
	public void verify_Facebooklink_At_clientsite() {
		vieweventlistingsteps.verifyFBSocialURL(fbURLExp, fbSocialAct);
		
	}
	
	@Then("^verify \"([^\"]*)\" URL is correct expected is \"([^\"]*)\"$")
	@Screenshots(disabled=true)
	public void verify_Fblink_At_clientsite(String linkName, String explinkURL) {
		vieweventlistingsteps.verifyFBSocialURL(linkName, explinkURL);
		
	}
	
	@And("^verify \"([^\"]*)\" is correct expected is \"([^\"]*)\"$")
	@Screenshots(onlyOnFailures=true)
	public void verify_Label_Text_At_clientsite(String elementName, String expectedText) {
		vieweventlistingsteps.verifyLabelTextOnPage(elementName, expectedText);
		
	}
	@And("^Select an option \"([^\"]*)\" from \"([^\"]*)\" drop-down$")
	@Screenshots(disabled=true)
	public void select_an_option_from_drop_down(String strOption, String objName) {
		vieweventlistingsteps.dropdownOptionSelection(strOption, objName);
	  //  throw new io.cucumber.java.PendingException();
	}
	@Then("^Catelouge Page is display$")
	@Screenshots(disabled=true)
	public void page_is_Displayed() {
		vieweventlistingsteps.checkPage("Gulf Traffic │ Exhibitor Catalogue - Gulf Traffic 2019");
	}
	
	
}
