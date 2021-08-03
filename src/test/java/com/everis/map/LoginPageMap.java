package com.everis.map;

import com.everis.util.TestRule;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class LoginPageMap extends BasePageMap{

    public LoginPageMap() { PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this); }

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_cadastrar_usuario")
    protected MobileElement botaoCadastro;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_usuario")
    protected MobileElement loginUsuario;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/input_senha")
    protected MobileElement loginSenha;

    @AndroidFindBy(id = "br.com.alura.aluraesporte:id/login_botao_logar")
    protected MobileElement botaoLogin;

}
