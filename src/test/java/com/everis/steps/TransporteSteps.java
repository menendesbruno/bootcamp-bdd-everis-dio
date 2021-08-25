package com.everis.steps;

import com.everis.pages.TransportePage;
import io.cucumber.java.pt.E;

public class TransporteSteps {
    @E("^escolhe a forma de transporte$")
    public void escolherTransporte(){
        TransportePage transportePage = new TransportePage();
        transportePage.escolherTransporte();
    }
}
