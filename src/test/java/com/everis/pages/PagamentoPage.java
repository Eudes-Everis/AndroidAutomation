package com.everis.pages;

import com.everis.map.PagamentoPageMap;

public class PagamentoPage extends PagamentoPageMap {
    public void cartao(String numero, String Validade, String CVC) {
        numeroDoCartao.setValue(numero);
        dataDeValidade.setValue(Validade);
        numeroDeCVC.setValue(CVC);
        clicar();
    }

    public void clicar() {
        botaoPagamento.click();
    }

    public String localizar() {
            return estaPresente();
    }
}
