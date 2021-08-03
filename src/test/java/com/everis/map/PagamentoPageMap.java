package com.everis.map;

import com.everis.util.TestRule;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

public class PagamentoPageMap extends BasePageMap{

    public PagamentoPageMap() { PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this); }

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Número cartão']")
    protected MobileElement numeroDoCartao;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='Data de validade']")
    protected MobileElement dataDeValidade;

    @AndroidFindBy(xpath = "//android.widget.EditText[@text='CVC']")
    protected MobileElement numeroDeCVC;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/pagamento_botao_confirma_pagamento")
    protected MobileElement botaoPagamento;

    public String estaPresente(){
        if (isElementDisplayed(By.id("br.com.alura.aluraesporte:id/pagamento_botao_confirma_pagamento"))){
            return "Pagamentos";
        }else if (isElementDisplayed(By.id("br.com.alura.aluraesporte:id/detalhes_produto_botao_comprar"))){
            return "Comprar";
        }else if (isElementDisplayed(By.id("br.com.alura.aluraesporte:id/cadastro_usuario_botao_cadastrar"))){
            return "Cadastro";
        }else if (isElementDisplayed(By.id("br.com.alura.aluraesporte:id/login_botao_logar"))){
            return "Login";
        } else {
            return "Home";
        }
    }

}
