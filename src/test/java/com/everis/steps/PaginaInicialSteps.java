package com.everis.steps;

import com.everis.pages.AnimationPage;
import com.everis.pages.PaginaInicialPage;
import com.everis.pages.ViewsPage;
import com.everis.util.TestRule;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;

public class PaginaInicialSteps {

	@Dado("^que acessei o app android$")
	public void acessarApp() {
		TestRule.openApplicationAndroid("/app/alura_esporte.apk");
	}
	
	@E("^acesso o menu \"Views > TextFields\"$")
	public void acessarMenuTextFields() {
		PaginaInicialPage inicialPage = new PaginaInicialPage();
		inicialPage.acessarMenuViews();
		ViewsPage viewsPage = new ViewsPage();
		viewsPage.acessarMenuTextFields();
	}
	
	@E("^acesso o menu \"Animation > View Flip\"$")
	public void acessarMenuViewFlip() {
		PaginaInicialPage inicialPage = new PaginaInicialPage();
		inicialPage.acessarMenuAnimation();
		AnimationPage animationPage = new AnimationPage();
		animationPage.acessarMenuViewFlip();
	}

}
