package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.studentLogin_PO;
import pageObjects.studentRegistration_PO;
import utils.GenericUtils;
import utils.Variables;

public class studentRegistration_SD {

	Variables variables;

	studentRegistration_PO studentregister;

	public studentRegistration_SD(Variables variables) {

		this.variables = variables;
		this.studentregister = variables.pageObjectManager.getstudentRegister();
	}

	@And("user will click on SignUp button directly")
	public void user_will_click_on__SignUp_page() throws Exception {

		studentregister.clickSiginUpBtn();
		Thread.sleep(2000);
	}

	@Then("^user enter the name (.+) and email (.+)$")
	public void user_enter_the_Name_and_Email(String Name, String Email) {

		studentregister.entername(Name);
		studentregister.enterEmail(Email);
	}

	@Then("^user enter the phone (.+) and password (.+)$")

	public void user_enter_the_phone_and_password(String contact, String pwd) {

		studentregister.enterPhoneno(contact);
		studentregister.enterpassword(pwd);
	}

	// user enter the name <Name> email <Email> phone <Phone> Passwsord <password>
	// and Confrimpassword <comfirmpassword>

	@Then("^user enter the name (.+) email (.+) phone (.+) Passwsord (.+) and Confrimpassword (.+)$")
	public void validatecredentials(String Name, String Email, String Phone, String pwd, String cpwd) {

		studentregister.entername(Name);
		studentregister.enterEmail(Email);
		studentregister.enterPhoneno(Phone);
		studentregister.enterpassword(pwd);
		studentregister.enterConfirmed(cpwd);

	}

	@And("user will click on Check box")
	public void checkbox() {

		studentregister.clickonCheckBox();
	}

	@And("SiguUp button should enabled and displayed")
	public void checkSiginUp() {
		GenericUtils.visibilityOfElementLocated(variables.driver, By.xpath("//*[text()='Sign Up']"));
		WebElement signUpbtn = GenericUtils.waitForElementToBeClickable(variables.driver,
				 By.xpath("//*[text()='Sign Up']"));
		Assert.assertTrue(signUpbtn.isDisplayed() && signUpbtn.isEnabled(), "SignUp button is not clickable");

	}

	@And("LoginHere button should enabled and displayed")
	public void checkLoginHere() {
		GenericUtils.visibilityOfElementLocated(variables.driver, By.cssSelector(".css-1ik2jfn"));
		WebElement LoginHere= GenericUtils.waitForElementToBeClickable(variables.driver,
				By.cssSelector(".css-1ik2jfn"));
		Assert.assertTrue(LoginHere.isDisplayed() && LoginHere.isEnabled(), "LoginHere button is not clicable");

	}
}
