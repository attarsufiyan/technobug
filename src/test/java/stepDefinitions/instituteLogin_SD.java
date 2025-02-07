package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.instituteLogin_PO;
import utils.GenericUtils;
import utils.Variables;

public class instituteLogin_SD {

	// public WebDriver driver;
	Variables variables;

	public instituteLogin_SD(Variables variables) {

		this.variables = variables;
	}

	@Then("^institute will enter (.+) and (.+) and click on sigin button$")
	public void institute_will_enter_and_the_message_should_display(String email, String pwd)
			throws InterruptedException {

		instituteLogin_PO institutelogin = variables.pageObjectManager.instituteLogin();
		institutelogin.enterEmail(email);
		institutelogin.enterpassword(pwd);
		institutelogin.siginInButton();

	}

	@Then("^to institute (.+) message should display$")
	public void the_messgae_should_display(String expectedMessage) {

		GenericUtils.visibilityOfElementLocated(variables.driver, By.cssSelector("#notistack-snackbar"));

		WebElement messageElement = variables.driver.findElement(By.cssSelector("#notistack-snackbar"));
		String actualMessage = messageElement.getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		variables.driver.quit();

	}

	@Then("^institute will enter (.+) and click on sigin$")
	public void institute_will_enter_email_only(String email) {

		instituteLogin_PO institutelogin = variables.pageObjectManager.instituteLogin();
		institutelogin.enterEmail(email);
		institutelogin.siginInButton();

	}

	@Then("institute will click on siginbutton without entering credentials")
	public void institute_will_click_on_siginbutton_without_entering_credentials() {

		instituteLogin_PO institutelogin = variables.pageObjectManager.instituteLogin();
		institutelogin.siginInButton();

	}

}
