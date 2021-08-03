package com.everis.steps;

import org.junit.Assert;

import com.everis.pages.ViewsPage;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ViewsSteps {

	@Quando("^informo o valor \"(.*)\"$")
	public void informarValor(String valor) {
		ViewsPage viewsPage = new ViewsPage();
		viewsPage.informarValor(valor);
	}
	
	@Entao("^deve o titulo da pagina deve apresentar o valor \"(.*)\"$")
	public void apresentouTitulo(String titulo) {
		ViewsPage viewsPage = new ViewsPage();
		Assert.assertTrue("Deveria ter apresentado o titulo da pagina [" + titulo + "].", 
				viewsPage.apresentouTitulo(titulo));
	}

}