package net.serenitybdd.demos.actions.steps;

import net.serenitybdd.demos.actions.steps.actions.SimplestAction;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.core.Serenity;

public class ATodoUser {

    SimplestAction action = new SimplestAction();

    @Step
    public void preparedEnvironment() {
        this.action.nothing();
    }

    @Step
    public void perform(String actionName, WebDriver browser) {
        browser.get("https://www.google.com/");
        this.action.nothing();
    }

    @Step
    public void checkResult(String action, String result, WebDriver browser) {
        browser.get("https://help.github.com/");
        this.action.nothing();
    }
}
