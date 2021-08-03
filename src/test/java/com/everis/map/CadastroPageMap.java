package com.everis.map;

import com.everis.util.TestRule;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class CadastroPageMap extends BasePageMap {
    public CadastroPageMap() {
        PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this);
    }

    protected By erroId() {
        if(isElementDisplayed(By.id("br.com.alura.aluraesporte:id/mensagem_erro_login"))){
            return By.id("br.com.alura.aluraesporte:id/mensagem_erro_login");
        } else if(isElementDisplayed(By.id("br.com.alura.aluraesporte:id/erro_cadastro"))){
            return By.id("br.com.alura.aluraesporte:id/erro_cadastro");
        }else {
            return By.id("");
        }
    }
    protected String display(String erroPage) {
        if(isElementDisplayed(By.id("br.com.alura.aluraesporte:id/mensagem_erro_login"))){
            return erroPage = "login";
        } else if(isElementDisplayed(By.id("br.com.alura.aluraesporte:id/erro_cadastro"))){
            return erroPage = "cadastro";
        }else {
            return erroPage = "null";
        }
    }

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_nome")
    protected MobileElement digitarNome;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
    protected MobileElement digitarSenha;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_confirmar_senha")
    protected MobileElement digitarConfirmarSenha;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar")
    protected MobileElement botaoCadastrar;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/erro_cadastro")
    protected MobileElement mensagemErroCadastro;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/mensagem_erro_login")
    protected MobileElement mensagemErroLogin;

}
