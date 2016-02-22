package net.serenitybdd.demos.actions.steps;

import net.serenitybdd.demos.actions.steps.actions.SimplestAction;
import net.thucydides.core.annotations.Step;

public class ATodoUser {

    SimplestAction action = new SimplestAction();

    @Step
    public void preparedEnvironment() {
        this.action.nothing();
    }

    @Step
    public void perform(String actionName) {
        this.action.nothing();
    }

    @Step
    public void checkResult(String action, String result) {
        this.action.nothing();
    }
}
