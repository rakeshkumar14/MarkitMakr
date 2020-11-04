package net.serenity.bdd.junit.cucumber.pages;

//import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.WhenPageOpens;

public class LoginPage extends CommanAppObject{

	@FindBy(xpath="//*[@id='edit-name']")
	private WebElementFacade LoginUserNameField;
	
	@FindBy(xpath="//*[@id='edit-pass']")
	private WebElementFacade LoginPasswordField;
	
	@FindBy(xpath="//*[@id='edit-submit']")
	private WebElementFacade LoginButton;
	
	@FindBy(xpath="//input[@class='cmp-exhibitorlisting__search-field cmp-exhibitorlisting__search-field--query']")
	private WebElementFacade homeSearch;
	
	 @WhenPageOpens
     public void waitUntilTitleAppears() {
         element(LoginUserNameField).waitUntilVisible();
     }
	 
	public void openLoginPage() {
		open();
		waitUntilTitleAppears();
		
	}
	
	 public void performLogin() {
	//public void performLogin(LoginData dataprovider) {
		getDriver().manage().window().maximize();
		/*System.out.println(dataprovider.getUserName());
		LoginUserNameField.sendKeys(dataprovider.getUserName());
		LoginPasswordField.sendKeys(dataprovider.getPassword());
		LoginButton.click();*/
		getDriver().get("https://informa-qa64.adobecqms.net/content/informa/gulf-traffic/en/exhibit/exhibitor-catalogue.html");
	}
	
	public void loginClientsite() {
		getDriver().get("https://informa:informa@informa-qa64.adobecqms.net/content/informa/gulf-traffic/en/exhibit/exhibitor-catalogue.html");
		
	}

/*	public void performLogin(NewPasswordData newpasswordProvider) {
		getDriver().manage().window().maximize();
		System.out.println(newpasswordProvider.getNewUserName());
		LoginUserNameField.sendKeys(newpasswordProvider.getNewUserName());
		LoginPasswordField.sendKeys(newpasswordProvider.getNewPassword());
		LoginButton.click();
		
	}*/
	
	
}
