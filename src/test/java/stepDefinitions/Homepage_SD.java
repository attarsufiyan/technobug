package stepDefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Homepage_PO;
import utils.TestBase;
import utils.Variables;

public class Homepage_SD {

	// public WebDriver driver;
	Variables variables;
	Homepage_PO homepage_po;

	public Homepage_SD(Variables variables) {

		this.variables = variables;
		this.homepage_po = variables.pageObjectManager.gethomepage();
	}

	@Given("user will enter the url and land on homepage")
	public void student_will_enter_the_url_and_land_on_homepage() throws IOException {

		variables.driver = TestBase.WebDriverManager();
	}

	@When("user will click on SignIn")
	public void student_will_click_on_sign_in() {

		// Homepage_PO homepage_po = variables.pageObjectManager.gethomepage();
		homepage_po.clickSignIn();

	}

	@Then("verfiy that all the links present on the homepage")
	public void verfiy_that_all_the_links_present_on_the_homepage() throws MalformedURLException, IOException {

		// Homepage_PO homepage_po = variables.pageObjectManager.gethomepage();
		List<WebElement> list = homepage_po.listfooterlinks();

		for (WebElement link : list) {

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

	@Then("^user selects the category (.+)$")

	public void user_select_the_category(String categoryName) {
		homepage_po.catClick(categoryName);

	}

	@Then("^user select the subcategory (.+)$")

	public void user_select_the_subcategory(String SubcategoryName) throws InterruptedException {
		// homepage_po.getCategoryName(SubcategoryName);
		homepage_po.subcatClick(SubcategoryName);
		Thread.sleep(2000);

	}

	@Then("^user will search for course (.+) and click on it.$")
	public void userSearchesForTheCourseAndClicksOnIt(String courseName) throws InterruptedException {
		boolean courseFound = false;
		while (!courseFound) {
			List<WebElement> courses = homepage_po.getCourseList();
			for (WebElement course : courses) {
				if (course.getText().contains(courseName)) {
					course.click();
					courseFound = true;
					break;
				}
			}
			if (!courseFound && homepage_po.isNextPageAvailable()) {
				homepage_po.clickNextPage();
			} else if (!courseFound) {
				break;
			}
		}
		if (!courseFound) {
			throw new RuntimeException("Course not found: " + courseName);
		}
		Thread.sleep(2000);

	}

}
// Then user select the subcategory <subcategory>
