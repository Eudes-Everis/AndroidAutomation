package com.everis.pages;

import com.everis.map.LoginPageMap;

public class LoginPage extends LoginPageMap {

    public void acessarTelaCadastro() {
        botaoCadastro.click();
    }

    public void preencherLogin(String nome, String senha) {
        loginUsuario.setValue(nome);
        loginSenha.setValue(senha);
    }

    public void acessarTelaPrincipal() {
        botaoLogin.click();
    }
}
