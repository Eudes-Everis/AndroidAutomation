package com.everis.steps;

import org.junit.Assert;

import com.everis.pages.AnimationPage;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AnimationSteps {

	@Quando("^aciono o \"Flip\"$")
	public void acionarFlip() {
		AnimationPage animationPage = new AnimationPage();
		animationPage.acionarFlip();
	}
	
	@Entao("^os registros devem girar apresentando o valor \"(.*)\"$")
	public void apresentouValor(String valor) {
		AnimationPage animationPage = new AnimationPage();
		Assert.assertTrue("Deveria ter apresentado o valor [" + valor + "].", 
				animationPage.apresentouValor(valor));
	}

}