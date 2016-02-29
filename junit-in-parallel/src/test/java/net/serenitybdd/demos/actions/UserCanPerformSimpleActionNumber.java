package net.serenitybdd.demos.actions;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.contains;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.demos.actions.steps.ATodoUser;

@RunWith(SerenityRunner.class)
public class UserCanPerformSimpleActionNumber {

    @Steps
    ATodoUser jane;

    @Test
    public void do_some_action_number () {
        jane.perform("some action for " + this.getClass().getName());
        jane.checkResult("some action" + this.getClass().getName(), "some action" + this.getClass().getName());
    }
}