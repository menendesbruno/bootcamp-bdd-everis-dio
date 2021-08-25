package com.everis.steps;

import com.everis.pages.DetalheProdutoPage;
import io.cucumber.java.an.E;

public class DetalheProdutoSteps {

    @E("^aumenta a quantidade produto$")
    public void aumentarQuantidadeProduto(){
        DetalheProdutoPage detalheProduto = new DetalheProdutoPage();
        detalheProduto.aumentarQuantidadeProduto();
    }
}
