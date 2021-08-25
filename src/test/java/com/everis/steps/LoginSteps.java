package com.everis.steps;

import com.everis.pages.LoginPage;
import io.cucumber.java.pt.E;


public class LoginSteps {
    @E("^realiza o login$")
    public void realizarLogin(){
        LoginPage loginPage = new LoginPage();
        loginPage.realizarLogin();
    }
}
