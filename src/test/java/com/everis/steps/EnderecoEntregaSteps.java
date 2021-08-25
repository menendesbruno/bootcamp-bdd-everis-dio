package com.everis.steps;

import com.everis.pages.EnderecoEntregaPage;
import io.cucumber.java.pt.E;

public class EnderecoEntregaSteps {

    @E("^confirma o endereco de entrega$")
    public void confirmarEndereco(){
        EnderecoEntregaPage enderecoEntregaPage = new EnderecoEntregaPage();
        enderecoEntregaPage.confirmaEndereco();

    }
}
