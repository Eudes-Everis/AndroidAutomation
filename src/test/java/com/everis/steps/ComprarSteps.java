package com.everis.steps;

import com.everis.pages.ComprarPage;
import com.everis.pages.HomePage;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ComprarSteps {

    @Quando("^clicar em comprar$")
    public void comprarProduto() {
        ComprarPage comprarPage = new ComprarPage();
        comprarPage.comprar();
    }
}
