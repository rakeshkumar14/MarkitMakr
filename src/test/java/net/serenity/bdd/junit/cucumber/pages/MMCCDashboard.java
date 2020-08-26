package net.serenity.bdd.junit.cucumber.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MMCCDashboard extends PageObject{

		
	@FindBy(xpath="//a[@title='Link to attributes']")
	private WebElementFacade lnk_Attribute;
	
	@FindBy(xpath="//a[@title='Link to elistings']")
	private WebElementFacade lnk_EventListing;
	
	@FindBy(xpath="//input[@class='mm-event-text-search-input rounded p-3']")
	private WebElementFacade edit_SearhEventListing;
	
	
	public void clickAttributeLinkinLeftMenu() {
		
		lnk_Attribute.click();	
	}
	
	public void clickEventListinginLeftMenu() {
		
		lnk_EventListing.click();
		edit_SearhEventListing.waitUntilVisible();
	}

	
}
