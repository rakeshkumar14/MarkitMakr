package net.serenity.bdd.junit.cucumber.layers;

import net.serenity.bdd.junit.cucumber.pages.CommanAppObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class ChangeWorkingEvent extends CommanAppObject{

	@FindBy(css="div.modal-content")
	private WebElementFacade parent;
	//@FindBy(css="div.chosen-drop ul.chosen-results li:nth-child(3)")
	@FindBy(xpath="//*[@id='user_event_change_chosen']/div/ul/li[1]")
	private WebElementFacade eventOption1;
	@FindBy(xpath="//*[@id='user_event_change_chosen']/div/ul/li[2]")
	private WebElementFacade eventOption2;
	@FindBy(xpath="//*[@id='user_event_change_chosen']/div/ul/li[3]")
	private WebElementFacade eventOption3;
	@FindBy(xpath="//*[@id='user_event_change_chosen']/div/ul/li[4]")
	private WebElementFacade eventOption4;
	@FindBy(xpath="//*[@id='user_event_change_chosen']/div/ul/li[318]")
	private WebElementFacade eventOption318;

	@FindBy(xpath="//*[@id='user_event_change_chosen']/div/ul/li[320]")
	private WebElementFacade eventOption320;

	@FindBy(css="div#event-select-modal [type='button']:nth-child(2)")
	private WebElementFacade LOC_BTN_setWorkingEvent;
	
	@FindBy(css="div#user_event_change_chosen")
	private WebElementFacade eventdropdown;
	
	@FindBy(css="ul.chosen-results")
	private WebElementFacade eventdropdownlist;
	
	@FindBy(css="div.chosen-search input[type='text']")
	private WebElementFacade eventdropdowntextbox;
	
	@FindBy(css="li.no-results")
	private WebElementFacade LOC_TXT_NORESULTS;

	
	public void showWorkingEventDropdown(){
		eventdropdown.click();
		eventdropdownlist.waitUntilVisible();
		
	}
	public void changeWorkingEvent() {
		//System.out.println("event name: "+eventOption.getText());
		eventOption3.click();
		
		
	}
	public void changeWorkingEvent(String eventName) {
		//System.out.println("event name: "+eventOption.getText());
		eventdropdowntextbox.sendKeys(eventName);
		eventdropdowntextbox.waitUntilClickable();
		//eventdropdowntextbox.sendKeys(Keys.DOWN);
		//eventdropdownlist.
		eventdropdowntextbox.sendKeys(Keys.ENTER);
		setWorkingEvent();
		waitForAngularRequestsToFinish();
		waitForRenderedElementsToDisappear(By.cssSelector("div.modal-content"));
		
		
	}
	public void VerifyWorkingEventDoesNotExist(String event){
		eventdropdowntextbox.sendKeys(event);
		LOC_TXT_NORESULTS.isDisplayed();
		
	}
	public void setWorkingEvent() {
		LOC_BTN_setWorkingEvent.click();  //selecting the single option available in the dropdown
		
		
	}
}
