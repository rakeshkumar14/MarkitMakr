package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.pages.CommanAppObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class CommanApplicationSteps extends  ScenarioSteps {

	CommanAppObject commanAppobj;
	@Step
	public void SaveContentDetails() {
		commanAppobj.ClickSavebutton();		
	}
}
