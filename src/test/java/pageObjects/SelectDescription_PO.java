package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDescription_PO {

	public WebDriver driver;

	public SelectDescription_PO(WebDriver driver) {

		this.driver = driver;

	}

	By asStudent=By.xpath("//*[text()='Student']");
	By asTeacher=By.xpath("//*[text()='Teacher']");
	By asInstitute=By.xpath("//*[text()='Educational Institute']");
	
	
	public void clickAsStudent()
	{
		driver.findElement(asStudent).click();
	}
	
	public void clickAsTeacher()
	{
		driver.findElement(asTeacher).click();
	}
	
	public void clickAsInstitute()
	{
		driver.findElement(asInstitute).click();
	}
	
	
	
	

}
