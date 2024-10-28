package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageObjects.studentLogin_PO;
import utils.GenericUtils;
import utils.Variables;

public class studentLogin_SD {

	Variables variables;

	studentLogin_PO studentlogin;

	public studentLogin_SD(Variables variables) {

		this.variables = variables;
		this.studentlogin = variables.pageObjectManager.studentLogin();
	}

	@Then("^student will enter (.+) and (.+) and click on sigin button$")
	public void student_will_enter_and_the_message_should_display(String email, String pwd) {

		studentlogin.enterEmail(email);
		studentlogin.enterpassword(pwd);
		studentlogin.siginInButton();

	}

	@Then("^the (.+) message should display$")
	public void the_messgae_should_display(String expectedMessage) {

		GenericUtils.visibilityOfElementLocated(variables.driver, By.xpath("//div[@id='notistack-snackbar']"));

		WebElement messageElement = variables.driver.findElement(By.cssSelector("#notistack-snackbar"));
		String actualMessage = messageElement.getText();
		Assert.assertEquals(expectedMessage, actualMessage);
		// variables.driver.quit();

	}

	@Then("student will click on siginbutton without entering credentials")
	public void student_will_click_on_siginbutton_without_entering_credentials() {

		studentlogin.siginInButton();
	}

	@Then("^student will enter (.+) and click on sigin$")
	public void student_will_enter_email_only(String email) {

		studentlogin.enterEmail(email);
		studentlogin.siginInButton();

	}

	@Then("the Sign In button should be clickable")
	public void the_Sign_In_button_should_be_clickable() {

		WebElement signInButton = GenericUtils.waitForElementToBeClickable(variables.driver,
				By.xpath("//*[text()='Sign In']"));
		Assert.assertTrue(signInButton.isDisplayed() && signInButton.isEnabled(), "Sign In button is not clickable");

	}

	@Then("the remember button should be clickable")
	public void the_remember_button_should_clickable() {

		WebElement checkbox = GenericUtils.waitForElementToBeClickable(variables.driver,
				By.xpath("//*[text()='Remember me']"));
		Assert.assertTrue(checkbox.isDisplayed(), "The 'Remember Me' checkbox is not displayed.");
		Assert.assertTrue(checkbox.isEnabled(), "The 'Remember Me' checkbox is not enabled.");

	}

	@Then("user will check ForgetPassword button is Enabled and Displayed or not")
	public void user_will_check_ForgetPassword_button_is_Enabled_and_Displayed_or_not() {

		WebElement forgetpwdbtn = GenericUtils.waitForElementToBeClickable(variables.driver,
				By.cssSelector(".css-bv1b19"));
		Assert.assertTrue(forgetpwdbtn.isDisplayed() && forgetpwdbtn.isEnabled(),
				"ForgetPassword button is not clickable");

	}

	@Then("user will check SiginUp button is Enabled and Displayed or not")
	public void user_will_check_SiginUp_button_is_Enabled_and_Displayed_or_not() {

		WebElement signUpbtn = GenericUtils.waitForElementToBeClickable(variables.driver,
				By.cssSelector(".css-1ik2jfn"));
		Assert.assertTrue(signUpbtn.isDisplayed() && signUpbtn.isEnabled(), "SignUp button is not clickable");
	}
	
	
	
	@Then("user will click on SignUp Here")
	public void user_will_click_on_SignUp_page() {

		studentlogin.clickSignUpbutton();
	}
	
	

}
