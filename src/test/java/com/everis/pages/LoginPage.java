package com.everis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.everis.util.Hooks;

public class LoginPage extends BasePage{

    @FindBy(id = "email")
    protected WebElement campoEmail;

    @FindBy(id = "passwd")
    protected WebElement campoSenha;

    @FindBy(id = "SubmitLogin")
    protected WebElement botaoLogin;

    public LoginPage() {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void realizarLogin() {
        campoEmail.sendKeys("menendesbruno@gmail.com");
        campoSenha.sendKeys("123456");
        botaoLogin.click();
    }
}
