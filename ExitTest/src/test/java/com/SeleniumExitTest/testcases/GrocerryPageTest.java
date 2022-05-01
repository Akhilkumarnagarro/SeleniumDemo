package com.SeleniumExitTest.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.GrocerryPage;

public class GrocerryPageTest extends BaseTest {
	@Test(groups = { "test", "invalid", "valid", "include" }, priority = 2)
	public void SearchGrocerry() {

		GrocerryPage GP = new GrocerryPage(driver);
		//GP.getOnMainPage.click();
		GP.GrocerryPageHyperlink.click();
		GP.AcceptCurrentLocation.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		GP.GrocerryPageSearchBox.sendKeys("India Gate Basmati Rice 5kg");
		GP.GrocerrySearchButton.click();
		//driver.close();
	}

}
