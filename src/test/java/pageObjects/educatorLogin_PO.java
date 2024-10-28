package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class educatorLogin_PO {

	public WebDriver driver;

	public educatorLogin_PO(WebDriver driver) {

		this.driver = driver;

	}

	By enterEmail = By.xpath("//input[@id='email']");
	By enterPwd = By.xpath("//input[@id='password']");
	By siginInButton = By.xpath("//*[text()='Sign In']");

	By message = By.xpath("//div[@id='notistack-snackbar']");

	public void enterEmail(String email) {
		driver.findElement(enterEmail).sendKeys(email);

	}

	public void enterpassword(String pwd) {
		driver.findElement(enterPwd).sendKeys(pwd);

	}

	public void siginInButton() {
		driver.findElement(siginInButton).click();

	}

}
