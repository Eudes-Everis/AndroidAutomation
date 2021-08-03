package com.everis.steps;

import com.everis.pages.LoginPage;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
    @Quando("^acesso à tela de cadastro$")
    public void acessarMenuTextFields() {
        LoginPage loginPage = new LoginPage();
        loginPage.acessarTelaCadastro();
    }

    @Quando("^logar com usuário \"(.*?)\" e senha \"(.*?)\"$")
    public void acessarMenuTextFields(String nome, String senha) {
        LoginPage loginPage = new LoginPage();
        loginPage.preencherLogin(nome, senha);
        loginPage.acessarTelaPrincipal();
    }
}
