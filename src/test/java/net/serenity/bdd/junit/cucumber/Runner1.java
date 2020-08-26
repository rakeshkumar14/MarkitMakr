package net.serenity.bdd.junit.cucumber;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/MMCC/CheckEventListing.feature",plugin={"pretty","html:target/cucumber","json:target/json/cucumber.json"},tags = {"@Smoke"})
public class Runner1 {

}

