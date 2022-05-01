package com.SeleniumExitTest.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.SeleniumExitTest.utilities.Screenshots;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BaseTest {

	static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest extentTest;

	static File file = new File("./Resources/Config.properties");
	static FileInputStream fis = null;
	static Properties prop = new Properties();

	static {

		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			prop.load(fis);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@BeforeSuite(groups = { "test", "invalid", "valid", "include" })
	public void setExtent() {

		extent = new ExtentReports(".\\Reports\\ExtentReport.html");

	}

	@BeforeMethod(groups = { "test", "invalid", "valid", "include" })
	public void startTest(Method method) {

		String testName = method.getName();
		extentTest = extent.startTest(testName);

	}

	@AfterMethod(groups = { "test", "invalid", "valid", "include" })
	public void endTest() {
		extent.endTest(extentTest);
	}

	@AfterSuite(groups = { "test", "invalid", "valid", "include" })
	public void endReport() {
		extent.flush();
		extent.close();
	}

	@BeforeSuite(groups = { "test", "invalid", "valid", "include" })
	public static void initializeWebdriver() { // Set the path for chromeDriver
		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty(prop.getProperty("chromedriverProperty"), prop.getProperty("chromedriverPath"));
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		} else if (browserName.equals("edge")) {

			System.setProperty(prop.getProperty("edgedriverProperty"), prop.getProperty("edgedriverPath"));
			driver = new EdgeDriver();
		} else if (browserName.equals("headless")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("window_size=1400,800");
			options.addArguments("Headless");
			driver = new ChromeDriver(options);

		} else if (browserName.equals("Firefox")) {
			System.setProperty(prop.getProperty("FirefoxdriverProperty"), prop.getProperty("FirefoxdriverPath"));
			driver = new FirefoxDriver();
		} else {
			System.out.println("no browser value given");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		Integer stringtoInteger = Integer.parseInt(prop.getProperty("wait"));
		int stringInt = stringtoInteger.intValue();
		driver.manage().timeouts().implicitlyWait(stringInt, TimeUnit.SECONDS);

	}

	// ScreenShots
	@AfterMethod(groups = { "test", "invalid", "valid", "include" })
	public void attachscreenshot(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			String scrpath = Screenshots.captureScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(scrpath));
		}
	}

	@BeforeMethod(groups = { "test", "invalid", "valid", "include" })
	public static void openBrowser() {
		driver.get(prop.getProperty("url"));
	}

	@AfterSuite(groups = { "test", "invalid", "valid", "include" })
	public static void closeBrowser() {

		 driver.quit();
	}

}
