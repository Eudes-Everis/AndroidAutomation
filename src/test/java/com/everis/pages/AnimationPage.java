package com.everis.pages;

import com.everis.map.AnimationPageMap;
import org.openqa.selenium.By;

public class AnimationPage extends AnimationPageMap {

	public void acessarMenuViewFlip() {
		swipeFromBottomToUp(2);
		viewFlip.click();
		log("Acessou o menu View Flip");
	}

	public void acionarFlip() {
		flip.click();
		log("Acionou o flip");
	}

	public boolean apresentouValor(String valor) {
		waitElement(By.xpath("//*[@text='" + valor + "']"), 5);
		boolean apresentouValorEsperado = isElementDisplayed(By.xpath("//*[@text='" + valor + "']"));
		if (apresentouValorEsperado) {
			log("O valor [" + valor + "] foi apresentado corretamente");
			return true;
		}
		logFail("Deveria ter apresentado o valor [" + valor + "]");
		return false;
	}

}