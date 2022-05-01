package com.SeleniumExitTest.testcases;

import org.testng.annotations.Test;

import com.SeleniumExitTest.pages.TravelPage;
@Test
public class TravelPageTest extends BaseTest{

	public TravelPageTest() {
		TravelPage TP = new TravelPage(driver);
		TP.TravelButton.click();
		TP.DepartureCity.sendKeys("BOM");
		TP.DestinationCity.sendKeys("LKO");
		TP.DepartureDateSelector.click();
		TP.ArrivalDateSelector.click();
		TP.DepartureDateSelector.click();
		TP.DoneButton.click();
	}
	
}
