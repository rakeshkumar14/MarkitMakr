package net.serenity.bdd.junit.cucumber.model;

import org.openqa.selenium.By;



import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.actions.ScrollToTarget;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import net.serenitybdd.screenplay.targets.Target;

public class Scroll {


	   public static ScrollToTarget to(Target target) {
	       return new ScrollToTarget(target);
	   }

	    public static ScrollToWebElement to(WebElementFacade element) {
	        return new ScrollToWebElement(element);
	    }

	    public static ScrollToBy to(By... locators) {
	        return new ScrollToBy(locators);
	    }
}
