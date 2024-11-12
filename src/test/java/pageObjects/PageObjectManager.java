package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public Homepage_PO homepage_po;
	public SelectDescription_PO selectdescribe;
	public studentLogin_PO studentlogin;
	public educatorLogin_PO educatorlogin;
	public instituteLogin_PO institutelogin;
	public studentRegistration_PO studentregister;
	public educatorRegistration_PO educatorregister;
	public courseInformation_PO courseInformation;
	public studentMenu_PO studentmenu;
	public Dashbaord_PO dashbaord;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public Homepage_PO gethomepage() {

		homepage_po = new Homepage_PO(driver);
		return homepage_po;

	}

	public SelectDescription_PO getSelectDescription() {

		selectdescribe = new SelectDescription_PO(driver);
		return selectdescribe;

	}

	public studentLogin_PO studentLogin() {
		if (studentlogin == null) {
			studentlogin = new studentLogin_PO(driver);
		}
		return studentlogin;
	}

	public educatorLogin_PO educatorLogin() {
		if (educatorlogin == null) {
			educatorlogin = new educatorLogin_PO(driver);
		}
		return educatorlogin;
	}

	public instituteLogin_PO instituteLogin() {
		if (institutelogin == null) {
			institutelogin = new instituteLogin_PO(driver);
		}
		return institutelogin;
	}

	public studentRegistration_PO getstudentRegister() {
		if (studentregister == null) {
			studentregister = new studentRegistration_PO(driver);
		}
		return studentregister;
	}

	public educatorRegistration_PO geteducatorRegister() {
		if (educatorregister == null) {
			educatorregister = new educatorRegistration_PO(driver);
		}
		return educatorregister;
	}

	public courseInformation_PO getcourseInformation() {
		if (courseInformation == null) {
			courseInformation = new courseInformation_PO(driver);
		}
		return courseInformation;
	}

	public studentMenu_PO getstudentMenu() {
		if (studentmenu == null) {
			studentmenu = new studentMenu_PO(driver);
		}
		return studentmenu;
	}

	public Dashbaord_PO getDashboard() {
		if (dashbaord == null) {
			dashbaord = new Dashbaord_PO(driver);
		}
		return dashbaord;
	}

	// Dashbaord_PO dashbaord=new Dashbaord_PO();

}
