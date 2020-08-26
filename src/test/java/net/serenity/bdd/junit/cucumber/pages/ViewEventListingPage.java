package net.serenity.bdd.junit.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ViewEventListingPage extends PageObject{
	public WebElementFacade Find_Page_Element(String elementName) {
		WebElementFacade fieldObj = null;
		switch (elementName) {
			case "Search EventListing" :
				WebElementFacade selectElement = $(By.xpath("//input[@class='mm-event-text-search-input rounded p-3']"));
				fieldObj = selectElement;
				break;
			case "Facebook Social" :
				WebElementFacade ed_Social_Facebook = $(By.id("edit-field-elisting-social-info-ref-0-subform-field-social-info-facebook-0-uri"));
				fieldObj = ed_Social_Facebook;
				break;
			case "Instagram Social" :
				WebElementFacade ed_Social_Instagram = $(By.id("edit-field-elisting-social-info-ref-0-subform-field-social-info-instagram-0-uri"));
				fieldObj = ed_Social_Instagram;
				break;
			case "Linkedin Social" :
				WebElementFacade ed_Social_Linkedin = $(By.id("edit-field-elisting-social-info-ref-0-subform-field-social-info-linkedin-0-uri"));
				fieldObj = ed_Social_Linkedin;
				break;			
			case "Twitter Social" :
				WebElementFacade ed_Social_Twitter = $(By.id("edit-field-elisting-social-info-ref-0-subform-field-social-info-twitter-0-uri"));
				fieldObj = ed_Social_Twitter;
				break;
			case "Youtube Social" :
				WebElementFacade ed_Social_YouTube = $(By.id("edit-field-elisting-social-info-ref-0-subform-field-social-info-youtube-0-uri"));
				fieldObj = ed_Social_YouTube;
				break;
			case "Street Address1" :
				WebElementFacade ed_Street_Add = $(By.xpath("//input[@name='field_elisting_address[0][address][address_line1]']"));
				fieldObj = ed_Street_Add;
				break;
			case "City" :
				WebElementFacade ed_City = $(By.xpath("//input[@name='field_elisting_address[0][address][locality]']"));
				fieldObj = ed_City;
				break;
			case "Zip Code" :
				WebElementFacade ed_Zip_Code = $(By.xpath("//input[@name='field_elisting_address[0][address][postal_code]']"));
				fieldObj = ed_Zip_Code;
				break;
			case "Phone" :
				WebElementFacade ed_Phone = $(By.id("edit-field-elisting-phone-0-value"));
				fieldObj = ed_Phone;
				break;
			case "Fax" :
				WebElementFacade ed_Fax = $(By.id("edit-field-elisting-fax-0-value"));
				fieldObj = ed_Fax;
				break;
			case "Email" :
				WebElementFacade ed_Email = $(By.id("edit-field-elisting-email-0-value"));
				fieldObj = ed_Email;
				break;
			case "Website" :
				WebElementFacade ed_Website = $(By.id("edit-field-elisting-website-0-uri"));
				fieldObj = ed_Website;
				break;
			case "Search Button":
				//WebElement btnSearch = getDriver().findElement(By.xpath("//button[@class='mm-submit rounded ml-2']"));
				//WebElementFacade btnSearch = $(By.xpath("//i[@class='far fa-search']"));
				WebElementFacade btnSearch = $(By.xpath("//button[@class='mm-submit rounded ml-2']"));
				fieldObj =btnSearch;
				break;
			case "Save Button":
			
				WebElementFacade btnSave = $(By.xpath("//button[@id='edit-submit']"));
				
				fieldObj =btnSave;
				break;
			case "Country":
				WebElementFacade dd_Country = $(By.xpath("//select[@id='edit-field-elisting-address-0-address-country-code--2']"));
				fieldObj =dd_Country;
				break;
			case "Display Name":
				WebElementFacade edit_DisplayName = $(By.cssSelector("input#edit-title-0-value"));
				fieldObj =edit_DisplayName;
				break;
			case "Package Name":	
				WebElementFacade dropdown_package = $(By.xpath("//select[@id='edit-field-elisting-package-ref']"));
				fieldObj =dropdown_package;
				break;
			case "Booth id":
				WebElementFacade view_BoothId = $(By.xpath("//*[@id='edit-field-elisting-booth-info-ref-0-subform-field-booth-info-id-0-value']"));
				fieldObj = view_BoothId;
				break;
		}
		return fieldObj;
	}
	
	@FindBy(xpath="//div[@class='cookieButton']")
	WebElementFacade cookieBtn_IAgree;
	//a[text()='IDEMIA']
	//public final static String EventLisintingtoEdit  = "//a[text()='%s']";
	@FindBy(xpath="//input[@class='mm-event-text-search-input rounded p-3']")
	WebElementFacade ed_Search;
	@FindBy(xpath="//i[@class='far fa-search']")
	private WebElement searchButton;	
	@FindBy(xpath="//div[@class='col-2 d-flex align-items-center']/a")
	private WebElementFacade firstEventListing;
	
	
	@FindBy(xpath="//a[@class=' mm-edit-link']")
	private WebElementFacade link_EditEventListing;
	
	@FindBy(xpath="//select[@id='edit-field-elisting-package-ref']")
	private WebElementFacade dropdown_package;
	
	@FindBy(xpath="//*[@id='edit-field-elisting-booth-info-ref-0-subform-field-booth-info-id-0-value']")
	private WebElementFacade boothId;
	
	@FindBy(xpath="//p[@class='mb-0 pb-0 pl-2 mm-package-title']")
	private WebElementFacade label_PackageName;
	
	@FindBy(xpath="//p[@class='font-weight-bold mm-elisting-booth ml-3 mt-1']/span")
	private WebElementFacade label_boothNumber;
	
	@FindBy(xpath="//button[@id='edit-submit']")
	private WebElementFacade button_Save;
	
	/*@FindBy(id="edit-field-elisting-social-info-ref-0-subform-field-social-info-facebook-0-uri")
	private WebElementFacade ed_Social_Facebook;
	@FindBy(id="edit-field-elisting-social-info-ref-0-subform-field-social-info-instagram-0-uri")
	private WebElementFacade ed_Social_Instagram;	
	@FindBy(id="edit-field-elisting-social-info-ref-0-subform-field-social-info-linkedin-0-uri")
	private WebElementFacade ed_Social_Linkedin;
	@FindBy(id="edit-field-elisting-social-info-ref-0-subform-field-social-info-twitter-0-uri")
	private WebElementFacade ed_Social_Twitter;
	@FindBy(id="edit-field-elisting-social-info-ref-0-subform-field-social-info-youtube-0-uri")
	private WebElementFacade ed_Social_YouTube;
	@FindBy(id="edit-title-0-value")
	private WebElementFacade edit_DisplayName;*/
	@FindBy(id="edit-title-0-value")
	private WebElement edit_DisplayName;
	
	
	
	/* @WhenPageOpens
     public void waitUntilTitleAppears() {
         element(AttributLabel).waitUntilVisible();
     }*/
	
	public void clickWebLinkElement(String linktext) {
		String EventLisintingtoEdit  = "//a[text()='%s']";
		String locator = String.format(EventLisintingtoEdit,linktext);		
		WebElementFacade linkObject = $(By.xpath(locator));
		linkObject.click();
		
	}
	 
	public void EnterTheTextInEditField(String toSearch, String elementName) {		
		WebElementFacade webEditObj = Find_Page_Element(elementName);
		webEditObj.clear();
		webEditObj.sendKeys(toSearch);
	}
	
	public String getTheValue(String objName) {		
		WebElementFacade webEditObj = Find_Page_Element(objName);
		String editPdspName = webEditObj.getAttribute("value");
		return editPdspName;
	}

	public void ClickTheButton(String buttonOjb) {
		
		WebElementFacade webButtonObj = Find_Page_Element(buttonOjb);
		Point point = webButtonObj.getLocation();
		int xCord = point.getX();
		int yCord = point.getY();
		Actions action = new Actions(getDriver());
		action.moveToElement(webButtonObj, xCord, yCord).click().build().perform();		
		DriverUtils.delay(1000);
		webButtonObj.click();
	}
	
	
	
	public void selectAValuefromdropdown(String strvalue, String dropdownName) {
		WebElementFacade webEditObj = Find_Page_Element(dropdownName);
		webEditObj.selectByVisibleText(strvalue);
		DriverUtils.delay(5000);
	}
	
	public String getSelectedOption(String dropdownElement) {
		String packangeName = DriverUtils.getSelectOptionDropDown(dropdown_package);
		System.out.println("Package Name is: "+packangeName);
		return packangeName;
	}
	
	public void OpenEventListing() {
		firstEventListing.click();		
		
	}
	
	public void ClickEditEventListing() {
		link_EditEventListing.click();	
		
	}
	public String getSelectedPackageName() {
		String packangeName = DriverUtils.getSelectOptionDropDown(dropdown_package);
		System.out.println("Package Name is: "+packangeName);
		return packangeName;
	}
	
	/*public String getDisplayNamee() {
		String editPdspName = edit_DisplayName.getAttribute("value");
		System.out.println("Display Name is: "+editPdspName);
		return editPdspName;
	}*/
	public String getEventListingPackageName() {
		String	pkgName = label_PackageName.getText();
		return pkgName;
	}
	
	public String getBoothid() {
			String	boothid = boothId.getAttribute("value");
			System.out.println("Booth ID is: "+boothid);
			return boothid;
	}
	public String getBoothNumber() {
		String	boothnum = label_boothNumber.getText();		
		return boothnum;
	}
	/*public String endterFacebookURL() {
		String fburl = "https://www.facebook.com/gifaselectricswitzerland/?rf=179027858830563";
		ed_Social_Facebook.clear();		
		ed_Social_Facebook.sendKeys(fburl);
		return fburl;
	}*/
	public void checkPackageName(String expPkgName, String actpkgName) {
		Assert.assertEquals(expPkgName, actpkgName);
		// Ensure.that("https://www.facebook.com/").isEqualTo(actpkgName);
		/*if (actpkgName.equals(expPkgName)) {
			System.out.println("Package name is correct");
		}else {
			System.out.println("Package name is not correct");
		}*/		
	}
	
	public void checkFBSocialURL(String expFBLink, String actFBLink) {
		Assert.assertEquals(expFBLink, actFBLink);
		Actor aster = Actor.named("QA");
		aster.attemptsTo(
		Ensure.that(expFBLink).isEqualTo(actFBLink));
	}
	public void clickSaveButton() {
		DriverUtils.scrollToPageTop(getDriver());
		button_Save.click();
	}
	public void verifyPageTitle(String pageTitle) {
		String pgTitleAct = getDriver().getTitle();
		Actor aster = Actor.named("QA");
		aster.attemptsTo(
			Ensure.that(pageTitle).contains(pgTitleAct));
		 //Ensure.that(pageTitle).isEqualTo(pgTitleAct));
		 if (cookieBtn_IAgree.isDisplayed()) {
			 cookieBtn_IAgree.click();
		 }
		
	}
	
}
