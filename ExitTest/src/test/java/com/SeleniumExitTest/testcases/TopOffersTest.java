package com.SeleniumExitTest.testcases;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.TopOffersPage;

public class TopOffersTest extends BaseTest {
	@Test(groups = { "test", "invalid", "valid", "include" })
	public void seTopOffers() {

		TopOffersPage TOP = new TopOffersPage(driver);
		//TOP.getOnMainPage.click();
		TOP.TopOffersButton.click();
		TOP.ViewAllTopOffersButton.click();
		TOP.SelectCategoryAsStationary.click();
	}
}
