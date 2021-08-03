package com.everis.steps;

import com.everis.pages.CadastroPage;
import com.everis.pages.ComprarPage;
import com.everis.pages.HomePage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.assertEquals;

public class HomeSteps {

    @Então("^voltar para tela de login$")
    public void voltarParaTelaLogin() {
        HomePage homePage = new HomePage();
        homePage.fazerLogout();
    }

    @Então("^comprar o item \"(.*?)\"$")
    public void comprarProduto(String produto) {
        HomePage homePage = new HomePage();
        homePage.escolherProduto(produto);
        ComprarPage comprarPage = new ComprarPage();
        String tituloAtual = comprarPage.chamarTitulo();
        assertEquals("O título está incorreto! \n O título do produto encontrado foi: " + tituloAtual, produto, tituloAtual);
    }

    @Então("entrar na lista de pagamentos")
    public void conferirPagamento(){
        HomePage homePage = new HomePage();
        homePage.listaDePagamentos();
    }

    @E("voltar para lista de produtos")
    public void voltarParaListaDeProdutos(){
        HomePage homePage = new HomePage();
        homePage.listaDeProdutos();
    }

    @E("^conferir quantidade de compras se é igual à \"(.*?)\"$")
    public void conferirQuantidade(int quantidade){
        HomePage homePage = new HomePage();
        int quantidadeDeComprasAtual = homePage.listaDeComprasRealizadas();
        assertEquals("A quantidade está incorreta! \n a quantidade encontrada foi: " + quantidadeDeComprasAtual, quantidade, quantidadeDeComprasAtual);
    }

}
