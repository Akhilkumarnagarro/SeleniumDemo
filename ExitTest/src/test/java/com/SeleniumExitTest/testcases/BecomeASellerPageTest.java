package com.SeleniumExitTest.testcases;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.BecomeASellerPage;

public class BecomeASellerPageTest extends BaseTest {

	@Test(groups = { "test", "invalid", "valid", "include" })
	public void BecomeASellerPage() {
		BecomeASellerPage BASP = new BecomeASellerPage(driver);

		// BASP.getOnMainPage.click();
		BASP.BecomeASellerButton.click();
		BASP.HowToRegisterHyperLink.click();
		BASP.RegisterNowButton.click();
		BASP.PopUpDontAllowButton.click();

	}

}
