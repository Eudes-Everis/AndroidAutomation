package com.everis.map;

import com.everis.util.TestRule;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePageMap extends BasePageMap{

    public HomePageMap() { PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this); }

    @AndroidFindBy(accessibility = "Deslogar")
    protected MobileElement botaoLogout;

    public void clicarNoBotaoLogoutOuVoltar(){
        if(isElementDisplayed(By.id("br.com.alura.aluraesporte:id/menu_principal_deslogar"))){
            botaoLogout.click();
        } else {
            voltar();
        }
    }

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/lista_produtos_recyclerview")
    protected MobileElement campoDaLista;

    public MobileElement itemDaLista(String nome){
        MobileElement produto = campoDaLista.findElementByXPath("//android.widget.TextView[contains(@text, '" + nome + "')]");
        return produto;
    }

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/listaProdutos")
    protected MobileElement botaolistaProdutos;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/listaPagamentos")
    protected MobileElement botaolistaPagamento;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/lista_pagamentos_recyclerview")
    protected MobileElement comprasRealizadas;

    public int contagemDeCompras(int quantidadeDeCompras){
       List<MobileElement> listaItens =  comprasRealizadas.findElementsByXPath("//android.view.ViewGroup");
       for(MobileElement item: listaItens){
           quantidadeDeCompras++;
       }
       return quantidadeDeCompras;
    }


}
