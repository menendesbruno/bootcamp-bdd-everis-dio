package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnderecoEntregaPage extends BasePage{

    @FindBy(xpath = "//*[text()='Proceed to checkout']")
    protected WebElement botaoAcessarCheckout;

    public EnderecoEntregaPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void confirmaEndereco() {
        botaoAcessarCheckout.click();
    }
}
