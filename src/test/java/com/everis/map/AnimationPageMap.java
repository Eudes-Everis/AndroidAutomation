package com.everis.map;

import org.openqa.selenium.support.PageFactory;

import com.everis.util.TestRule;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AnimationPageMap extends BasePageMap {

	public AnimationPageMap() {
		PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this);
	}

	@AndroidFindBy(accessibility = "View Flip")
	protected MobileElement viewFlip;
	
	@AndroidFindBy(accessibility = "Flip")
	protected MobileElement flip;

}