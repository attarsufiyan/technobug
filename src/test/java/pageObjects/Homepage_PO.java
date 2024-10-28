package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage_PO {

	public WebDriver driver;

	public Homepage_PO(WebDriver driver) {

		this.driver = driver;

	}

	By clickSiginIn = By.cssSelector(".css-1scstjv");
	By footerlinks = By.cssSelector("li[class=\"footer-links__item\"] a");
	By category = By.cssSelector(".css-9ajahe");
	By subcategory = By.cssSelector(".css-9ajahe");
	By courseList = By.cssSelector(".css-1sty9pu strong");
	By nextPage = By.cssSelector("button[title='Go to next page']");

	public void clickSignIn() {

		driver.findElement(clickSiginIn).click();

	}

	public List<WebElement> listfooterlinks() {
		List<WebElement> links = driver.findElements(footerlinks);
		return links;

	}

	public List<WebElement> getCategory() {

		List<WebElement> categoryList = driver.findElements(category);
		return categoryList;

	}

	public WebElement getCategoryName(String Category) {
		WebElement cat = getCategory().stream().filter(categorys -> categorys.getText().equals(Category)).findFirst()
				.orElse(null);
		return cat;
	}

	public void catClick(String Category) {

		WebElement cat = getCategoryName(Category);
		cat.click();
	}

	public List<WebElement> getSubCategory() {

		List<WebElement> categoryList = driver.findElements(category);
		return categoryList;

	}

	public void getSubCategoryName(String SubCategory) {
		WebElement subcat = getSubCategory().stream().filter(subcategorys -> subcategorys.getText().equals(SubCategory))
				.findFirst().orElse(null);

		subcat.click();

	}

	public void subcatClick(String subCategory) {

		WebElement subcat = getCategoryName(subCategory);
		subcat.click();
	}

	public List<WebElement> getCourseList() {
		return driver.findElements(courseList);
	}

	public void clickCourse(String courseName) {
        WebElement course = getCourseName(courseName);
        if (course != null) {
            course.click();
        } else {
            throw new RuntimeException("Course not found: " + courseName);
        }
	}

	public WebElement getCourseName(String courseName) {
		return getCourseList().stream().filter(course -> course.getText().equals(courseName)).findFirst().orElse(null);
	}

	public boolean isNextPageAvailable() {
		return driver.findElements(nextPage).size() > 0;
	}

	public void clickNextPage() {
		driver.findElement(nextPage).click();
	}
	

	// HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();

}
