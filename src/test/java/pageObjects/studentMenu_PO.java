package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class studentMenu_PO {

	public WebDriver driver;

	public studentMenu_PO(WebDriver driver) {

		this.driver = driver;

	}

	By dashboard = By.xpath("//*[text()='Dashboard ']");
	By body = By.tagName("body");
	
	
	
	
	

	public void clickDashboard() {

		driver.findElement(dashboard).click();
		driver.findElement(body).click();
	}

}
