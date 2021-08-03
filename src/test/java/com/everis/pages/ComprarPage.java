package com.everis.pages;

import com.everis.map.ComprarPageMap;

public class ComprarPage extends ComprarPageMap {

    public void comprar() {
        botaocomprar.click();
    }

    public String chamarTitulo() {
        return titulo.getText();
    }


}
