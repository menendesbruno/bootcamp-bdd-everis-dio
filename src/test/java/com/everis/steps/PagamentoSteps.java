package com.everis.steps;

import com.everis.pages.PagamentoPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

public class PagamentoSteps {
    @Quando("^o pagamento for confirmado$")
    public void confirmarPagamento(){
        PagamentoPage pagamentoPage = new PagamentoPage();
        pagamentoPage.confirmarPagamento();
    }

    @Entao("^deve ser apresentado a mensagem \"Your order on My store is complete.\"$")
    public void verificaPagamento(){
        PagamentoPage pagamentoPage = new PagamentoPage();
        Assert.assertTrue("Não foi confirmado o pagamento",
                pagamentoPage.verificaPagamento());
    }

}
