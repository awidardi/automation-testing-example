package com.futures.Behaviour;

import com.futures.pages.BlibliHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;


public class BlibliHomePageBehaviour extends ScenarioSteps {

    BlibliHomePage blibliHomePage;

    @Step
    public void open(){
        getDriver().get("https://www.blibli.com/");
    }

    @Step
    public void clickUserLogin() {
        blibliHomePage.getLoginButton().click();
        blibliHomePage.getInputLoginEmail().type("username");
        blibliHomePage.getInputLoginPassword().typeAndEnter("password");
    }

    @Step
    public void checkUserAlreadyLoggedIn(){
        blibliHomePage.getAlreadyLoginLabel().isCurrentlyVisible();
    }
}
