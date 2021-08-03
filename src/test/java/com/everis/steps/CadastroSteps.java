package com.everis.steps;

import com.everis.pages.CadastroPage;
import com.everis.pages.HomePage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

import static org.junit.Assert.assertEquals;

public class CadastroSteps {

    @E("^realizar cadastro com usuario \"(.*?)\", senha \"(.*?)\" e confirmação de senha \"(.*?)\"$")
    public void acessarMenuTextFields(String nome, String senha, String confirmacao) {
        CadastroPage cadastroPage = new CadastroPage();
        cadastroPage.preencherFormulario(nome, senha, confirmacao);
        cadastroPage.cadastrar();
    }

    @Então("^Exibe mensagem de erro \"(.*?)\"$")
    public void mensagemErro(String erro) {
        CadastroPage cadastroPage = new CadastroPage();
        String erroAtual = cadastroPage.mensagemErro();
        assertEquals("A mensagem está incorreta! \n a mensagem encontrada foi: " + erroAtual, erro, erroAtual);
    }
}
