package com.everis.map;

import com.everis.util.TestRule;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ComprarPageMap extends BasePageMap{

    public ComprarPageMap() { PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this); }

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/detalhes_produto_botao_comprar")
    public MobileElement botaocomprar;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/detalhes_produto_nome")
    protected MobileElement titulo;

}
