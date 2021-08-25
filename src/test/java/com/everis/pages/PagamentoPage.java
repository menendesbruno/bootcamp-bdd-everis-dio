package com.everis.pages;

import com.everis.util.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PagamentoPage extends BasePage{

    @FindBy(xpath = "//*[@Class='cheque-indent']")
    protected WebElement textoConfirmacao;

    @FindBy(xpath = "//*[@Title='Pay by bank wire']")
    protected WebElement botaoPagamento;

    @FindBy(xpath = "//*[text()='I confirm my order']")
    protected WebElement confirmacaoPagamento;

    public PagamentoPage()
    {
        PageFactory.initElements(Hooks.getDriver(), this);
    }

    public void confirmarPagamento() {
        botaoPagamento.click();
        confirmacaoPagamento.click();
    }


    public boolean verificaPagamento() {
        String textoEsperado = "Your order on My store is complete.";
        boolean verificaPagamento = textoEsperado.equals(textoConfirmacao.getAttribute("nodeValue"));
        if (verificaPagamento){
            log("O pagamento foi confirmado");
            return true;
        }

        logFail("O pagamento nao foi confirmado");
        return false;
    }
}
