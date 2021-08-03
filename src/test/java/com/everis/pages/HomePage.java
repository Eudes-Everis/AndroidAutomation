package com.everis.pages;

import com.everis.map.HomePageMap;

public class HomePage extends HomePageMap {

    public void fazerLogout(){
        clicarNoBotaoLogoutOuVoltar();
    }

    public void escolherProduto(String produto) {
        itemDaLista(produto).click();
    }

    public void listaDePagamentos() {
        botaolistaPagamento.click();
    }

    public int listaDeComprasRealizadas(){
        int quantidade = 0;
        quantidade = contagemDeCompras(quantidade);
        return quantidade;
    }

    public void listaDeProdutos(){
        botaolistaProdutos.click();
    }
}
