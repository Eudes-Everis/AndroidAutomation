package com.everis.pages;

import com.everis.map.ViewsPageMap;

public class ViewsPage extends ViewsPageMap {

	public void acessarMenuTextFields() {
		swipeFromBottomToUp(6);
		textFields.click();
		log("Acessou o menu TextFields");
	}

	public void informarValor(String valor) {
		editHintText.sendKeys(valor);
		log("Informou o valor [" + valor + "] no campo hint text");
	}

	public boolean apresentouTitulo(String titulo) {
		String tituloPaginaApresentado = actionBar.getText();
		if (titulo.equals(tituloPaginaApresentado)) {
			log("Apresentou o titulo da pagina conforme esperado [" + titulo + "]");
			return true;
		}
		logFail("Esperado [" + titulo + "] Resultado [" + tituloPaginaApresentado + "].");
		return false;
	}

}