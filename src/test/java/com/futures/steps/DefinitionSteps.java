package com.futures.steps;

import com.futures.Behaviour.BeliMinyakBehaviour;
import com.futures.Behaviour.BlibliHomePageBehaviour;
import com.futures.pages.BeliMinyak;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.futures.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps endUser;
    @Steps
    BlibliHomePageBehaviour blibliHomePageBehaviour;
    @Steps
    BeliMinyakBehaviour beliMinyakBehaviour;

    @Given("the user is on the Wikionary home page")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        endUser.is_the_home_page();
    }

    @When("the user looks up the definition of the word '$word'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        endUser.looks_for(word);
    }

    @Then("they should see the definition '$definition'")
    public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
        endUser.should_see_definition(definition);
    }

    @Given("home page is opened")
    public void givenOpenHomePage(){
        blibliHomePageBehaviour.open();
    }

    @When("I login to blibli")
    public void whenLoginHomePage(){
        blibliHomePageBehaviour.clickUserLogin();
    }

    @Then("I can see my name in the site")
    public void thenAlreadyLogin(){
        blibliHomePageBehaviour.checkUserAlreadyLoggedIn();
    }

    @Given("already logged in")
    public void givenAlreadyLogin(){
        beliMinyakBehaviour.checkUserAlreadyLoggedIn();
    }

    @When("I search minyak goreng")
    public void whenSearch(){
        beliMinyakBehaviour.inputSearch();
    }

    @Then("I can see product list")
    public void thenCheckAlreadyBought(){
        beliMinyakBehaviour.checkAlreadyBought();
    }

}
