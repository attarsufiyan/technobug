package utils;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GenericUtils {

	WebDriver driver;

	public static WebElement waitForElementToBeClickable(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	// Static method to wait for an element to be visible
	public static void visibilityOfElementLocated(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void scrollToBottom(WebDriver driver) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void scrollBy(WebDriver driver, int x, int y) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("window.scrollBy(arguments[0], arguments[1]);", x, y);
	}

	// Method for broken links
	public static void verifybrokenLinks(List<WebElement> lists) throws MalformedURLException, IOException {

		for (WebElement link : lists) {

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println(respCode);
			if (respCode > 400) {

				System.out.println("The link with Text" + link.getText() + "is broken with code" + respCode);
				Assert.assertTrue(false);
			}

		}
	}

	
	public static void actionMethod(WebDriver driver, By locator) {

		Actions actions = new Actions(driver);
		WebElement element = driver.findElement(locator);
		actions.moveToElement(element).perform();

	}
	
	

}
