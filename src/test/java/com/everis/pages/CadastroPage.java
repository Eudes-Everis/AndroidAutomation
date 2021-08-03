package com.everis.pages;

import com.everis.constants.TimeOutConstants;
import com.everis.map.CadastroPageMap;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CadastroPage extends CadastroPageMap {

    public void preencherFormulario(String usuario, String senha, String confirmacao) {
        digitarNome.setValue(usuario);
        digitarSenha.setValue(senha);
        digitarConfirmarSenha.setValue(confirmacao);
    }

    public void cadastrar() {
        botaoCadastrar.click();
    }

    public String mensagemErro() {
        String erroPage = "";
        erroPage = display(erroPage);
        if (erroPage.equals("cadastro")) {
            waitElement(erroId(), TimeOutConstants.MIN_SECONDS);
            return mensagemErroCadastro.getText();
        } else if (erroPage.equals("login")) {
            waitElement(erroId(), TimeOutConstants.MIN_SECONDS);
            return mensagemErroLogin.getText();
        } else {
            return "";
        }
    }

    public boolean existeMensagem() {
        By id = erroId();
        if (!id.equals(By.id(""))) {
            return isElementDisplayed(id);
        } else{
            return false;
        }
    }
}
