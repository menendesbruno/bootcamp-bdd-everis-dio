package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransportePage extends BasePage{

    @FindBy(id = "cgv")
    protected WebElement checkTransporte;

    @FindBy(xpath = "//*[text()='Proceed to checkout']")
    protected WebElement botaoAcessarCheckout;

    public TransportePage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void escolherTransporte() {
        checkTransporte.click();
        botaoAcessarCheckout.click();
    }
}
