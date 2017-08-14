package com.futures.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BeliMinyak extends PageObject{

    @FindBy(id = "gdn-already-login-label")
    private WebElementFacade alreadyLoginLabel;

    @FindBy(xpath = "//*[@id=\"autocomplete-wrapper\"]/div[1]/input")
    private WebElementFacade inputSearch;

    @FindBy(id = "gdn-search-button")
    private WebElementFacade searchButton;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[4]/nav/div[2]/button")
    private WebElementFacade skipGojek;

    @FindBy(xpath = "//*[@id=\"catalogProductListContentDiv\"]/div[1]/div/a/div/div/div/div[1]/span/img")
    private WebElementFacade chooseProduct;

    @FindBy(id = "gdn-add-to-cart-top")
    private WebElementFacade addToCart;

    @FindBy(id = "gdn-cart-button")
    private WebElementFacade seeCart;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section/div/div[1]/div/div[3]/table/tbody/tr/td[1]/span[2]")
    private WebElementFacade latestProductBought;

    @FindBy(id = "gdn-sb-page-continue-checkout")
    private WebElementFacade checkout;

    @FindBy(id = "gdn-next-step")
    private WebElementFacade checkoutNextStep;

    @FindBy(xpath = "//*[@id=\"gdn-payment-list\"]/li[2]")
    private WebElementFacade chooseInternetBankingMethod;

    @FindBy(id = "gdn-payment-option-")
    private WebElementFacade optionInternetBanking;

    @FindBy(xpath = "//*[@id=\"gdn-payment-option-KlikBCA\"]/option[5]")
    private WebElementFacade chooseKlikBCA;

    @FindBy(id = "payment_userid")
    private WebElementFacade inputPaymentUserId;

    @FindBy(id = "gdn-submit-checkout")
    private WebElementFacade submitCheckout;

    @FindBy(xpath = "//*[@id=\"blibli-main-ctrl\"]/section")
    private WebElementFacade thankYouPage;

    public WebElementFacade getInputSearch() {
        return inputSearch;
    }

    public WebElementFacade getSearchButton() {
        return searchButton;
    }

    public WebElementFacade getChooseProduct() {
        return chooseProduct;
    }

    public WebElementFacade getAddToCart() {
        return addToCart;
    }

    public WebElementFacade getSkipGojek() {
        return skipGojek;
    }

    public WebElementFacade getSeeCart() {
        return seeCart;
    }

    public WebElementFacade getLatestProductBought() {
        return latestProductBought;
    }

    public WebElementFacade getAlreadyLoginLabel() {
        return alreadyLoginLabel;
    }

    public WebElementFacade getCheckout() {
        return checkout;
    }

    public WebElementFacade getCheckoutNextStep() {
        return checkoutNextStep;
    }

    public WebElementFacade getChooseInternetBankingMethod() {
        return chooseInternetBankingMethod;
    }

    public WebElementFacade getOptionInternetBanking() {
        return optionInternetBanking;
    }

    public WebElementFacade getChooseKlikBCA() {
        return chooseKlikBCA;
    }

    public WebElementFacade getInputPaymentUserId() {
        return inputPaymentUserId;
    }

    public WebElementFacade getSubmitCheckout() {
        return submitCheckout;
    }

    public WebElementFacade getThankYouPage() {
        return thankYouPage;
    }
}
