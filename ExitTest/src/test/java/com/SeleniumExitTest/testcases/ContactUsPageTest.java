package com.SeleniumExitTest.testcases;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.ContactUsPage;

public class ContactUsPageTest extends BaseTest {
	@Test(groups = { "test", "invalid", "valid", "include" })
	public void ContactUs() {

		ContactUsPage CSP = new ContactUsPage(driver);
		//CSP.getOnMainPage.click();
		CSP.ContactUsButton.click();
		CSP.PaymentButton.click();
		CSP.CreditCardEmiPaymentOption.click();

	}

}
