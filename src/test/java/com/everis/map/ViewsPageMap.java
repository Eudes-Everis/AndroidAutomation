package com.everis.map;

import org.openqa.selenium.support.PageFactory;

import com.everis.util.TestRule;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ViewsPageMap extends BasePageMap {

	public ViewsPageMap() {
		PageFactory.initElements(new AppiumFieldDecorator(TestRule.getDriver()), this);
	}
	
	@AndroidFindBy(accessibility = "TextFields")
	protected MobileElement textFields;
	
	@AndroidFindBy(id = "io.appium.android.apis:id/edit")
	protected MobileElement editHintText;
	
	@AndroidFindBy(xpath = "//android.view.ViewGroup/android.widget.TextView")
	protected MobileElement actionBar;

}