package com.SeleniumExitTest.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.GrocerryPage;

public class GrocerrypageTest2 extends BaseTest {

	@Test(groups = { "test", "invalid", "valid", "include" })

	public void SearchGrocerry2() {
		GrocerryPage GP1 = new GrocerryPage(driver);
		//GP1.getOnMainPage.click();
		GP1.GrocerryPageHyperlink.click();
		GP1.AcceptCurrentLocation.click();
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		GP1.GrocerryPageSearchBox.sendKeys("Aashirvaad flour 5kg");
		GP1.GrocerrySearchButton.click();
		//driver.close();

	}

}
