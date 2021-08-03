package com.everis.steps;

import com.everis.constants.TimeOutConstants;
import com.everis.pages.PagamentoPage;
import io.cucumber.java.pt.E;

import static org.junit.Assert.assertEquals;

public class PagamentoSteps {

    @E("^realizar pagamento com numero do cartao \"(.*?)\", data de validade \"(.*?)\" e CVC \"(.*?)\"$")
    public void realizarPagamentoComDadosDoCartao(String numeroDoCartao, String dataDeValidade, String numeroDeCVC) {
        PagamentoPage informarCartao = new PagamentoPage();
        informarCartao.cartao(numeroDoCartao,dataDeValidade,numeroDeCVC);
    }

    @E("^clicar comprar na pagina pagamentos$")
    public void clilcarComprarNaPaginaPagamentos() {
        PagamentoPage clicarComprar = new PagamentoPage();
        clicarComprar.clicar();
    }

    @E("^continua na página \"(.*?)\"$")
    public void verificarSeContinuaNaPaginaRequerida(String pagina) throws InterruptedException {
        PagamentoPage localizarPagina = new PagamentoPage();
        String paginaAtual = localizarPagina.localizar();
        assertEquals("A página está incorreta! \n A página encontrada foi: " + paginaAtual, pagina,paginaAtual);
    }


}
