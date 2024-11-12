package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObjects.studentMenu_PO;
import utils.Variables;

public class Dashbaord_SD {

	Variables variables;

	studentMenu_PO studentmenu;

	public Dashbaord_SD(Variables variables) {

		this.variables = variables;
		this.studentmenu = variables.pageObjectManager.getstudentMenu();
	}
	
	@And("click on Dasboard")
	public void clickOnDashbaord() throws InterruptedException {
		
		studentmenu.clickDashboard();
		Thread.sleep(2000);
		
	}
	
	@Then("check the Enrolled Cousre number")
	public void countEnrolledCourse() {
		
		
		
	}
	

}
