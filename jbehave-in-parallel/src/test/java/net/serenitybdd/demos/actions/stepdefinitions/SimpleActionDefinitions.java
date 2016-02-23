package net.serenitybdd.demos.actions.stepdefinitions;

import net.serenitybdd.demos.actions.steps.ATodoUser;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SimpleActionDefinitions {
    @Given("I have prepared environment for $doSomething")
    public void prepareEnvironment(String doSomething) throws Throwable {
        jane.preparedEnvironment();
    }

    @Steps
    ATodoUser jane;

    @Managed(driver = "chrome")
    WebDriver chrome;

    @Managed(driver = "phantomjs")
    WebDriver phantomjs;

    @When("I perform \"$actionName\"")
    @Alias("I have performed \"$actionName\"")
    public void perform(String actionName) throws Throwable {
        jane.perform(actionName, chrome);
    }

    @Then("I expect result for \"$action\" should be \"$expected\"")
    @Alias("I have result for \"$action\" should be \"$expected\"")
    public void checkResultFor(String action, String expected) throws Throwable {
        jane.checkResult(action, expected, phantomjs);
    }
}
