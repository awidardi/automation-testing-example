package com.futures.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BlibliHomePage extends PageObject{

    @FindBy(id = "gdn-login-registrasi")
    private WebElementFacade loginButton;

    @FindBy(id = "gdn-login-modal-body")
    private WebElementFacade popupLoginForm;

    @FindBy(id = "loginEmail")
    private WebElementFacade inputLoginEmail;

    @FindBy(id = "loginPassword")
    private WebElementFacade inputLoginPassword;

    @FindBy(id = "gdn-already-login-label")
    private WebElementFacade alreadyLoginLabel;

    public WebElementFacade getLoginButton() {
        return loginButton;
    }

    public WebElementFacade getPopupLoginForm() {
        return popupLoginForm;
    }

    public WebElementFacade getInputLoginEmail() {
        return inputLoginEmail;
    }

    public WebElementFacade getInputLoginPassword() {
        return inputLoginPassword;
    }

    public WebElementFacade getAlreadyLoginLabel() {
        return alreadyLoginLabel;
    }
}
