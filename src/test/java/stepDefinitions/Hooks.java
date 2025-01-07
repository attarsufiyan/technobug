package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import pageObjects.PageObjectManager;
import utils.TestBase;
import utils.Variables;

public class Hooks {

	Variables variables;
	ExtentTest test;

	public Hooks(Variables variables) {
		this.variables = variables;
	}

	@Before
	public void setUp() throws IOException {
		// Initialize the WebDriver and PageObjectManager before each scenario
		variables.testBase = new TestBase();
		variables.driver = variables.testBase.WebDriverManager();
		variables.pageObjectManager = new PageObjectManager(variables.driver);
	}

	@After
	public void tearDown() {
		// Quit the WebDriver after each scenario
		if (variables.driver != null) {
			variables.testBase.quitDriver();
		}
	}

	@AfterStep
    public void AddScreenshot(Scenario scenario) throws IOException {
        WebDriver driver = variables.testBase.WebDriverManager();
        if (scenario.isFailed()) {
            File sourcepath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);  // Corrected interface name
            byte[] filecontent = FileUtils.readFileToByteArray(sourcepath);
            scenario.attach(filecontent, "image/png", "image");
            
            
            test.addScreenCaptureFromPath(sourcepath.getAbsolutePath());
            test.log(Status.FAIL, "Step failed: " + scenario.getName());
        }

	}

}
