package net.serenity.bdd.junit.cucumber.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CommanAppObject extends PageObject{
	
	@FindBy(xpath="//*[@id='mm-clone-edit-actions']/div/button")
	private WebElementFacade button_Save;
	
	public void ClickSavebutton()  {
	//	DriverUtils.scrollToPageTop(getDriver());
		button_Save.click();			
		}

}
