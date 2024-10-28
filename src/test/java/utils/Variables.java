package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;

public class Variables {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;

	public Variables() throws IOException {
		testBase = new TestBase();
		driver = testBase.WebDriverManager();
		pageObjectManager = new PageObjectManager(driver);
	}
}
