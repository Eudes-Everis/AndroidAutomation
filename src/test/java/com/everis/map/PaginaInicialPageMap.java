package com.everis.map;

import org.openqa.selenium.support.PageFactory;

import com.everis.util.TestRule;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PaginaInicialPageMap extends BasePageMap {

	public PaginaInicialPageMap() {
		PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this);
	}
	
	@AndroidFindBy(accessibility = "Views")
	protected MobileElement views;
	
	@AndroidFindBy(accessibility = "Animation")
	protected MobileElement animation;

}