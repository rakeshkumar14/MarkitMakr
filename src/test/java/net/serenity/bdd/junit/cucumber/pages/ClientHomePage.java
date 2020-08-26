package net.serenity.bdd.junit.cucumber.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class ClientHomePage extends PageObject {
	
	public WebElementFacade Find_ClientPage_Element(String elementName) {
		WebElementFacade webElementObj = null;
		switch (elementName) {
			case "Client Facebook social" :
				WebElementFacade social_FBLink = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--social cmp-exhibitorlisting__meta-field--facebook']"));
				webElementObj = social_FBLink;
				break;
			case "Client Instagram social" :
				WebElementFacade social_InstaLink = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--social cmp-exhibitorlisting__meta-field--instagram']"));
				webElementObj = social_InstaLink;
				break;
			case "Client Linkedin social" :
				WebElementFacade social_linkedinLink = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--social cmp-exhibitorlisting__meta-field--linkedin']"));
				webElementObj = social_linkedinLink;
				break;
			case "Client Twiter social" :
				WebElementFacade social_TwiterLink = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--social cmp-exhibitorlisting__meta-field--twitter']"));
				webElementObj = social_TwiterLink;
				break;
			case "Client Youtube social" :
				WebElementFacade social_YoutubeLink = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--socialcmp-exhibitorlisting__ meta-field--youtube']"));
				webElementObj = social_YoutubeLink;
				break;
			case "Client Exhibitor Details" :
				WebElementFacade exhibitor_Details = $(By.xpath("//div[@class='cmp-exhibitorlisting__exhibitor-summary-text/p']"));
				webElementObj = exhibitor_Details;
				break;
			case "Client Country" :
				WebElementFacade exhibitorCountry = $(By.xpath("//span[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--country']"));
				webElementObj = exhibitorCountry;
				break;
			case "Client Telephone" :
				WebElementFacade exhibitortelephone = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--phone']"));
				webElementObj = exhibitortelephone;
				break;
			case "Client Fax" :
				WebElementFacade exhibitorFax = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--fax']"));
				webElementObj = exhibitorFax;
				break;
			case "Client Email" :
				WebElementFacade exhibitorEmail = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--email']"));
				webElementObj = exhibitorEmail;
				break;
			case "Client Website" :
				WebElementFacade exhibitorWebsite = $(By.xpath("//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--url']"));
				webElementObj = exhibitorWebsite;
				break;
			case "Client StreetAddress1" :
				WebElementFacade StreetAddress1 = $(By.xpath("//span[@class='cmp-exhibitorlisting__address-field cmp-exhibitorlisting__address-field--street1']"));
				webElementObj = StreetAddress1;
				break;
			case "Client City" :
				WebElementFacade exhibitorCity = $(By.xpath("//span[@class='cmp-exhibitorlisting__address-field cmp-exhibitorlisting__address-field--city']"));
				webElementObj = exhibitorCity;
				break;
			case "Client ZipCode" :
				WebElementFacade exhibitorZipcode = $(By.xpath("//span[@class='cmp-exhibitorlisting__address-field cmp-exhibitorlisting__address-field--zip']"));
				webElementObj = exhibitorZipcode;
				break;
			case "Client SalesPackage" :
				WebElementFacade exhibitorPackage = $(By.xpath("//span[@class='cmp-exhibitorlisting__badge-label']"));
				webElementObj = exhibitorPackage;
				break;
		}
		return webElementObj;
	}
	@FindBy(xpath="//a[@class='cmp-exhibitorlisting__meta-field cmp-exhibitorlisting__meta-field--social cmp-exhibitorlisting__meta-field--facebook']")
	private WebElementFacade SocialFacebookLink;
	
	@FindBy(xpath="//input[@class='cmp-exhibitorlisting__search-field cmp-exhibitorlisting__search-field--query']")
	private WebElementFacade ed_SearchExhibitors;
	@FindBy(xpath="//button[@class='cmp-exhibitorlisting__search-action cmp-exhibitorlisting__search-action--search']")
	private WebElementFacade SearchButton;
	
	//@FindBy(xpath="//div[@class='cmp-exhibitorlisting__listings']/div[2]/div[2]")
	@FindBy(xpath="//div[@class='cmp-exhibitorlisting__listing-record-title cmp-exhibitorlisting__listing-record-field']/a[1]")
	private WebElementFacade firstExhibitorLink;
	
	public void InputsearchExhibitorsText(String searchtext) {
		ed_SearchExhibitors.sendKeys(searchtext);
	}
	public void clickSearchbutton() {
		DriverUtils.delay(3000);
		SearchButton.click();
	}
	
	public void clickFirstExhibitorsLink() {
		firstExhibitorLink.click();
		DriverUtils.delay(5000);
	}
	
	public String getFacebookIconURL() {
		String fbLinkURLAct = SocialFacebookLink.getAttribute("href");
		return fbLinkURLAct;
	}
	
	public String getLinkURL(String linkName) {
		WebElementFacade lnkObj = Find_ClientPage_Element(linkName);
		String linkURLAct = lnkObj.getAttribute("href");
		return linkURLAct;
	}
	
	public void checkLinkURL(String linkObjName , String expFBLink) {
		String actLink = getLinkURL(linkObjName);
		Assert.assertEquals(expFBLink, actLink);
		Actor aster = Actor.named("QA");
		aster.attemptsTo(
		Ensure.that(expFBLink).isEqualTo(actLink));
	}
	
	public void checkLabeltext(String ObjectName , String expText) {
		WebElementFacade lableObj = Find_ClientPage_Element(ObjectName);
		String actText = lableObj.getText();
		Assert.assertEquals(expText, actText);
		Actor aster = Actor.named("QA");
		aster.attemptsTo(
		Ensure.that(expText).isEqualTo(actText));
	}
	

}
