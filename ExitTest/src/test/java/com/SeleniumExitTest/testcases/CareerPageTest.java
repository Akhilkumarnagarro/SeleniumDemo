package com.SeleniumExitTest.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.CareerPage;

public class CareerPageTest extends BaseTest {
	@Test(groups = { "test", "invalid", "valid", "include" })
	public void AvailableCareer() throws InterruptedException {
		CareerPage CP = new CareerPage(driver);
		// CP.getOnMainPage.click();

		CP.CareerButtonHYPERLINK.click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		CP.CareerSearchBox.sendKeys("Quality Assurance");

		CP.CareerSearchButton.click();

		CP.ClosePopUpContinue.click();

		// CP.CandidateLoginButton.click();

		CP.RecentOpeningSearchBox.sendKeys("QA");
		CP.RecentOpeningSearchButton.click();

		CP.SelectOpening.click();

	}

}
