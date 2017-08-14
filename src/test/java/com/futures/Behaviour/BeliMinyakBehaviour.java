package com.futures.Behaviour;

import com.futures.pages.BeliMinyak;
import com.futures.pages.BlibliHomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class BeliMinyakBehaviour extends ScenarioSteps{

    BlibliHomePage blibliHomePage;
    BeliMinyak beliMinyak;

    @Step
    public void checkUserAlreadyLoggedIn(){
        beliMinyak.getAlreadyLoginLabel().isCurrentlyVisible();
    }

    @Step
    public void inputSearch(){
        beliMinyak.getInputSearch().type("Minyak Goreng");
        beliMinyak.getSearchButton().click();
        beliMinyak.getSkipGojek().click();
        beliMinyak.getChooseProduct().click();
        beliMinyak.getAddToCart().click();
        beliMinyak.getSeeCart().click();
        beliMinyak.getCheckout().click();
        beliMinyak.getCheckoutNextStep().click();
        //beliMinyak.getChooseInternetBankingMethod().click();
        //beliMinyak.getOptionInternetBanking().click();
        //beliMinyak.getChooseKlikBCA().click();
        beliMinyak.getInputPaymentUserId().type("q2wad2");
        beliMinyak.getSubmitCheckout().waitUntilClickable().click();
    }

    @Step
    public void checkAlreadyBought(){
        beliMinyak.getThankYouPage().isCurrentlyVisible();
    }

}
