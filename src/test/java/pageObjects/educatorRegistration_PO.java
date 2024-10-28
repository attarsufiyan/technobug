package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.GenericUtils;

public class educatorRegistration_PO {

	public WebDriver driver;

	public educatorRegistration_PO(WebDriver driver) {

		this.driver = driver;

	}

	By enterName = By.xpath("//input[@id='name']");
	By enterEmail = By.xpath("//input[@id='email']");
	By enterContact = By.xpath("//input[@id='phoneNumber']");
	By fieldTeach= By.xpath("//input[@id='field']");
	By subjectbox=By.xpath("//input[@id='subject']");
	By enterPwd = By.xpath("//input[@id='password']");
	By enterConfirmed = By.xpath("//input[@id='confirmPassword']");
	By SiginUpbtn = By.cssSelector(".css-nxzcop");
	By SiginUp=By.xpath("//*[text()='Sign Up']");
	By checkbox = By.cssSelector(".css-1m9pwf3");
	By loginhere = By.cssSelector(".css-1ik2jfn");

	public void entername(String name) {
		driver.findElement(enterName).sendKeys(name);
	}

	public void enterEmail(String email) {

		driver.findElement(enterEmail).sendKeys(email);
	}

	public void enterPhoneno(String contactNumber) {

		driver.findElement(enterContact).sendKeys(contactNumber);
	}
	
	public void enterteachingfield(String teaching) {

		driver.findElement(fieldTeach).sendKeys(teaching);
	}
	
	public void enterSubject(String subject) {

		driver.findElement(subjectbox).sendKeys(subject);
	}
	

	public void enterpassword(String pwd) {
		driver.findElement(enterPwd).sendKeys(pwd);

	}

	public void enterConfirmed(String pwd) {
		driver.findElement(enterConfirmed).sendKeys(pwd);

	}

	public void clickSiginUpBtn() {

		driver.findElement(SiginUpbtn).click();
	}

	public void clickonCheckBox() {

		driver.findElement(checkbox).click();
	}

	public void verifyloginherebutton() {

		driver.findElement(loginhere).isDisplayed();

	}

	public void verifySiginUpbutton() {

		driver.findElement(SiginUp).isDisplayed();

	}

}
