package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class courseInformation_PO {

	public WebDriver driver;

	public courseInformation_PO(WebDriver driver) {

		this.driver = driver;

	}

	By startSubscriptionButton = By.cssSelector(".css-r8u8y9 li:first-child");
	By buythisbutton = By.cssSelector(".css-r8u8y9 li:last-child");
	By Enrollbutton = By.cssSelector(".css-r8u8y9 li:last-child");
	By dropDwon = By.xpath("//button[@id='demo-customized-button']");
	By startLearning=By.xpath("//*[text()='Click here to start learning']");
	By siginInButton = By.xpath("//*[text()='Sign In']");

	public void clickEnrollDropDown() {

		driver.findElement(dropDwon).click();

	}

	public void clickStartSubscription() {

		driver.findElement(startSubscriptionButton).click();
	}

	public void clickBuythisCourse() {

		driver.findElement(buythisbutton).click();
	}
	

	public void clickEnrollbutton() {

		driver.findElement(Enrollbutton).click();
	}
	
	public void clickSiginButton() {

		driver.findElement(siginInButton).click();
		
	}
	
	public void selectOptionFromDropdown(String option) {
		
		
		switch (option.toLowerCase()) {
        case "start subscription":
            clickStartSubscription();
            break;
        case "buy this course":
            clickBuythisCourse();
            break;
        case "enroll":
            clickEnrollbutton();
            break;
        default:
            throw new IllegalArgumentException("Invalid option: " + option);
    }
		
	}
	
	
	
	
	

}
