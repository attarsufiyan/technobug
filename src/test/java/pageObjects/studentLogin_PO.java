package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.GenericUtils;

public class studentLogin_PO {

	public WebDriver driver;

	public studentLogin_PO(WebDriver driver) {

		this.driver = driver;

	}

	By enterEmail = By.xpath("//input[@id='email']");
	By enterPwd = By.xpath("//input[@id='password']");
	By siginInButton = By.xpath("//*[text()='Sign In']");	
	By message = By.xpath("//div[@id='notistack-snackbar']");
	By forgetPassword = By.cssSelector(".css-bv1b19");
	By SiginUpbtn = By.cssSelector(".css-1ik2jfn");
	

	public void enterEmail(String email) {
		driver.findElement(enterEmail).sendKeys(email);

	}

	public void enterpassword(String pwd) {
		driver.findElement(enterPwd).sendKeys(pwd);

	}

	public void siginInButton() {
		driver.findElement(siginInButton).click();

	}

	public boolean verifyforgetbutton() {

		return driver.findElement(forgetPassword).isDisplayed();
	}

	public boolean verifySignUpbutton() {

		return driver.findElement(SiginUpbtn).isDisplayed();
	}
	
	public void clickSignUpbutton() {

		driver.findElement(SiginUpbtn).click();
	}



}
