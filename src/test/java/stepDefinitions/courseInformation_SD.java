package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.courseInformation_PO;
import utils.GenericUtils;
import utils.Variables;

public class courseInformation_SD {

	Variables variables;

	courseInformation_PO courseInformation;
	// =new courseInformation_PO();

	public courseInformation_SD(Variables variables) {
		this.variables = variables;
		this.courseInformation = variables.pageObjectManager.getcourseInformation();
	}

	@Then("^user will click on enroll dropdown and select (.+)$")
    public void clickonEnroll(String option) {
        // Scroll down
        GenericUtils.scrollBy(variables.driver, 0, 500);

        // Check if the 'Click here to start learning' button is present
        if (isElementPresent(By.xpath("//*[text()='Click here to start learning']"))) {
            WebElement startLearning = variables.driver.findElement(By.xpath("//*[text()='Click here to start learning']"));
            startLearning.click();
        } else {
//            courseInformation.clickEnrollDropDown();
//            courseInformation.selectOptionFromDropdown(option);
        	  courseInformation.clickOnEnrollFree();
        }
    }


	@And("user will click on SiginIn button")
	public void clickOnSiginIn() throws InterruptedException {
		courseInformation.clickSiginButton();
		Thread.sleep(2000);

	}
	private boolean isElementPresent(By by) {
        try {
            variables.driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
