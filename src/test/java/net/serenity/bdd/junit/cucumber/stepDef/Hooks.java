package net.serenity.bdd.junit.cucumber.stepDef;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
//import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenity.bdd.junit.cucumber.pages.LoginPage;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;

public class Hooks extends PageObject  {
	
	@Managed                                                                
    WebDriver driver;
	//TestContext testContext;
//	LoginData dataprovider= new LoginData();
	LoginPage loginPage;
	 
	 
	 @Before
	 public void BeforeSteps() {
		System.out.println("----------before each scenario------");
		loginPage.open();
		getDriver().manage().window().maximize();
		driver.findElement(By.xpath("//*[@id='edit-name']")).sendKeys("rak14@in.ibm.com");
		driver.findElement(By.xpath("//*[@id='edit-pass']")).sendKeys("pass00@14");
		driver.findElement(By.xpath("//*[@id='edit-submit']")).click();
			
	
	 }
	 
	 @After
	 public void AfterSteps() {
		 System.out.println("----------after each scenario------");
	 //testContext.getWebDriverManager().quitDriver();
	 }
	 
	 
	 
}
