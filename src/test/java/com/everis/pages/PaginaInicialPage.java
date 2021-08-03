package com.everis.pages;

import com.everis.map.PaginaInicialPageMap;

public class PaginaInicialPage extends PaginaInicialPageMap {

	public void acessarMenuViews() {
		swipeFromBottomToUp(2);
		views.click();
		log("Acessou o menu Views");
	}

	public void acessarMenuAnimation() {
		animation.click();
		log("Acessou o menu Animation");
	}

}